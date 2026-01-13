import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/42586
class Solution16 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> answer = new ArrayDeque<>();
        int n = progresses.length;

        int[] remains=new int[n];
        for(int i=0; i<n; i++){
            remains[i] = (int)Math.ceil((100.0-progresses[i])/speeds[i]);
        }
        int count = 0;
        int maxDay=remains[0];

        for(int i=0; i<n; i ++){
            if(remains[i]<=maxDay){
                count++;
            }
            else{
                answer.add(count);
                count = 1;
                maxDay=remains[i];
            }

        }
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
