import solution from './Carpet';

test('solution', () => {
  expect(solution(10, 2)).toBe([4, 3]);
  expect(solution(8, 1)).toBe([3, 3]);
  expect(solution(24, 24)).toBe([8, 6]);
});

test('calsNeededYellow', () => {
  expect(solution(10, 1)).toBe(2);
  expect(solution(8, 1)).toBe(1);
  expect(solution(24, 4)).toBe(24);
});
