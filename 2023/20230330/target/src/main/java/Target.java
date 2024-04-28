public class Target {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return answer;
    }

    public void dfs(int[] number, int depth, int target, int sum) {
        if (depth == number.length) {
            if (target == sum) {
                answer += 1;
            }

            return;
        }

        dfs(number, depth + 1, target, sum + number[depth]);
        dfs(number, depth + 1, target, sum - number[depth]);
    }
}
