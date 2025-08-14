package CH06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		/*
		 * 단순 IF
		 */
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age>=8);
//			System.out.println("학교에 다닙니다.");
//		
//		System.out.println("첫 번째 IF 코드 블록 종료");
//		
//		if(age<8);
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("두 번째 IF 코드 블록 종료");
//		System.out.println("프로그램을 종료합니다.");
//		
//		sc.close();
		
		//-----------------------
				//1 문제
				//-----------------------
				// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
				// 3의 배수이면서 5의 배수라면 출력 - 
				// 순서도도 그려보세요 - 
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요. :");
//		int n1 = sc.nextInt();
//		if (n1 % 3 ==0);
//			System.out.println("3의 배수입니다.");
//		
//		if ((n1 % 3 ==0)&&(n1 % 5 ==0));
//			System.out.println("3과5의 배수입니다.");
//			
//		sc.close();
		
		//-----------------------
				//2 문제
				//-----------------------
				// 두개의 정수를 입력받아 큰 수 출력
				
//				Scanner sc = new Scanner(System.in);
//				System.out.print("두개 정수 입력 : ");
//				int n1 = sc.nextInt();
//				int n2 = sc.nextInt();
//			Scanner sc = new Scanner(System.in);
//			System.out.println("두 숫자를 입력하세요. : ");
//			int n1 = sc.nextInt();
//			int n2 = sc.nextInt();
//			
//			if (n1 > n2)
//				System.out.print(n1);
//			else
//				System.out.print(n2);
//			
//			sc.close();
//		
		//-----------------------
				//3 문제(☆)
				//-----------------------
//				// 세 개의 정수를 입력받아 큰 수 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 3개 입력 : ");
//		
//		int n1 =sc.nextInt();
//		int n2 =sc.nextInt();
//		int n3 =sc.nextInt();
//		
//		int max = n1;
//		
//		if (max<n2)
//			max=n2;
//		else if (max<n3);
//			max=n3;
//	
//		sc.close();
		

//		//-----------------------
//		//4 문제
//		//-----------------------
//		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 3개 입력 : ");
//		
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		
//		int total = n1 + n2 + n3 ;
//		int avg = total / 3;
//		
//		System.out.println("합 : "+ total);
//		System.out.println("평균 : " + avg);
//		
		
		
		//-----------------------
				//5 문제
				//-----------------------
//				입력한 수가 짝수이고, 3의 배수라면 출력 (n%2==0 && n%3==0)
//				입력한 수가 홀수이고, 5의 배수라면 출력 (n%2==1 && n%5==0)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		
//		int n = sc.nextInt();
//		
//		if(n%2==0 && n%3==0);
//			System.out.print("3의 배수인 짝수");
//			
//		if (n%2 ==1 && n%5==0);
//				System.out.print("5의 배수인 홀수");
//				
//				

				//-----------------------
				//IF - ELSE IF - ELSE
				//-----------------------
				//과목1,2,3,4 중 하나라도 40점 미만이면 불합격
				//과목평균이 100점만점 기준으로 60점 미만이면 불합격
				//아니면 합격
				
//		Scanner sc = new Scanner(System.in);
//		System.out.print("네 과목 점수를 입력하세요 (띄어쓰기로 구분): ");
//		
//		int score1 = sc.nextInt();
//		int score2 = sc.nextInt();
//		int score3 = sc.nextInt();
//		int score4 = sc.nextInt();
//		
//		
//		if(score1 <40 || score2<40 || score3<40 || score4<40)
//			{System.out.print("불합격");}
//		
//			else if ((score1 + score2 + score3 + score4)/4 <60) {
//			System.out.print("불합격");}
//			
//			else 
//				System.out.print("합격");
//		
//		
	

		//시험 점수를 입력받아 
		//90 ~ 100점은 A, 
		//80 ~ 89점은 B, 
		//70 ~ 79점은 C, 
		//60 ~ 69점은 D, 
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요: ");
//		
//		int score = sc.nextInt();
//
//		if (score >=90)
//		 	System.out.print("A");
//			else if (score >=80)
//				System.out.print("B");
//			else if (score >=70)
//				System.out.print("C");
//			else if (score >=60)
//				System.out.print("D");
//			else
//				System.out.print("F");
		

		

		
	}

}
