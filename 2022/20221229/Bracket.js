function calcNextNumber(number) {
  if (number % 2 === 0) {
    return number / 2;
  }

  return (number + 1) / 2;
}

function solution(n, a, b) {
  let round = 1;

  while (a !== b) {
    round += 1;

    a = calcNextNumber(a);

    b = calcNextNumber(b);
  }

  return round;
}
