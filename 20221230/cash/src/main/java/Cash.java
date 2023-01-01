import java.util.ArrayList;

public class Cash {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();

        if (cacheSize == 0)
            return cities.length * 5;

        for (int i = 0; i < cities.length; i += 1) {
            cities[i] = cities[i].toUpperCase();
            if (cache.contains(cities[i])) {
                cache.remove(cities[i]);
                cache.add(cities[i]);
                answer += 1;
                continue;
            }

            if (cache.size() == cacheSize) {
                cache.remove(0);
                cache.add(cities[i]);
                answer += 5;
                continue;
            }

            cache.add(cities[i]);
            answer += 5;
        }
        return answer;
    }
}
