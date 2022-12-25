function solution(msg) {
  const answer = [];
  const dictionary = [''].concat([...Array(26).keys()].map((v) => String.fromCharCode(v + 65)));
  let character = '';

  while (msg.length) {
    for (let i = dictionary.length - 1; i > 0; i--) {
      character = dictionary[i];

      if (new RegExp(`^${character}`).test(msg)) {
        dictionary.push(character + msg[character.length]);
        msg = msg.substr(character.length);
        answer.push(i);
        break;
      }
    }
  }

  return answer;
}
