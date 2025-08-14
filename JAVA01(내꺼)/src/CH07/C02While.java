package CH07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		//중첩 반복문 (2단 ~9단 출력)
//		int dan = 2;
//		while(dan<10) {
////			System.out.printf("%d\n", dan);
//			dan ++;
//			int i =1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//		}
		
		
		// 2단 ~ 9단 거꾸로 출력하기
			//dan =2 , dan++ , dan <10  i=9 , i- - , i > 0
//		System.out.print("------------------------------");
//		{
//		int dan = 2;
//		while(dan<10) {
////			System.out.printf("%d\n", dan);
//			int i =9;
//			while(i>=1) {
//			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//			i--;
//			}
//			System.out.println();
//			dan++;
//		}
//		
//	}
		// 9단 ~ 2단 거꾸로 출력하기
//		{
//			int dan=9;
//			while(dan>=2) {
//				//System.out.printf("%d\n",dan);
//				int i=9;
//				while(i>=2) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//				}
//				System.out.println();
//				dan--;
//			}
//			
//		}
		
		
		//2단 ~ n단 출력하기 (n >2)
		
//		{
//			Scanner sc = new Scanner(System.in);
//			System.out.print("2보다 큰 숫자를 입력하세요: ");
//			int n = sc.nextInt();
//			
//			int dan = 2;
//			while(dan<=n) {
////				System.out.print("--------");
//				int i = 1;
//				while(i<10) {
//					System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//					i++;
//				}
//				System.out.println();
//				dan++;
//			}
//		}
		
		
		
		
		
		
		
		
		
		//n단 ~ m단 출력 (n<m)
		
		
			
//			Scanner sc = new Scanner(System.in);
//			System.out.print("숫자 2개를 입력하세요 : ");
//			int n = sc.nextInt();
//			int m = sc.nextInt();
//			
//			//유효성 검사
//			
//			if (n>m) {
//			int tmp = n;
//			 n =m;
//			 m =tmp;
//			}
//			 
//			 int dan = n;
//			 while(dan<=m) {
//				 int i=1;
//				 while(i<10) {
//					 System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//					 i++;
//				 }
//				 System.out.println();
//				 dan++;	 
//			 }
//		
			 
			 //별찍기 ( 반드시 반복문 사용 . 반복 시 하나의 *만 찍어낼 것)
			 
//			 int i = 0;
//			 while (i<4) {
//				 
//				 int j =0;
//				 while(j<5) {
//				 System.out.print("*");
//				 j++;
//			 }
//			 System.out.println();
//			 i++;
//			 }
			 
//			 높이 h만큼 증가
//			 Scanner sc = new Scanner(System.in);
//			 int h = sc.nextInt();
//			 int i = 0;
//			 while(i<=h) {
//				 
//				 int j = 0;
//				 while(j<5) {
//					 System.out.print("*");
//					 j++;
//				 }
//				 System.out.println();
//				 i++;
//			 }
			 
			 //높이 4고정
			 //*
			 //**
			 //***
			 //****
//			 
//			 int i =0;
//			 while(i<4) {
//				 int j = 0;
//				 while(j<=i) {
//				 System.out.print("*");
//				 j++;
//			 }
//				 System.out.println();
//				 i++;
//			 }
			 //h = n 일 때
			 // *
			 // **
			 // ***
			 // ****
		{
//			 Scanner sc = new Scanner(System.in);
//			 System.out.println(" : ");
//			 int h = sc.nextInt(); 
//			 int i =0;
//			 while(i<=h) {
//				 int j = 0;
//				 while(j<=i) {
//					 System.out.print("*");
//					 j++;
//				 }
//				 System.out.println();
//				 i++;
//			 }
		}	 
			 //역순 높이 4
			 //****
			 //***
			 //**
			 //*
//		{
//			 int i =0;
//			 while(i<4) {
//				 int j = 0;
//				 while(j<4-i) {
//					 System.out.print("*");
//					 j++;
//				 }
//				 System.out.println();
//				 i++;
//			 }
//		}
		
		//높이 h
		//****
		//***
		//**
		//*
//		Scanner sc = new Scanner(System.in);
//		 System.out.println("입력: ");
//		 int h = sc.nextInt(); 
//		 int i = 0;
//		 while (i<h) {
//			 int j = 0;
//			 while(j<h-i) {
//				 System.out.print("*");
//				 j++;
//			 }
//			 System.out.println();
//			 i++;
//		 } 
//		 
		
		
		
			 //높이 4
			 //   *
			 //  ***
			 // *****
			 //*******
			 
//		 int i = 0;
//		 while(i<4) {
//			 //공백
//			 int j = 0;
//			 while(j<=3-i) {
//				 System.out.print(" ");
//				 j++;
//				 
//				 //별
//				 int k = 0;
//				 while(k<=i*2) {
//					 System.out.print("*");
//				 k++;
//			}
//			 }
//			 System.out.println();
//			 i++;
//		 
//			 	
//		}	 
			 
		
		// 높이 h
		//   *
		//  ***
		// *****
		//*******
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int i = 0;
		while (i<h) {
			
			//공백
			int j = 0;
			while (j<h-i) {
				System.out.print(" ");
				j++;
			}
			//별
			int k = 0;
			while(k<=2*i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
			 
	}
}










// dan  - dan =2 , dan ++ , dan < 10
// i    -  i  =1 , i ++ ,  i < 10
