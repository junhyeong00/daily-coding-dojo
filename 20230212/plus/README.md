문제(두 개 뽑아서 더하기)

정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수
있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

---

1. 이해
- numbers의 길이: 2 이상 100 이하
- numbers의 모든 수는 0 이상 100 이하

2. 계획
- set을 이용하여 더해진 숫자를 저장한다(중복방지)

3. 실행
- 

4. 반성
- HashSet이 아닌 TreeSet을 사용하면 add하면서 정렬도 같이 할 수 있다.