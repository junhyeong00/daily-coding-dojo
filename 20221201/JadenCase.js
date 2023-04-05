export function changeJadenCase(word) {
  const firstWord = word.substring(0, 1).toUpperCase();
  const otherWord = word.substring(1).toLowerCase();

  return firstWord + otherWord;
}

export default function solution(s) {
  return s.split(' ').map((word) => changeJadenCase(word))
    .join(' ');
}
