import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node {
    int index;
    int cost;

    public Node(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int start = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

        for (int i = 0; i <= V; i += 1) {
            graph.add(new ArrayList<Node>());
        }

        for (int i = 0; i < E; i += 1) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(from).add(new Node(to, cost));
        }

        int[] distance = new int[V + 1];

        for (int i = 0; i <= V ; i += 1) {
            distance[i] = Integer.MAX_VALUE;
        }

        dijkstra(start, graph, distance);

        for (int i = 1; i < distance.length; i += 1) {
            if (distance[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
                continue;
            }

            System.out.println(distance[i]);
        }
    }

    private static void dijkstra(int start, ArrayList<ArrayList<Node>> graph, int[] distance) {
        PriorityQueue<Node> queue = new PriorityQueue<Node>((o1, o2) -> Integer.compare(o1.cost, o2.cost));
        queue.offer(new Node(start, 0));

        distance[start] = 0;

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            // 목표 정점이 정해져 있을 때 빠르게 탈출하기 위해 사용
//            if (currentNode.index == end) {
//                System.out.println(distance[currentNode.index]);
//                return;
//            }

            if (distance[currentNode.index] < currentNode.cost) {
                continue;
            }

            for (int i = 0; i < graph.get(currentNode.index).size(); i += 1) {
                Node nextNode = graph.get(currentNode.index).get(i);

                if (distance[nextNode.index] > currentNode.cost + nextNode.cost) {
                    distance[nextNode.index] = currentNode.cost + nextNode.cost;
                    queue.offer(new Node(nextNode.index, distance[nextNode.index]));
                }
            }
        }
    }
}
