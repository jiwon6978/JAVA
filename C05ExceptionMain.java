package CH2;





public class C05ExceptionMain {

	public static void main(String[] args) {
		
		try {
		String str = null;
		str.toString();
		
		int [] arr = {10,20,30};
		arr[5] = 100;
		}catch(Exception e) {
			System.out.println(e.getCause()+"예외처리");
		}	
			
//		}catch(NullPointerException e1) {
//			System.out.println("NULLPOINTER 예외처리완료");
//		}catch(ArrayIndexOutOfBoundsException e2) {
//			System.out.println("배열 예외처리완료");
//		}catch(ClassCastException e3) {
//			System.out.println("");
			
		
	}
}
