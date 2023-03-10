function solution(array, commands) {
        return commands.map(command => {
            return array.slice(command[0] - 1, command[1])
                .sort((a,b) => a - b)
                .find((e, index) => (index + 1) === command[2]);
            }
        );
        }
