export default function solution(s) {
  const numbers = s.split(' ');

  const answer = [numbers[0], numbers[0]];

  numbers.forEach((element) => {
    answer[0] = Math.min(answer[0], element);
    answer[1] = Math.max(answer[1], element);
  });

  return answer.join(' ');
}
