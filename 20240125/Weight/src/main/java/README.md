## 문제
- n개의 섬이 있다. 몇 개의 섬 사이에는 다리가 있어서 차들이 다닐 수 있다
- 두 개의 섬에 공장을 세워 두고 물품을 생산하는 일을 하고 있다. 
- 생산을 하다보면 다른 공장으로 물품을 수송할 일이 생기는데 다리의 중량제한을 지켜야한다
- 한 번의 이동으로 옮길 수 있는 물품들의 중량의 최댓값을 구하시오
## 계획
- 다리 클래스를 만들어서 다리관리
- 이분탐색을 이용해 다리의 0에서 다리 최대 중량으로 비교
  - bfs를 이용해 중간값이 가능한지 확인