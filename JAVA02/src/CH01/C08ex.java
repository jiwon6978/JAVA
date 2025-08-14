package CH01;


class TV{
	//속성
	String brandName;
	int year;
	int inch;
	
//	기능
	TV(){
		System.out.println("TV생성자 호출");
		this.brandName="LG";
		this.year =2017;
		this.inch=32;
	}
	TV(String brandName){
		this.brandName= brandName;
	}
	TV(String brandName,int year){
		this.brandName= brandName;
		this.year=year;
	}
	TV(String brandName,int year,int inch){
//		System.out.printf("%s에서 만든 %d년형 %d인치 TV",this.brandName,this.year,this.inch);
		this.brandName=brandName;
		this.year=year;
		this.inch=inch;
	}
	
	public void show() {
		System.out.printf("%s에서 만든 %d년 %d인치 TV",brandName,year,inch);
	}
	
	@Override
	public String toString() {
		return "TV [brandName=" + brandName + ", year=" + year + ", inch=" + inch + "]";
	}

}
public class C08ex {
	

	public static void main(String[] args) {

		TV myTV = new TV("LG",2017,32);
				
//		System.out.println(show);
		myTV.show();//LG에서 만든 2017년형 32인치 TV 이 출력

	}

	public C08ex() {
		super();
	}
}




//
//	--------------------------------------------
//	문제 - 이것이자바다
//	--------------------------------------------
//	https://scksk.tistory.com/6
//
//	클래스 기본문제
//	1~7번 확인하기 
//
//	12번-16번 확인하기
//
//	--------------------------------------------
//	--추가(명품자바)
//	--------------------------------------------
//	https://security-nanglam.tistory.com/213
//
//
//	--------------------------------------------
//	--추가
//	--------------------------------------------
//	https://iu-corner.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%97%B0%EC%8A%B5-%EB%AC%B8%EC%A0%9C-%EB%AA%A8%EC%9D%8C-1
//

