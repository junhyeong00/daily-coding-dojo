export function validate(number, n) {
  let accumulate = 0;

  if (number === n) {
    return true;
  }

  for (let i = number; i <= n; i += 1) {
    if (accumulate === n) {
      return true;
    }

    if (accumulate > n) {
      return false;
    }

    accumulate += i;
  }

  return false;
}

export default function solution(n) {
//   const answer = Array(n).fill(0).map((element, index) => index + 1)
//     .reduce((acc, number) => {
//       if (validate(number, n)) {
//         return acc + 1;
//       }

  //       return acc;
  //     });

  let answer = 0;

  for (let i = 1; i <= n; i += 1) {
    if (validate(i, n)) {
      answer += 1;
    }
  }

  return answer;
}
