package org.example;

import java.util.*;

public class Solution9 {

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(27));
        System.out.println(solution(12345));
    }


    public static String solution(int decimal) {
        Stack<Integer> stack = new Stack<>();
        while(decimal>0){
            int push = decimal%2;
            stack.push(push);
            decimal/=2;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }

}