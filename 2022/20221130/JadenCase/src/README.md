문제(JadenCase 문자열 만들기)

문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수를 완성하라
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열이다
( 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자)

---

1. 이해
- 숫자로만 이루어진 단어는 없다.
- 공백문자를 기준으로 잘라서 확인해야한다.
- 단어의 첫글자만 대문자로 바꾸고 나머지는 소문자로 바꿔야한다
- 첫글자가 숫자일 경우는 모두 소문자로 바꾼다.

2. 계획
- 배열을 공백기준으로 잘라준다(split)
- 단어의 첫글자만 대문자로 바꾸고, 나머지는 소문자로 바꿔준다
- 단어의 첫글자가 숫자일 경우 예외처리를 해준다
- join을 이용해 합쳐준다.

3. 실행

4. 반성
- 기존 테스트케이스 뿐만 아니라 다른 유형의 케이스를 내가 만들어서 테스트해야한다