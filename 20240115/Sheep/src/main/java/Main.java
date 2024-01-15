import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Island {
    int wolfCount;
    int sheepCount;
    int nextBridgeIndex;

    public Island(int wolfCount, int sheepCount, int nextBridgeIndex) {
        this.wolfCount = wolfCount;
        this.sheepCount = sheepCount;
        this.nextBridgeIndex = nextBridgeIndex;
    }
}

public class Main {
    private static int n;

    private static int result = 0;

    private static List<Island> islands;

    private static final String WOLF = "W";
    private static final String SHEEP = "S";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        islands = new ArrayList<>();

        for (int i = 0; i < n - 1; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int wolfCount = 0;
            int sheepCount = 0;

            String type = st.nextToken();

            if (type.equals(WOLF)) {
                wolfCount += Integer.parseInt(st.nextToken());
            }

            if (type.equals(SHEEP)) {
                sheepCount += Integer.parseInt(st.nextToken());
            }

            int nextBridgeIndex = Integer.parseInt(st.nextToken()) - 2;

            Island island = new Island(wolfCount, sheepCount, nextBridgeIndex);

            islands.add(island);
        }

        for (int i = islands.size() - 1; i >= 0 ; i -= 1) {
            if (islands.get(i).sheepCount > 0) {
                dfs(i);
            }
        }

        System.out.println(result);
    }

    public static void dfs(int index) {
        System.out.println(1);
        Island currentIsland = islands.get(index);
        int nextIndex = currentIsland.nextBridgeIndex;

        if (nextIndex == -1) {
            result += currentIsland.sheepCount;
            currentIsland.sheepCount = 0;
            return;
        }

        Island nextIsland = islands.get(nextIndex);

        int survivedSheepCount = currentIsland.sheepCount - nextIsland.wolfCount;
        currentIsland.sheepCount = 0;

        if (survivedSheepCount > 0) {
            nextIsland.sheepCount += survivedSheepCount;
            dfs(nextIndex);
        }
    }
}
