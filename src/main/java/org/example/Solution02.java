package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Solution02 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 2, 1, 3, 4})));
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1, 3, 2, 5, 4})));
    }

    private static int[] solution(int[] arr) {
        Integer[] arr2 = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        return Arrays.stream(arr2).mapToInt(Integer::intValue).toArray();
    }

}