문제(귤 고르기)

경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다. 
경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.

---

1. 이해
- 1 ≤ k ≤ tangerine의 길이 ≤ 100,000
- 1 ≤ tangerine의 원소 ≤ 10,000,000
- k개 만큼 담을 때, tangerine에서 숫자별로 제일 많은 수부터 넣어야한다

2. 계획
- tangerine을 hashmap을 이용해 size 별 개수를 파악한다.
- 제일 많은 수부터 들어갈 수 있는 양을 파악한다.
- 종류를 확인한다.

3. 실행
- 

4. 반성
- hashMap의 초기값이 없을 경우 nullPointerException이 발생한다. -> getOrDefault을 이용해 기본값을 넣어줄 수 있다.