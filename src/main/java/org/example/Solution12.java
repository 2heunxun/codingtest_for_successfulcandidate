package org.example;

import java.util.*;

class Solution12 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int n = prices.length;

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 기본이 되는 수

        for (int i = 1 ; i < n ; i++){
            while(!stack.isEmpty() && prices[i]< prices[stack.peek()]){ // 스택이 비어있지않거나, 현재값이 스택의 최상위권 보다 작을때 인덱스를 넣을 생각을 우째하지 ?
                int j = stack.pop(); // 큰 스택의 최상위값을 꺼냄.
                answer[j] = i-j;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int j= stack.pop();
            answer[j] = n-1-j;
        }


        return answer;
    }
}