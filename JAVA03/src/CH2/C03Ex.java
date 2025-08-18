package CH2;

import java.util.Scanner;

public class C03Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("나눗셈 위한 두 값을 입력하세요. : ");
		int n1 = sc.nextInt();
		int n2 = 0;
		System.out.println("나눗셈 결과 : "+ n1/n2);   //N/0 시 예외발생
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
		System.out.println("실행되어야 할 코드1");
		System.out.println("실행되어야 할 코드2");
		System.out.println("프로그램 종료");
		}
	}

}
