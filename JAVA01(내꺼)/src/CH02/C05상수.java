package CH02;

public class C05상수 {

	public static void main(String[] args) {
		//상수 : 항상 같은 수
		
		//리터럴 상수 : 이름부여X , 상수 Pool에 저장 , 단순한 수치 , 값
		//심볼릭 상수 : 이름부여O , final 예약어 사용
		
		//리터럴 접미사 : 리터럴 상수가 저장되는 자료형을 지정
		//ㅣ,L : long의 자료형
		//f,F : float의 자료형
		
		int a = 'a';
		System.out.println((int)a);
		System.out.println((char)a);
		
		int n1 = 100;         //100은 리터럴 상수
		final int n2 = 200;     //n2는 심볼릭 상수
		
		final double PI = 3.14;
		double result = PI*4*4;
		
//		double a = 1e-3;
//		System.out.println(a);

		
		
		
		
		
		/*정수 타입 		: byte,short,int ,long
		char 타입 	: ' ' 
		String 타입 	: " "
		실수 타입 		: double , float
		논리 타입 		: boolean


		확인 문제1

		정수타입 
		1byte : byte
		2byte : char / short
		4byte : int 
		8byte : long 

		실수타입
		4byte : float
		8byte : double

		논리타입
		1byte : boolean


		확인문제2
		맞는 코드인지 틀린 코드인지 확인 
		byte var = 200;							(  	x   )    x
		char var='AB';							(   x	)    x
		char var=65;							(   o   )    o
		long var=50000000000L;					(   x	)	x
		float var = 3.14f						(   o	)    x
		double var = 100.0;						(   o   )     o
		String var = "나의직업은 "개발자" 입니다.";	(   x   )    x
		boolean var = 0;						(  	x   )    
		int v2 = 1e2; 1*10^2					(   o   )    x
		float = 1e2f;	 						(  	x  )     x
		*/
	}

}
