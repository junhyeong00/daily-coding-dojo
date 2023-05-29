function solution(numbers, hand) {
  numbers = numbers.map((number) => {
    if (number === 0) {
      return 11;
    }
    return number;
  });

  const position = [];
  let leftPosition = 10;
  let rightPosition = 12;

  numbers.forEach((number) => {
    if (number % 3 === 1) {
      leftPosition = number;
      position.push('L');
      return;
    }

    if (number % 3 === 0) {
      rightPosition = number;
      position.push('R');
      return;
    }

    const leftDistance = calculateDistance(leftPosition, number);
    const rightDistance = calculateDistance(rightPosition, number);

    if (leftDistance > rightDistance) {
      rightPosition = number;
      return position.push('R');
    }

    if (leftDistance < rightDistance) {
      leftPosition = number;
      return position.push('L');
    }

    if (leftDistance === rightDistance) {
      if (hand === 'right') {
        rightPosition = number;
        return position.push('R');
      }
      if (hand === 'left') {
        leftPosition = number;
        return position.push('L');
      }
    }
  });
  return position.join('');
}

const calculateDistance = (position, targetPosition) => {
  let count = 0;

  while (position !== targetPosition) {
    if (position + 1 === targetPosition || position - 1 === targetPosition) {
      count += 1;
      return count;
    }

    if (position > targetPosition) {
      position -= 3;
      count += 1;
      continue;
    }

    if (position < targetPosition) {
      position += 3;
      count += 1;
      continue;
    }
  }
  return count;
};
