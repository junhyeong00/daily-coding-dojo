function solution(people, limit) {
  let answer = 0;
  let first = 0;
  let last = people.length - 1;

  people.sort((a, b) => b - a);

  while (first <= last) {
    if (people[first] + people[last] <= limit) {
      last -= 1;
    }
    first += 1;
    answer += 1;
  }

  return answer;
}
