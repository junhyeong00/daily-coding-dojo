문제(N개의 최소공배수)

n개의 수들의 최소공배수 구하기
---

1. 이해

- 주어진 n개의 숫자들을 2개씩 비교해서 최소공배수를 구해야한다.
- 예전에 2개의 최소공배수를 구했던 문제를 토대로 풀어보자
- 어제 찾아보니 재귀함수로도 풀 수 있었다.

2. 계획

- 2개의 값으로 최소공배수를 구하는 메소드를 만든다.
- 위의 메소드를 이용해서 최종적으로 하나의 최소공배수가 나올 때까지 반복한다. 
- 배열이 1개일 때는 그 값이 답이되도록 한다.

3. 실행

4. 반성

- reduce를 이용하면 let을 이용하지 않고도 풀 수 있었다. 
```
function nlcm(num) {
 return num.reduce((a,b) => a*b / gcd(a,b))  
}

function gcd(a, b) {
  return a % b ? gcd(b, a%b) : b
}
```
