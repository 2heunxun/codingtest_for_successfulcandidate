package org.example;

import java.util.*;

class Solution7 {
    private static boolean isValidMove(int nx, int ny){
        return nx>=0 && ny >=0 && nx<11 && ny < 11;
    }

    private static final HashMap<Character,int[]> location = new HashMap<>();

    private static void initLocation(){
            location.put('U', new int[]{0,1});
            location.put('R', new int[]{1,0});
            location.put('L', new int[]{-1,0});
            location.put('D', new int[]{0,-1});

    }
    // 위에는 초기 세팅


    public int solution(String dirs) {
        initLocation();
        int x=5, y=5;  // 이건 왜 5,5 ?
        HashSet<String> answer = new HashSet<>(); // 왜 hashset을 썻을까?

        for(int i=0; i<dirs.length(); i++){
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if(!isValidMove(nx,ny))
                continue;
            answer.add(x+" "+y+" "+nx+" "+ny);
            answer.add(nx+" "+ny+" "+x+" "+y);
            x= nx;
            y= ny;
        }
        return answer.size()/2;

    }
}
