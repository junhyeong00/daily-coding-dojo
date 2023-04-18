public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = -1;

        for (String cur : skill_trees) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < cur.length(); i += 1) {
                if (skill.contains(cur.charAt(i) + ""))
                    sb.append(cur.charAt(i));
            }

            answer += skill.indexOf(sb.toString())==0 ? 1 : 0;
        }

        return answer;
    }
}
