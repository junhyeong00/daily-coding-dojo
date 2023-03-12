function solution(answers) {
        const person1 = [1, 2, 3, 4, 5];
        const person2 = [2, 1, 2, 3, 2, 4, 2, 5];
        const person3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

        const score = [];

        function calcScore(person) {
         return answers.filter((answer, index) => answer === person[index % person.length]).length;
        }

        score[0] = calcScore(person1);
        score[1] = calcScore(person2);
        score[2] = calcScore(person3);

        const maxScore = Math.max(...score);

        const answer = [];

        score.forEach((element, index) => {
            if (element === maxScore) {
            answer.push(index + 1);
            }
        })

        return answer;
        }
