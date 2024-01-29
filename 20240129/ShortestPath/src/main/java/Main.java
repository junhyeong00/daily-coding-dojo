import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
    int index;
    int cost;

    public Node(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return cost - o.cost;
    }
}

public class Main {
    static final int INF = 200_000_000;

    private static ArrayList<ArrayList<Node>> graph;
    private static int[] distance;

    private static int N;
    private static int E;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        graph = new ArrayList<ArrayList<Node>>();

        for (int i = 0; i <= N; i += 1) {
            graph.add(new ArrayList<Node>());
        }

        for (int i = 0; i < E; i += 1) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, cost));
            graph.get(b).add(new Node(a, cost));
        }

        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        distance = new int[N + 1];

        int result1 = 0;
        result1 += dijkstra(1, v1);
        result1 += dijkstra(v1, v2);
        result1 += dijkstra(v2, N);

        int result2 = 0;
        result2 += dijkstra(1, v2);
        result2 += dijkstra(v2, v1);
        result2 += dijkstra(v1, N);

        int answer = (result1 >= INF && result2 >= INF)
                ? -1 : Math.min(result1, result2);

        System.out.println(answer);
    }

    private static int dijkstra(int start, int end) {
        Arrays.fill(distance, INF);
        boolean[] visited = new boolean[N + 1];

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(start, 0));
        distance[start] = 0;

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int current = currentNode.index;

            if (current == end) {
                return distance[end];
            }

            if (visited[current]) {
                continue;
            }

            visited[current] = true;

            for (Node nextNode : graph.get(current)) {
                if (!visited[nextNode.index] &&
                        distance[nextNode.index] > distance[current] + nextNode.cost) {
                    distance[nextNode.index] = distance[current] + nextNode.cost;
                    queue.offer(new Node(nextNode.index, distance[nextNode.index]));
                }
            }
        }

        return distance[end];
    }
}
