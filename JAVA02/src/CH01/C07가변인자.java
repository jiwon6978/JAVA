package CH01;

class C07Simple{
	
	int sum(int ...arg) {            // sum(int...arg) : 정수값 배열 (인덱스 접근가능)
		System.out.println(arg);
//		System.out.println(arg[0]);
//		System.out.println(arg[1]);
		
		int s=0;
		for(int item : arg) {
			System.out.println(item);
			s+=item;
		}
		return s;
	}
}

public class C07가변인자 {

	public static void main(String[] args) {
		C07Simple obj = new C07Simple();
		obj.sum(10,20,30,40);
	}

}
