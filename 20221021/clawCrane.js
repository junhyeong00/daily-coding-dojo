function solution(board, moves) {
    const basket = [];
    
    let answer = 0;
    
    moves.forEach((order) => {
        const doll = pickup(board, order - 1);
        
        if (doll) {
            if (basket[basket.length - 1] === doll) {
                basket.pop();

                answer += 2;
                return;
            }

            basket.push(doll);
            return;
        }
    })
    return answer;
}

function pickup(board, order) {
   for(let i = 0; i < board.length ; i++){
        if(board[i][order] !== 0){
            const doll = board[i][order];
            board[i][order]= 0;
            return doll;
        }
    }
}
