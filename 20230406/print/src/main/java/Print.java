import java.util.LinkedList;
import java.util.Queue;

public class Print {
    class Task {
        int location;
        int priority;

        public Task(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Task> queue = new LinkedList<>();

        for (int i = 0; i <priorities.length; i += 1) {
            queue.add(new Task(i, priorities[i]));
        }

        while (!queue.isEmpty()) {
            Task currentTask = queue.poll();

            boolean subordinated = false;

            for(Task task : queue) {
                if (task.priority > currentTask.priority) {
                    subordinated = true;
                    break;
                }
            }

            if (subordinated) {
                queue.add(currentTask);
                continue;
            }

            answer += 1;

            if (currentTask.location == location) {
                return answer;
            }
        }

        return answer;
    }
}
