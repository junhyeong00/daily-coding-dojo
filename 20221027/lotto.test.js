import solution, { calcRanking, getMatchedCount, getZeroCount } from './lotto';

test('getZeroCount', () => {
  expect(getZeroCount([44, 1, 0, 0, 31, 25])).toBe(2);
  expect(getZeroCount([0, 0, 0, 0, 0, 0])).toBe(6);
  expect(getZeroCount([45, 4, 35, 20, 3, 9])).toBe(0);
});

test('getMatchedCount', () => {
  expect(getMatchedCount([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])).toBe(2);
  expect(getMatchedCount([0, 0, 0, 0, 0, 0], [38, 19, 20, 40, 15, 25])).toBe(0);
  expect(getMatchedCount([45, 4, 35, 20, 3, 9], [20, 9, 3, 45, 4, 35])).toBe(6);
});

test('calcRanking', () => {
  expect(calcRanking(0)).toBe(6);
  expect(calcRanking(1)).toBe(6);
  expect(calcRanking(2)).toBe(5);
  expect(calcRanking(3)).toBe(4);
  expect(calcRanking(4)).toBe(3);
  expect(calcRanking(5)).toBe(2);
  expect(calcRanking(6)).toBe(1);
});

test('solution', () => {
  expect(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])).toEqual([3, 5]);
  expect(solution([0, 0, 0, 0, 0, 0], [38, 19, 20, 40, 15, 25])).toEqual([1, 6]);
  expect(solution([45, 4, 35, 20, 3, 9], [20, 9, 3, 45, 4, 35])).toEqual([1, 1]);
});
