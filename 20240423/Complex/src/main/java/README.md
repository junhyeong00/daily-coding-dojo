## 문제
- 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳
- 연결된 집의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다.
- 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬

## 해결
- dfs로 상하좌우를 확인해 연결된 집 개수 파악
- list에 각 개수를 저장하고 정렬
