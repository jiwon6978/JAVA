package CH07;

import java.util.Scanner;

public class C연습예제 {

	public static void main(String[] args) {
		//-------------------------	
		//2단 - 9단 출력	
		//-------------------------
//		dan	i
//		2	1-9
//		3	1-9
//		...
//		9	1-9
//		---------------------------
//		dan=2	i=1
//		dan++	i++
//		dan<10   i<10
		
//		int dan = 2;
//		while(dan<10) {
////			System.out.printf("%d\n", dan);
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		//-------------------------
		//2단 - 9단 (2x9 , 2x8, 2x7 ..... 9x9 .. 9x1)
		//-------------------------
//		dan	i
//		2	9-1
//		3	9-1
//		4	9-1
//		,,,
//		9	9-1
//		-------------------
//		dan=2	i=9
//		dan++	i--
//		dan<10	i>0
		
//		int dan = 2;
//		while(dan<10) {
//			int i=9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}	
		//-------------------------		
		//9단 - 2단 (9x9 , 9x8, 9x7 ..... 2x9 .. 2x1)
		//-------------------------
//		dan	i
//		9	9-1
//		8	9-1
//		7	9-1
//		,,,
//		2	9-1
//		-------------------
//		dan=9	i=9
//		dan--	i--
//		dan>1	i>0
		
//		int dan = 9;
//		while(dan>1) {
//			int i=9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		//-------------------------		
		//2단 - n단 (n>2) 
		//-------------------------	
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if(n<=2) {
//			System.out.println("n>2 입니다 - !");
//			System.exit(-1);
//		}
//		
//		int dan = 2;
//		while(dan<=n) {
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//-------------------------
		//n단 - m단 (n<m)
		//-------------------------	
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//
//		if(n>=m) {
//			int tmp = n;
//			n = m ;
//			m = tmp;
//		}
//		
//		int dan = n;
//		while(dan<=m) {
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//-------------------------
		//별찍기(기본높이:4)
		//반드시 반복을 사용할것, 반복시마다 하나의 * 만 찍어낼 것
		//개행처리: System.out.println();
		//별찍기 : system.out.print("*");
		//-------------------------
		//*****
		//*****
		//*****
		//*****	
		//-------------------------
//		i(개행)	j(별)
//		0	0-4
//		1	0-4
//		2	0-4
//		3	0-4
//		---------------
//		i=0	j=0
//		i++	j++
//		i<4	j<5
//		int i=0;
//		while(i<4)
//		{
//			int j=0;
//			while(j<5) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//			
//		}
		//-------------------------
		//높이 : h
		//-------------------------
		//*****
		//*****
		//*****
		//*****
		//*****	
//		---------------
//		i(개행)	j(별)
//		0	0-4
//		1	0-4
//		2	0-4
//		3	0-4
//		...
//		h-1	0-4
//		---------------
//		i=0	j=0
//		i++	j++
//		i<h	j<5

//		Scanner  sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h)
//		{
//			int j=0;
//			while(j<5) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//-------------------------
		//높이 : 4(고정)
		//-------------------------
		//*
		//**
		//***
		//****
//		-------------------------
//		i(행)	j(별)
//		0	0-0
//		1	0-1
//		2	0-2
//		3	0-3
//		-------------------------
//		i=0	j=0
//		i++	j++
//		i<4	i<=i
		
//		int i = 0;
//		while(i<4) {
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//-------------------------
		//높이 : h
		//-------------------------
		//*
		//**
		//***
		//****
//		-------------------------
//		i(행)	j(별)
//		0	0-0
//		1	0-1
//		2	0-2
//		3	0-3
//		...
//		h-1	0 - (h-1)
//		-------------------------
//		i=0	j=0
//		i++	j++
//		i<h	i<=i
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//-------------------------
		// 높이 : 4
		//-------------------------
		//****
		//***
		//**
		//*
//		-------------------------
//		i(행)	j(별)
//		0	0-3
//		1	0-2
//		2	0-1
//		3	0-0
//		-------------------------
//		i=0	j=0
//		i++	j++
//		i<4	j<4-i
		
//		int i = 0;
//		
//		while(i<4) {	
//			int j = 0;
//			while(j<4-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//-------------------------
		// 높이 : h
		//-------------------------
		//****
		//***
		//**
		//*
//		-------------------------
//		i(행)	j(별)
//		0	0-(h-1)
//		1	0-(h-1)-1
//		2	0-(h-1)-2
//		3	0-(h-1)-3
//		..
//		h-1	0-0
//		-------------------------
//		i=0	j=0
//		i++	j++
//		i<h	j<h-i	
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {	
//			int j = 0;
//			while(j<h-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//-------------------------
		// 높이 : 4
		//-------------------------
		//   *
		//  ***
		// *****
		//*******
//		-------------------------
//		i(행)	j(공백)	k(별)
//		0	0-2	0-0
//		1	0-1	0-2
//		2	0-0	0-4
//		3	x	0-6
//		--------------------------
//		i=0	j=0	k=0
//		i++	j++	k++
//		i<4	j<3-i	k<=2*i
		
		
//		int i=0;
//		while(i<4) 
//		{
//			//공백
//			int j=0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//
//			System.out.println();
//			i++;
//		}
		//-------------------------
		// 높이 : h
		//-------------------------
		//   *
		//  ***
		// *****
		//*******
//		-------------------------
//		i(행)	j(공백)	k(별)
//		0	0-(h-2)	0-0
//		1	0-(h-2)-1	0-2
//		2	0-(h-2)-2	0-4
//		3	0-(h-2)-3 0-6
//		...
//		h-1	x	0-2*i
//		--------------------------
//		i=0	j=0	k=0
//		i++	j++	k++
//		i<h	j<(h-1)-i	k<=2*i
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) 
//		{
//			//공백
//			int j=0;
//			while(j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//
//			System.out.println();
//			i++;
//		}
		
		
		//-------------------------
		// 높이 : 4
		//-------------------------
		//*******
		// *****
		//  ***
		//   *

//		int i = 0;
//		while (i<4) {
//			int j = 0;
//			
//			//공백
//			while (j<i) {
//				System.out.print(" ");
//				j++;
//				
//			}
//				//별
//				int k = 0;
//				while(k <= 6-2*i) {
//					System.out.print("*");
//					k++;
//				}
//			
//			System.out.println();
//			i++;
//		}

		
		//-------------------------
		// 높이 : h
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : ");
//		int h = sc.nextInt();
//		int i = 0;
//		
//		while(i<h) {
//			int j = 0;
//			//공백
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			//별
//			while(k < 2*(h-i)-1) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//			
//		}
		
		//-------------------------
		// 높이 : 7
		//-------------------------
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
//		int i = 0;
//		while (i<7) {
//			
//			if (i<4) {
//				//공백
//				int j = 0;
//				while(j<3-i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k = 0;
//				while(k<2*1) {
//					System.out.print("*");
//					k++;
//				}
//			}else {
//				//공백
//				int j = 0;
//				while(j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k = 0;
//				while(k<6*2-2*i) {
//					System.out.print("*");
//					k++;
//				} 		
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		//-------------------------
		// 높이 : h (홀수 높이만 가능)
		//-------------------------
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int i=0;
		while(i<h) {
			
			if(i<=(h/2)) {
				//공백(↓)
				int j=0;
				while(j<(h/2)-i) {
					System.out.print(" ");
					j++;
				}
				//별(↑)
				int k=0;
				while(k<=2*i) {
					System.out.print("*");
					k++;
				}
				
			}else {
				
				//공백(↑)
				int j=0;
				while(j<=i-(h/2+1)) {
					System.out.print(" ");
					j++;
				}	
				//별(↓)
				
				int k=0;
				while(k<=((h-1)*2)-2*i) {
					System.out.print("*");
					k++;
				}
				
			}
			
			System.out.println();
			i++;
		}
		
	
	
		//-------------------------
		// 높이 : 7
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******


		//-------------------------
		// 높이 : h
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		
		
	}

}
