export function calsNeededYellow(brown, i) {
  return (brown / 2 - i - 2) * i;
}

export default function solution(brown, yellow) {
  const answer = [];

  for (let i = 1; i < brown; i += 1) {
    if (yellow === calsNeededYellow(brown, i)) {
      answer[0] = brown / 2 - i;
      answer[1] = i + 2;
      return answer;
    }
  }
  return answer;
}
