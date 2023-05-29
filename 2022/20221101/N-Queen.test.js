import solution, { backTrack, isPromising } from './N-Queen';

test('Solution', () => {
  expect(solution(4)).toBe(2);
});

test('backTrack', () => {
  expect(backTrack(4, Array(4), 0, 0)).toBe(2);
});

test('isPromising', () => {
  expect(isPromising(0, Array(4))).toBe(true);
});
