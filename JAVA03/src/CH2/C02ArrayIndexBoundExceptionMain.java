package CH2;

public class C02ArrayIndexBoundExceptionMain {

	public static void main(String[] args) {

		int [] arr = {10,20,30};
		try {
			System.out.println(arr[3]);
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("예외 발생: "+e);
		}finally {
			System.out.println("예외발생과는 무관하게 무조건 실행되는 코드");
			//자원(JDBC,SOCKET,STREAM,SCANNER ...등)
		}
		

		
		
		
		System.out.println("실행되어야 할 코드1");
		System.out.println("실행되어야 할 코드1");

	}

}
