## 문제
- 바이러스의 확산을 막기 위해 연구소에 벽을 세우려고 함
  - 연구소 크기는 n X m 
  - 바이러스는 상하좌우로 인접한 빈 칸으로 모두 퍼져나갈 수 있음
  - 새로 세울 수 있는 벽 개수는 3개이며, 무조건 3개를 세워야함
  - 0은 빈칸, 1은 벽, 2는 바이러스
  - 아무런 벽을 세우지 않는다면, 바이러스는 모든 빈 칸으로 퍼져나감
- 바이러스가 퍼질 성 없는 곳을 안전 영역이라고 할때, 안전 영역 크기의 최댓값을 구하는 프로그램 작성

## 계획
- 벽 3개를 세울 수 있는 모든 경우의 수를 만든다
- bfs로 바이러스를 퍼트린다 -> bfs를 진행할 때 map을 새로 만들어야함 -> dfs가 끝날 때마다 원래대로 돌려놓기 때문
- 안전 영역 크기를 구한다