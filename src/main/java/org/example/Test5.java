package org.example;

import java.util.Scanner;

public class Test5 {
    // 나머지 합 구하기 
    // 연속된 부분의 합이 M으로 나누어떨어지는 구간의 개수를 구하는 프로그램을 작성하시오
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] questArr; // 처음 연속된 숫자의 갯수와 나눌 수를 입력받을 배열
        char [] suArr; //연속된 숫자를 입력받을 배열

        do{
            System.out.println("연속된 숫자의 갯수와 나눌 수를 입력하세요");
            questArr = sc.nextLine().replace(" ", "").toCharArray();
        }while(questArr.length != 2);

        do{
            System.out.println("연속된 숫자 " +  questArr[0]   + "개를 입력하세요");
            suArr = sc.nextLine().replace(" ", "").toCharArray();
        }while(suArr.length != Integer.parseInt(String.valueOf(questArr[0])));

        int result = 0;
        for(int i = 0; i < suArr.length; i++){
           int one = Integer.parseInt(String.valueOf(suArr[i]));
           int sum = one;
           for(int j = i; j<suArr.length; j++){
               if(i != j){
                   sum += Integer.parseInt(String.valueOf(suArr[j])) ;
                   int mod = sum%3;
                   if(mod == 0) result ++;
               }else{
                   if(Integer.parseInt(String.valueOf(suArr[j]))%3 == 0) result ++;
               }
           }
        }
        System.out.println("결과: " + result);
    }
}
