public class Solution {
    public int solution(int n, int[][] computers) {
        int network = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i += 1) {
            if (!check[i]) {
                network += 1;

                dfs(computers, i, check);
            }
        }

        return network;
    }

    public void dfs(int[][] computers, int i, boolean[] check) {
        check[i] = true;

        for (int j = 0; j < computers.length; j += 1) {
            if (i != j && computers[i][j] == 1 && !check[j]) {
                dfs(computers, j, check);
            }
        }
    }
}
