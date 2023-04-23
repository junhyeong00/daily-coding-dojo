export function calcNumberAndOrder(index, n) {
  const number = index % n + 1;
  const order = Math.floor(index / n) + 1;
  return [number, order];
}

export default function solution(n, words) {
  const set = new Set();

  set.add(words[0]);

  for (let i = 1; i < words.length; i += 1) {
    if (set.has(words[i])) {
      return calcNumberAndOrder(i, n);
    }
    set.add(words[i]);

    if (words[i - 1][words[i - 1].length - 1] !== words[i][0]) {
      return calcNumberAndOrder(i, n);
    }
  }

  return [0, 0];
}
