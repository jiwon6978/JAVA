package CH07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {

		//기본문법
//		while(조건식) {
//			조건식이 true인 동안 실행되는 종속문장
//		}
		
		//01 Hello world 10회 출력 ->벗어날 변수 지정(i)->조건식 ->탈출연산식
	
//			int i=0;
//			while(i<10){
//				System.out.println(i+"Hello world");
//				i++;
//			}
	
		//02 Hello world  N회 출력 (유효성체크 포함)
			
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if (n<=0) {
//			System.out.printf("n은 0보다 커야합니다.\n");
//			System.exit(-1);
//		}
//		
//			int i=0;
//			while(i<n){
//				System.out.println(i+"Hello world");
//				i++;
//			}
//		
		
		//03 1~10까지 누적합 구하기
		
//		int i=1;
//		int sum =0;
//		while(i<=10){
//			System.out.println("i : "+ i);
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d\n",1,10,sum);
//		
		
		//04 1부터 n까지 누적합 구하기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력: ");
//		int n = sc.nextInt();
		
//		if(n<1) {
//			System.out.println("n은 1보다 커야합니다.");
//			System.exit(-1);
//		}
//		
//		int i = 1;
//		int sum = 0;
//		while(i<=n) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d\n",1,n,sum);
		
		
		//05 n부터 m까지 누적합 구하기(n<m)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 2개 입력: ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int sum = 0;
//		while (n<=m) {
//			sum += n;
//			n++;
//		}
//		System.out.printf("합: %d",sum);
		
		//Teacher--------------------
		
		//if (n>=m) {
		// int temp = n;
		// n =m;                  n<m을 만족하는 처리 swap
		//m = temp;
	//}
	
		//int i=n;
		//int sum = 0;
		// while(i<=m) {
		//sum += i;
		//i ++;
		//}
//		
		
		
		//06 n부터 m까지 짝수의 합, 홀수의 합을 각각 구해서 출력하기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 2개 입력: ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int sum1=0;
//		int sum2=0;
//		
//		while(n<=m) {
//			if (n%2==0) {
//				n++;
//				sum1 += n;
//			}
//		}
//		System.out.printf("짝수의 합 : %d",sum1);-
		
		
		//---------------Teacher
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 2개 입력: ");
//		if (n>=m) {
//				 int temp = n;
//				 n =m;                  //n<m을 만족하는 처리 swap
//				m = temp;
//			}
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int oddSum=0;
//		int evenSum=0;
//		
//		if()
//		
	
		
		
		//07 n단 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//유효성 확인 (n<2 || n>9)
		while(n<2 || n>9) {
			System.out.print("2~9사이의 숫자만 입력 가능합니다.");
			n = sc.nextInt();
		}
		
		int i=1;
		while(i<10) {
			System.out.printf("%d x %d = %d\n",n,i,n*1);
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


