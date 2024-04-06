import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int distance[][];
    static final int INF = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        distance = new int[N][N];
        for (int i = 0; i < N; i += 1) {
            for (int j = 0; j < N; j += 1) {
                distance[i][j] = INF;

                if (i == j) {
                    distance[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < M; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            distance[start][end] = Math.min(distance[start][end], cost);
        }

        floydWarshall();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i += 1) {
            for (int j = 0; j < N; j += 1) {
                if (distance[i][j] == INF) {
                    distance[i][j] = 0;
                }

                sb.append(distance[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void floydWarshall() {
        for (int k = 0; k < N; k += 1) {
            for (int i = 0; i < N; i += 1) {
                for (int j = 0; j < N; j += 1) {
                    if (distance[i][j] > distance[i][k] + distance[k][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                    }
                }
            }
        }
    }
}
