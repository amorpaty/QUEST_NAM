package org.example;

import java.util.Scanner;

public class Test6 {
    //투 포인터
    //연속된 자연숭의 합 구하기
    public static void main(String[] args){

        //첫번째 줄에 정수가 주어진다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 압력하세요");
        int result = 1;
        int su = scanner.nextInt();
        int mod = (su/2) + 1;

        for(int i = 1; i <= mod; i++){
            int sum = 0;
            for(int j = i; j <= mod; j++){
                sum += j;
                if(sum > su){
                    continue;
                }else if(sum == su){
                    result++;
                }
            }
        }
        System.out.println("결과 : " + result);
    }
}
