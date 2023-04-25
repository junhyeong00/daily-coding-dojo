문제(양궁 대회)

라이언과 어피치가 승부를 한다. 이미 어피치가 화살을 모두 쏜 상태에서 라이언이 가장 큰 점수 차이로 이기려면 어떤 과녁에 맞혀야 하는지 구해라

---

1. 이해

- 어피티가 화살 n발을 쐈고(info 배열) 라이언이 이어서 화살 n발을 쏜다.
- 점수는 각 점수별로 더 많이 쏜 사람이 가져간다.(같을 경우 어피치가 가져가며, 둘 다 0이면 아무도 못가져감) 
->  점수를 효율적으로 얻으려면 어피치보다 1개 더 많아야함
- 어떻게 하든 지거나 비기면 [-1]리턴
- 가장 큰 점수 차이로 우승하는 경우가 여러가지라면, 가장 낮은 점수를 더 많이 맞힌 경우를 return

2. 계획
- 백트랙킹을 이용해서 문제풀이
- 라이언이 어피치보다 점수를 더 따내기 전까찌만 반복문 돌리기

3. 실행

4. 반성