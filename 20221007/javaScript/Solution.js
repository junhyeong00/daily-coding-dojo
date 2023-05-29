function solution(s, n) {
        const ch = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz" +
        "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ                                    ";
        return s.split('').map(i => ch[ch.indexOf(i) + n]).join('');
        }
