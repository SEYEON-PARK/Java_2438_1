/*
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/

import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        Scanner a = new Scanner(System.in);
        int N=a.nextInt();
        int num=1;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            num++;
            System.out.println();
        }
    }
}