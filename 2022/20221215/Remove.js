export default function solution(s) {
  const stack = [];

  for (let i = 0; i < s.length; i += 1) {
    const b = s.charAt(i);
    if (stack[stack.length - 1] === b) {
      stack.pop();
    } else {
      stack.push(b);
    }
  }

  return stack.length > 0 ? 0 : 1;
}
