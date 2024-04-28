function solution(s) {
  let answer = checkBracket(s) ? 1 : 0;
  let result = '';
  for (let i = 1; i < s.length; i += 1) {
    result = s.slice(i) + s.slice(0, i);
    if (checkBracket(result)) answer += 1;
  }
  return answer;
}

function checkBracket(s) {
  const bracket = {
    ')': '(',
    '}': '{',
    ']': '[',
  };
  const stack = [];
  for (let i = 0; i < s.length; i += 1) {
    if (s[i] === '(' || s[i] === '{' || s[i] === '[') stack.push(s[i]);
    else if (stack[stack.length - 1] === bracket[s[i]]) stack.pop();
    else return false;
  }
  return !stack.length;
}
