package CH01;

class C05Simple{
	//속성
	int num =10;	//<- 멤버변수

	//기능
	void Func1() {
		System.out.println("num : " + num);
		int num=20; //Func1의 지역변수
		System.out.println("num : " + num);
	}
	void Func2() {
		System.out.println("num : " + num);
		if(num>0) { //멤버변수num
			System.out.println("num : "+ num);
			int num=100;  //if문 내의 지역변수 num
		}
		System.out.println("num : "+num);   //멤버변수 num
		
//		while(num<15) {
//			int num=100;
//			System.out.println("num : "+num);
//			num++;
		}
	
	
	void Func3(int num) {
		this.num = num;  
		
	}
}	


public class C05LocalVarMain{
	public static void main(String[ ] args){
		C05Simple obj = new C05Simple();
		obj.Func1();
		System.out.println("--------------");
		obj.Func2();
	}
}
