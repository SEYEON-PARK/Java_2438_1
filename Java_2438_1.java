/*
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/

import java.util.Scanner; // 스캐너 사용을 위해서

public class Main{ // Main 클래스
    public static void main(String arg[]){ // main() 메소드
        Scanner a = new Scanner(System.in); // 스캐너 a 생성
        int N=a.nextInt(); // 사용자로부터 정수 입력받기
        int num=1; // 별의 개수를 저장할 변수 선언 및 초기화
        
        for(int i=0;i<N;i++){ // i가 0부터 N-1까지 1씩 증가하며 반복
            for(int j=0;j<num;j++){ // j가 0부터 num-1까지 1씩 증가하며 반복
                System.out.print("*"); // 별 출력하기
            }
            num++; // num에 1 더하기
            System.out.println(); // 한 줄 띄기
        }
    }
}
