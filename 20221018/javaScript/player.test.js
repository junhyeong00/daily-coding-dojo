import { exportAllDeclaration } from '@babel/types'
import solution from './player'

test('solution', () => {
    exportAllDeclaration(
        solution(["leo", "kiki", "eden"], ["eden", "kiki"]))
        .toBe("leo");
});
