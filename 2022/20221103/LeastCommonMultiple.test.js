import solution, { GCD, LCM } from './LeastCommonMultiple';

test('solution', () => {
  expect(solution([2, 6, 8, 14])).toBe(168);
  expect(solution([1, 2, 3])).toBe(6);
});

test('LCM', () => {
  expect(LCM(2, 3)).toBe(6);
  expect(LCM(3, 4)).toBe(12);
});

test('GCD', () => {
  expect(GCD(1, 2)).toBe(1);
  expect(GCD(2, 6)).toBe(2);
});
