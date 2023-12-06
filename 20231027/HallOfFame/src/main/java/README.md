## 문제
- "명예의 전당"에서는 매일 1명의 가수가 노래를 부르고, 시청자들의 문자
투표수로  가수에게 점수를 부여
- 출연한 가수의 점수가 지금까지 출열 가수들의 점수 중 상위 k번째 이내이면 해당 가수의 점수를 명예의 전당으로 올림
- (프로그램 초기에 k일까지는 모든 가수가 전당에 오름)

- 명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 매일 발표된 명예의 전당의 최하위 점수를 return

## 계획
- 점수 배열을 돌면서 명예의 전당 목록 개수(k개)까지만 가지고 있으면 된다.
- 명예의 전당 목록을 계속 정렬시켜야한다. -> 우선순위 큐
- 점수를 확인하여 제일 낮은 점수를 따로 배열에 저장한다. 
1. 일일 최하점 점수 배열 생성 -> score length(일 수)만큼 
2. 우선순위 큐 생성(명예의 전당 목록)
3. 점수 배열을 돌면서 큐에 상위 k개까지의 점수만 남게함 
4. 전당의 최하위 점수 배열에 전당 배열의 최하위 점수 저장