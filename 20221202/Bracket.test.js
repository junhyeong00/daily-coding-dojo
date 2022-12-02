import solution from './Bracket';

test('Bracket', () => {
  expect(solution('()()')).toBe(true);
  expect(solution('(())()')).toBe(true);
  expect(solution(')()(')).toBe(false);
  expect(solution('(()(')).toBe(false);
  expect(solution('())(()')).toBe(false);
});
