package CH2;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}


public class C04ClassCastExceptionMain {
	
	public static void main(String[] args) {
		
		Animal poppi = new Dog();
		Animal tori = new Cat();
		
		try {
		Dog down1 = (Dog)poppi;
//		Dog down2 = (Dog)tori;
		}catch(ClassCastException e){
			e.printStackTrace();
		}
		
		
		
	}

}
