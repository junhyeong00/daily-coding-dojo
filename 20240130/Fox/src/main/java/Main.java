import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
    int index;
    int cost;
    int run;

    public Node(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }

    public Node(int index, int cost, int run) {
        this.index = index;
        this.cost = cost;
        this.run = run;
    }

    @Override
    public int compareTo(Node o) {
        return cost - o.cost;
    }
}

public class Main {
    private static ArrayList<ArrayList<Node>> graph;
    public static int INF = Integer.MAX_VALUE;
    private static int N;
    private static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();

        for (int i = 0; i <= N; i += 1) {
            graph.add(new ArrayList<Node>());
        }

        for (int i = 0; i < M; i += 1) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, cost * 2));
            graph.get(b).add(new Node(a, cost * 2));
        }

        int[][] wolfDistance = new int[2][N + 1];
        int[] foxDistance = new int[N + 1];

        for (int i = 0; i <= N; i += 1) {
            wolfDistance[0][i] = INF;
            wolfDistance[1][i] = INF;
            foxDistance[i] = INF;
        }

        wolfDijkstra(1, wolfDistance);
        foxDijkstra(1, foxDistance);

        int foxWinCount = 0;

        for (int i = 2; i <= N; i += 1) {
            if (foxDistance[i] < Math.min(wolfDistance[0][i], wolfDistance[1][i])) {
                foxWinCount += 1;
            }
        }

        System.out.println(foxWinCount);
    }

    private static void wolfDijkstra(int start, int[][] distance) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(start, 0, 0));

        distance[0][start] = 0;

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int run = currentNode.run;

            if (distance[currentNode.run][currentNode.index] < currentNode.cost) {
                continue;
            }

            for (Node nextNode : graph.get(currentNode.index)) {
                int nextCost = nextNode.cost;
                int nextRun = 0;

                if (currentNode.run % 2 == 0) {
                    nextCost /= 2;
                    nextRun = 1;
                } else {
                    nextCost *= 2;
                    nextRun = 0;
                }

                nextCost += distance[run][currentNode.index];

                if (distance[nextRun][nextNode.index] > nextCost) {
                    distance[nextRun][nextNode.index] = nextCost;

                    queue.offer(new Node(nextNode.index,
                            distance[nextRun][nextNode.index],
                            nextRun));
                }
            }
        }
    }

    private static void foxDijkstra(int start, int[] distance) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(start, 0));

        distance[start] = 0;
        boolean[] visited = new boolean[N + 1];

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (visited[currentNode.index]) {
                continue;
            }

            visited[currentNode.index] = true;

            for (Node nextNode : graph.get(currentNode.index)) {
                if (distance[nextNode.index] > distance[currentNode.index] + nextNode.cost) {
                    distance[nextNode.index] = distance[currentNode.index] + nextNode.cost;

                    queue.offer(new Node(nextNode.index,
                            distance[nextNode.index]));
                }
            }
        }
    }
}
