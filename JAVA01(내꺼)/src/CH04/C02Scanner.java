package CH04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : "+num1);
		
		System.out.println("실수 입력 : ");
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수 값 : "+num2);
		
		System.out.println("문자열 입력 :"); 
//		String str1 = sc.next();   //문자열 입력받기 기능 함수 , 띄어쓰기 포함X
		String str1 = sc.nextLine();   //문자열 입력받기 기능 함수 , 띄어쓰기는 포함
		System.out.println("입력된 문자열 : "+str1);
		
		
		sc.close();
		
	}

}
