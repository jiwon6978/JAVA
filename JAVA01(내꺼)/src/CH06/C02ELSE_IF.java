package CH06;

import java.util.Scanner;

public class C02ELSE_IF {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4)/4;
//		
//		if (과목1<40); {
//			System.out.print("불합격");
//		}
//		else if (과목2<40) {
//			System.out.print("불합격");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요: ");
//		
//		int score = sc.nextInt();
//		
//		if(score>=90) {
//			System.out.print("A");
//		}
//		else if(score>=80) {
//			System.out.print("B");
//		}
//		else if(score>=70) {
//			System.out.print("C");
//		}
//		else if(score>=60) {
//			System.out.print("D");
//		}
//		else {
//			System.out.print("F");
//		}
//		
//		sc.close();

		
		
		//나이별로 요금을 부과하는 else if문 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요. : ");
		int age = sc.nextInt();
		
		if (age<8) {
			System.out.print("1000원");
		}
		else if(age<14) {
			System.out.print("2000원");
		}
		else if(age<20) {
			System.out.print("2500원");
		}
		else {
			System.out.print("3000원");
		};
		
	}

}
