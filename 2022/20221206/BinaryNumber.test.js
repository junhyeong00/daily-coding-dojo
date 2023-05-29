import solution from './BinaryNumber';

test('solution', () => {
  expect(solution('110010101001')).toBe([3, 8]);
  expect(solution('01110')).toBe([3, 3]);
  expect(solution('1111111')).toBe([4, 1]);
});
