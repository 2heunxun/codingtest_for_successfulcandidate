package org.example;
//https://school.programmers.co.kr/learn/courses/30/lessons/76502
import java.util.*;

//class Solution10 {
//    public int solution(String s) {
//        HashMap<Character,Character> map = new HashMap<>();
//        map.put(']','[');
//        map.put(')','(');
//        map.put('}','{');
//
//        int n = s.length();
//        s+=s; //회전 안 시키고 그냥 2개 이어붙여서 회전 맹키로 만들기
//        int answer = 0 ;
//
//
//        A:for(int i = 0 ; i < n; i++){
//            ArrayDeque<Character> stack = new ArrayDeque<>();
//
//            for(int j = i ; j < i + n; j++ ){
//                char c = s.charAt(j);
//                if(!map.containsKey(c)){ // 없단 소리
//                    stack.push(c);
//                }
//                else{
//                    if(stack.isEmpty()|| !stack.pop().equals(map.get(c)))
//                        continue A;
//                }
//
//            }
//            if(stack.isEmpty())
//                answer++;
//
//        }
//
//        return answer ;
//    }
//}

import java.util.*;

class Solution10 {
    public int solution(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        int n = s.length();
        s+=s;
        int answer = 0;

        A:for(int i = 0 ; i < n ; i++){
            //n 번만 반복해야되기 떄문!
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for(int j=i; j<i+n; j++){
                char c = s.charAt(j);
                if(!map.containsKey(c)){ // 열린기호는 모두 Value이므로 c가 Key에 포함되지 않으면 모두 열린기호이다.
                    stack.push(c);
                }
                else if (stack.isEmpty()|| !stack.pop().equals(map.get(c)))
                    continue A;
            }
            if(stack.isEmpty()) answer++;
        }

        return answer;
    }
}