function solution(answers) {
        const person1 = [1, 2, 3, 4, 5];
        const person2 = [2, 1, 2, 3, 2, 4, 2, 5];
        const person3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

        const score = [];

        score[0] = answers.filter((answer, index) => answer === person1[index % person1.length]).length;
        score[1] = answers.filter((answer, index) => answer === person2[index % person2.length]).length;
        score[2] = answers.filter((answer, index) => answer === person3[index % person3.length]).length;

        const maxScore = Math.max(...score);

        const answer = [];

        score.forEach((element, index) => {
            if (element === maxScore) {
            answer.push(index + 1);
            }
        })

        return answer;
        }
