package org.example;

import java.util.ArrayDeque;

public class Solution15 {
    public static void main(String[] args) {
        System.out.println(solution(5, 2));
    }
    private static int solution(int a, int b) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= a; i++) {
            deque.addLast(i);
        }
        while(deque.size()>1){
            for (int i = 0; i < b - 1; i++) {
                deque.addLast(deque.pollFirst());
            }
            deque.pollFirst();
        }
        return deque.pollFirst();
    }
}
