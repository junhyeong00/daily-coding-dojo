export function GCD(a, b) {
  return a % b ? GCD(b, a % b) : b;
}

export function LCM(a, b) {
  return a * b / GCD(a, b);
}

export default function solution(arr) {
  let answer = arr[0];

  arr.forEach((number) => {
    answer = LCM(answer, number);
  });
  return answer;
}
