import solution, { validate } from './Expression';

test('solution', () => {
  expect(solution(15)).toBe(4);
});

test('validate', () => {
  expect(validate(1, 15)).toBe(true);
  expect(validate(4, 15)).toBe(true);
  expect(validate(7, 15)).toBe(true);
  expect(validate(15, 15)).toBe(true);
  expect(validate(2, 15)).toBe(false);
  expect(validate(3, 15)).toBe(false);
});
