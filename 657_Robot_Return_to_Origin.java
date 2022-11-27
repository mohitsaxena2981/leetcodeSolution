class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        char move[]=moves.toCharArray();
        for (int z=0;z<move.length;z++) {
            if (move[z]== 'U') y++;
            if (move[z]== 'D') y--;
            if (move[z]== 'L') x--;
            if (move[z]== 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
