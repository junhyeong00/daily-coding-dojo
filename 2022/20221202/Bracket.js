export default function solution(s) {
  if (s[0] === ')') {
    return false;
  }

  let count = 0;

  for (const word of s) {
    count += word === '(' ? 1 : -1;

    if (count < 0) {
      return false;
    }
  }
  return count === 0;
}
