package org.example;

import java.util.*;

class Solution8 {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='(')
                stack.push(c);
            else if(c==')'){
                if(stack.isEmpty())
                    return false;
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
