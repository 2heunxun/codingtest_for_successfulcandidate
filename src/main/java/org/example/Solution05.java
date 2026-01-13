package org.example;

class Solution05 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int c1 = arr1.length;
        int r1 = arr1[0].length;

        int c2 = arr2.length;
        int r2 = arr2[0].length;

        int[][] answer = new int[c1][r2];

        for(int i=0; i<c1; i++){
            for(int j=0; j<r2; j++){
                for(int k=0; k<r1; k++){
                    answer[i][j]+= arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
/*
행렬의 곱 문제 - > 행렬의 곱 가능 조건을 생각해서 하면 된다.
 */