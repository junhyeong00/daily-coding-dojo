public class Solution {
    public final static int[] DISCOUNT_RATE = {10, 20, 30, 40};
    public int totalSubscriberNumber = 0;
    public int totalSales = 0;

    public int[] solution(int[][] users, int[] emoticons) {
        int[] discounts = new int[emoticons.length];
        recursive(discounts, users, emoticons, 0);

        return new int[] {totalSubscriberNumber, totalSales};
    }

    private void recursive(int[] discounts, int[][] users, int[] emoticons, int emoticonIndex) {
        if (emoticonIndex == emoticons.length) {
            calculate(users, emoticons, discounts);
            return;
        }

        for (int i = 0; i < DISCOUNT_RATE.length; i += 1) {
            discounts[emoticonIndex] = DISCOUNT_RATE[i];
            recursive(discounts, users, emoticons, emoticonIndex + 1);
        }
    }

    private void calculate(int[][] users, int[] emoticons, int[] discounts) {
        int subscriberNumber = 0;
        int discountedPriceSum = 0;

        for (int[] user : users) {
            int userMinDiscount = user[0];
            int userMaxPay = user[1];
            int userDiscountedPriceSum = 0;

            for (int i = 0; i < discounts.length; i+= 1) {
                if (discounts[i] < userMinDiscount) {
                    continue;
                }

                userDiscountedPriceSum += getDiscountedPrice(emoticons[i], discounts[i]);
            }

            if (userMaxPay <= userDiscountedPriceSum) {
                subscriberNumber += 1;
                continue;
            }
            discountedPriceSum += userDiscountedPriceSum;
        }

        if (totalSubscriberNumber < subscriberNumber) {
            totalSubscriberNumber = subscriberNumber;
            totalSales = discountedPriceSum;
            return;
        }

        if (totalSubscriberNumber == subscriberNumber && totalSales < discountedPriceSum) {
            totalSales = discountedPriceSum;
        }
    }

    private int getDiscountedPrice(int price, int discountRate) {
        return price / 100 * (100 - discountRate);
    }
}
