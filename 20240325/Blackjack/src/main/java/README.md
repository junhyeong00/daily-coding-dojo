## 문제
- 양의 정수로 이루어진 카드로 블랙잭을 함
- 딜러는 n장의 카드를 모두 숫자가 보이도록 바닥에 놓고 숫자 m을 외친다
- 플레이어는 제한된 시간 안에 n장의 카드 중에서 3장을 고름 -> 합이 m을 넘지 않으면서 최대한 가까워야함
- N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력

## 해결
- 완전탐색 -> 시간복잡도가 O(n^3) => 연산 횟수 100^3 = 1000000 => 1억이하기 때문에 가능
  - 단, 최대 합을 구하는 것이기 때문에 합이 m과 동일하면 멈춰도 됨
- 카드를 3장씩 뽑아 완전탐색으로 계산
