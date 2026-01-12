package org.example;

import java.util.*;
class Solution13 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int move : moves){
            int col = move-1;

            for(int row=0; row<board.length; row++){

                int push = board[row][col];
                if(push==0)
                    continue;
                board[row][col]=0;

                if(!stack.isEmpty()&&stack.peek()==push)
                {
                    stack.pop();
                    answer+=2;
                }
                else{
                    stack.push(push);
                }
                break;
            }
        }
        return answer;
    }
}