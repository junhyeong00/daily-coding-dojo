function solution(n)
        {
        let sum = 0;

        n.toString().split("").map(n => sum += parseInt(n));

        return sum;
        }
