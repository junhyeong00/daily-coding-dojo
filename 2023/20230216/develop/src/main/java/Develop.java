import java.util.ArrayList;
import java.util.List;

public class Develop {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int deployCount = 0;

        //해결해야 되는것 : 중간에 100 안넘는 진도율이 생기면 루프를 다시 돌려야함
        while (deployCount != progresses.length) {
            int completionDate = getCompletionDate(progresses[deployCount], speeds[deployCount]); // 날짜 구함

            int count = 0;

            for (int i = deployCount; i < progresses.length; i += 1) {
                int progress = getProgress(progresses[i], speeds[i], completionDate);

                if (progress < 100) {
                    break;
                }

                count += 1;
            }

            for (int i = deployCount; i < progresses.length; i += 1) {
                int progress = getProgress(progresses[i], speeds[i], completionDate);
                progresses[i] = progress;
            }

            answer.add(count);

            deployCount += count;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public int getCompletionDate(int progress, int speed) {
        return (100 - progress) % speed == 0
                ? (100 - progress) / speed
                : (100 - progress) / speed + 1;
    }

    public int getProgress(int progress, int speed, int day) {
        return progress + speed * day;
    }

    public int deploy(int[] progresses, int[] speeds) {
        return 0;
    }
}
