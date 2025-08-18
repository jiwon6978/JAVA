package CH2;

public class C01NullPointerExceptionMain {
	
	public static void main(String[] args) {

	try {String str = null;
	System.out.println(str.toString());
		
	}catch(NullPointerException e){
		System.out.println("예외발생 : "+ e);
		System.out.println(e.getCause());
		System.out.println(e.getStackTrace());
		
		//->예외발생 : java.lang.NullPointerException: Cannot invoke "String.toString()" because "str" is null
	}

	System.out.println("실행되어야 할 코드2");
	System.out.println("실행되어야 할 코드2");

	
	}
}
