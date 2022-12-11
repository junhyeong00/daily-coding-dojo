function solution(n) {
  const oneNum = n.toString(2).split('1').length;

  while (true) {
    n += 1;

    if (n.toString(2).split('1').length === oneNum) {
      return n;
    }
  }
}
