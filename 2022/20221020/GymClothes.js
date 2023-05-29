function solution(n, lost, reserve) {
    const students = [...Array(n)].fill(1);

    lost.forEach(element =>  students[element - 1] -= 1);

    reserve.forEach(element => students[element - 1] += 1);

    students.forEach((element, index) => {
        if (element === 0) {
            if (students[index - 1] === 2) {
                students[index] += 1;
                students[index - 1] -= 1;
                return;
            }

            if (students[index + 1] === 2) {
                students[index] += 1;
                students[index + 1] -= 1;
                return;
            }
        }
    })

    return students.filter(element => element >= 1).length;
}
