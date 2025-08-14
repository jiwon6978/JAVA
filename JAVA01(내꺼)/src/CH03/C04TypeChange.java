package CH03;

public class C04TypeChange {

	public static void main(String[] args) {
		
		byte x  = 10;
		byte y = 20;
		byte result1 =(byte)(x + y);
		
		
		byte var1 = 10;
		int var2 =100;
		long var3 = 1000L;
//		int result = var1 +var2 +var3;
		long result2 = var1 + var2 + var3;
		
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		int result3 =(int)(intvar + flvar + dbvar );
		double result4 = intvar +flvar+dbvar;
		System.out.println(result3);
		
		
	}

}
