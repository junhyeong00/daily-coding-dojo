## 문제
- n x m 크기의 모눈종이에 얇은 치즈가 있다
- 치즈는 냉동 보관을 해야만 하는데 실내에 두면 공기와 접촉하여 천천히 녹는다
- 각 치즈 격자의 4변 중에서 적어도 2변 이상이 실내온도 공기와 접촉한 것은 정확히 한시간만에 녹아 없어져 버린다
  - 치즈 내부에 있는 공간은 치즈 외부공기와 접촉하지 않는것으로 가정한다.
  - 모눈종이의 맨 가장자리에는 치즈가 놓이지 않는 것으로 가정한다
- 입력으로 주어진 치즈가 모두 녹아 없어지는데 걸리는 정확한 시간을 구하는 프로그램을 작성

## 계획
- bfs를 시간마다 돌려서 치즈를 녹인다
  - 가장자리에 치즈가 없으니 0,0 부터 시작한다
  - 치즈가 없는 공기부분에서 상하좌우로 이동
  - 치즈가 있다면 현재자리에 한면이 공기와 닿아있음을 알리기 위해 공기 air 1추가
  - 치즈가 없고 왔다가지 안았으면(0) 방문처리(-1)하고 queue에 삽입
- 치즈가 다 녹을 때까지 반복
