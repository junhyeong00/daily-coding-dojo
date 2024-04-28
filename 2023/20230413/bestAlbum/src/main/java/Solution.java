import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    class Music {
        String genre;
        int play;
        int index;

        public Music(String genre, int play, int index) {
            this.genre = genre;
            this.play = play;
            this.index = index;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        List<String> genres_ordered = getOrdered(genres, plays);

        List<Music> bestAlbum = getBestAlbum(genres, plays, genres_ordered);

        int[] answer = getMusicIndex(bestAlbum);

        return answer;
    }

    public List<String> getOrdered(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < genres.length; i += 1) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> genres_ordered = new ArrayList<>(map.keySet());

        genres_ordered.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        return genres_ordered;
    }

    public List<Music> getBestAlbum(String[] genres, int[] plays, List<String> genres_ordered) {
        List<Music> bestAlbum = new ArrayList<>();

        for (String genre : genres_ordered) {
            List<Music> list = new ArrayList<>();

            for (int i = 0; i < genres.length; i += 1) {
                if (genres[i].equals(genre)) {
                    list.add(new Music(genre, plays[i], i));
                }
            }

            list.sort((o1, o2) -> o2.play - o1.play);

            bestAlbum.add(list.get(0));

            if (list.size() != 1) {
                bestAlbum.add(list.get(1));
            }
        }

        return bestAlbum;
    }

    public int[] getMusicIndex(List<Music> bestAlbum) {
        int[] answer = new int[bestAlbum.size()];

        for (int i = 0; i < bestAlbum.size(); i += 1) {
            answer[i] = bestAlbum.get(i).index;
        }

        return answer;
    }
}
