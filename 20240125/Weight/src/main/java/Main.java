import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static List<Bridge>[] bridges;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int islandCount = Integer.parseInt(st.nextToken());
        int bridgeCount = Integer.parseInt(st.nextToken());

        bridges = new ArrayList[islandCount + 1];

        for (int i = 1; i <= islandCount; i += 1) {
            bridges[i] = new ArrayList<>();
        }

        int left = 0;
        int right = 0;

        for (int i = 0; i < bridgeCount; i += 1) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            bridges[a].add(new Bridge(b, weight));
            bridges[b].add(new Bridge(a, weight));
            right = Math.max(right, weight);
        }

        st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        while (left <= right) {
            int mid = (left + right) / 2;
            visited = new boolean[islandCount + 1];

            if (bfs(from, to, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(right);
    }

    private static boolean bfs(int from, int to, int mid) {
        Queue<Integer> q = new LinkedList<>();
        q.add(from);
        visited[from] = true;

        while (!q.isEmpty()) {
            int island = q.poll();

            if (island == to) {
                return true;
            }

            for (Bridge i : bridges[island]) {
                if (!visited[i.destination] && mid <= i.weight) {
                    visited[i.destination] = true;
                    q.add(i.destination);
                }
            }
        }

        return false;
    }
}

class Bridge {
    int destination;
    int weight;

    public Bridge(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}