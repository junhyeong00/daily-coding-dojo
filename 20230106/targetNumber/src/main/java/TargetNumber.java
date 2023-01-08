public class TargetNumber {
    private int[] numbers;
    private int target;
    private int answer;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return answer;
    }

    private void dfs(int index, int sum) {
        if (numbers.length == index) {
            if (sum == target) {
                answer += 1;
            }
            return;
        }

        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
}
