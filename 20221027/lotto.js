export default function solution(lottos, win_nums) {
  const zeroCount = getZeroCount(lottos);
  const matchedCount = getMatchedCount(lottos, win_nums);

  const max = matchedCount + zeroCount;
  const min = matchedCount;

  return [calcWinning(max), calcWinning(min)];
}

export function getZeroCount(lottos) {
  return lottos.filter((element) => element === 0).length;
}

export function getMatchedCount(lottos, win_nums) {
  return lottos.filter((element) => (
    win_nums.find((e) => element === e))).length;
}

export function calcWinning(number) {
  return number ? 7 - number : 6;
}
