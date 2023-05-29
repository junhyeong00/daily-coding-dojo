function GCD(a, b) {
  return b ? GCD(b, a % b) : a;
}

function LCM(a, b) {
  return a * b / GCD(a, b);
}

function solution(arr) {
  let answer = arr[0];

  arr.forEach((number) => {
    answer = LCM(answer, number);
  });
  return answer;
}
