function solution(citations) {
  citations.sort((a, b) => b - a);

  return citations.reduce((acc, citation, index) => {
    if (citation >= index + 1) {
      return acc + 1;
    }

    return acc;
  }, 0);
}
