package org.example;

import java.util.*;
class Solution11
{
    public int solution(String s)
    {
        int answer = -1;
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int n = s.length();

        for(int i= 0; i<n; i++){
            char c = s.charAt(i);
            if(stack.isEmpty()||!stack.peek().equals(c))
            {
                stack.push(c);
            }
            else if (stack.peek().equals(c)){
                stack.pop();
            }
        }
        if (stack.isEmpty())
            answer = 1;
        else answer = 0;

        return answer;
    }
}