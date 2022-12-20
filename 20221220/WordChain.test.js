import solution, { calcNumberAndOrder } from './WordChain';

test('solution', () => {
  expect(solution(3, ['tank', 'kick', 'know', 'wheel',
    'land', 'dream', 'mother', 'robot', 'tank'])).toEqual([3, 3]);

  expect(solution(5, ['hello', 'observe', 'effect', 'take', 'either',
    'recognize', 'encourage', 'ensure', 'establish', 'hang', 'gather',
    'refer', 'reference', 'estimate', 'executive'])).toEqual([0, 0]);

  expect(solution(2, ['hello', 'one', 'even', 'never', 'now', 'world', 'draw']))
    .toEqual([1, 3]);
});

test('calcNumberAndOrder', () => {
  expect(calcNumberAndOrder(8, 3)).toEqual([3, 3]);
  expect(calcNumberAndOrder(4, 2)).toEqual([1, 3]);
});
