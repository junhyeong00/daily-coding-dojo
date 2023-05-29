export default function solution(n) {
  let answer = 0;
  const board = Array(n).fill(0);
  answer = backTrack(n, board, 0, answer);
  return answer;
}

export function backTrack(n, board, row, answer) {
  if (n === row) {
    answer += 1;
    return answer;
  }

  for (let i = 0; i < n; i += 1) {
    board[row] = i;
    if (isPromising(row, i, board)) {
      answer = backTrack(n, board, row + 1, answer);
    }
  }
  return answer;
}

export function isPromising(x, y, cols) {
  for (let i = 0; i < x; i += 1) {
    if (cols[i] === y || Math.abs(x - i) === Math.abs(y - cols[i])) {
      return false;
    }
  }
  return true;
}
