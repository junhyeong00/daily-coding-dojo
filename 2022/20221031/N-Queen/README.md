문제(N-Queen)

가로, 세로 길이가 n인 정사각형으로된 체스판이 있다. 이 때 n개의 퀸이 서로를 공격하지 못하는 위치의 경우의 수

---

1. 이해

- 가로, 세로 길이가 같은 정사각형
- 일단 공격이 불가능하려면 가로, 세로, 대각선으로 같은 줄에 있으면 안된다.

2. 계획

- 공격이 불가능한 경우의 수를 구해서 모두 더해준다
- 같은 열에 있는 경우를 구한다
- 같은 행에 있는 경우를 구한다
- 같은 대각선에 있는 경우를 구한다. (행과 열 번호가 같은 경우)

3. 실행

4. 반성

- 너무 안풀려서 검색해서 따라쳤다. backTracking에대해 공부해보자
