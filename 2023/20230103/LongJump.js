export default function solution(n) {
  const dp = [];
  dp[1] = 1;
  dp[2] = 2;

  for (let i = 3; i <= 2000; i += 1) {
    dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
  }

  return dp[n];
}
