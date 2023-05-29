export default function solution(s) {
  const answer = Array(2).fill(0);

  while (s !== '1') {
    const removed = s.replace(/0/g, '');

    answer[1] += s.length - removed.length;

    s = removed.length.toString(2);
    answer[0] += 1;
  }
  return answer;
}
