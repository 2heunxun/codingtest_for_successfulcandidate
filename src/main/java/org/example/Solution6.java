package org.example;

import java.util.*;

class Solution6 {
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N+2]; // 이거슨 말이다 1부터 시작이고  N+1까지의 클리어를 보니깐 N+2
        for(int stage : stages){
            challenger[stage] += 1; // 스테이지당 현재 인원
        }

        HashMap<Integer,Double> fail = new HashMap<>(); //(스테이지,실패율)
        double total = stages.length;


        for(int i= 1; i<N+1; i++){
            if(challenger[i]==0){
                fail.put(i,0.);
            }
            else{
                fail.put(i, challenger[i]/total);
                total -=challenger[i];
            }

        }




        return fail.entrySet().stream()
                .sorted((o1,o2)->o1.getValue()
                        .equals(o2.getValue()) //같다면 ?
                        ?Integer.compare(o1.getKey(),o2.getKey()) // True일시 key값 비교
                        : Double.compare(o2.getValue(),o1.getValue())) // False일시 Value값 비교
                .mapToInt(HashMap.Entry::getKey)
                .toArray();
    }
}

/*
실패율 = 클리어하지 못한 플레이어수 / 해당 스테이지 도달 플레이어수
*/
