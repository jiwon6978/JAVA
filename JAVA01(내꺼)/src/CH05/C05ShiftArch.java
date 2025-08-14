package CH05;

public class C05ShiftArch {

	public static void main(String[] args) {
//		int num1 = 15;		//00000000 00000000 00000000 00001111
		
//		int num2 = 20;		//00000000 00000000 00000000 00010100
//		int num3 = num2<<3; //00000000 00000000 00000000 10100000
		// 20 * 2^3
//		int num4 = num2>>3; //00000000 00000000 00000000 00000010
		// 
//		
//		System.out.println("<<Shift 연산결과 :" + num3);
//		System.out.println(">>Shift 연산결과 :" + num4);

		
		{	
		System.out.print("--------------------------------------");
		int a=0,b=0;
		boolean c;
		a = 1;
		b = 1;
		c =(++a>0)||(++b>0) ;
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);
		//a=2 b=1 c=true

		a = 1;
		b = 1;
		c = (++a>0)||(--b>0) ;
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);
		//a=2 b=1 c=true

		a = 1;
		b = 1;
		c = (--a>0)||(++b>0) ;
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);
		//a=0 b=2 c=true

		a = 1;
		b = 1;
		c = (--a>0)||(b-->0);
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c);
		//a=0 b=0 c=true
	}
		System.out.print("----------------------------------");
		{
		int a=5, b=6, c=10, d;
		boolean e;
		d=++a*b--;
		 System.out.printf("a = %d, b = %d, d = %d\n", a, b, d);
		 //a=6 b=5 d=36              b->5
		d=a++ + ++c - b--;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
		//a=7 c=11 b=4 d=12
		a=1;
		b=0;
		e=(a++>0)||((b*d/c)>0);
		//a=2 b=0 d=12 c=11 e=true
		System.out.printf("a = %d, b = %d, c = %d, d = %d ,e = %b\n", a, b, c, d , e);
		}
	}
}
