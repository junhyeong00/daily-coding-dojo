## 문제
- 정수 숫자 카드 n개를 가지고 있다. 정수 m개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 가지고 있는지 구하라
- 가지고 있으면 1, 아니면 0
## 계획
- 이분탐색 이용
  - M개의 확인에 대해서 N개의 카드를 전부 확인하는 선형탐색을 사용하면 시간복잡도가 ON(MN) -> 시간초과
  - 따라서 시간복잡도가 O(logN)인 이분탐색을 사용해서 O(MlogN)만큼 줄인다
