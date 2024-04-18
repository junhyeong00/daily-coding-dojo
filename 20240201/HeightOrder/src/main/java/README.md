## 문제
- n명의 학생이 있음. 학생들의 키는 모두 다름
- 학생 두명의 키를 비교한 결과의 일부가 주어
- 학생들의 키를 비교한 결과가 주어질 때, 자신의 키가 몇 번째인지 알 수 있는 학생들이 모두 몇 명인지 계산하여 출력

## 계획
- 플로이드 와샬을 이용해 문제를 푼다
- 등수를 매길 수 없는 경우는 서로가 연결되어 있지 않은 경우이다(역방향 포함)
- 따라서 각 노드가 모든 점들과 연결되어 있는지 체크해주면 답을 구할 수 있다 
- -> 모든 정점에서 모든 정점으로 탐색하는 플로이드와샬 이용