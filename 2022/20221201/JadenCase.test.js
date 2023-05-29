import solution, { changeJadenCase } from './JadenCase';

test('solution', () => {
  expect(solution('3people unFollowed me')).toBe('3people Unfollowed Me');
  expect(solution('for the last week')).toBe('For The Last Week');
  expect(solution('for the  last week')).toBe('For The  Last Week');
  expect(solution(' for the last week ')).toBe(' For The Last Week ');
});

test('changeJadenCase', () => {
  expect(changeJadenCase('3people')).toBe('3people');
  expect(changeJadenCase('unFollowed')).toBe('Unfollowed');
  expect(changeJadenCase('me')).toBe('Me');
  expect(changeJadenCase(' ')).toBe(' ');
  expect(changeJadenCase('  ')).toBe('  ');
});
