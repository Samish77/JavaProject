package inheritance;

// This is Multilevel Inheritance 
// Java does not support Multiple Inheritance
class Animal2{
	void animal2() {System.out.println("This is dog");
}
}
class Dog2 extends Animal2{
	void dog1() {
		System.out.println("It is barking");
	}
}
class Babydog extends Dog2{
	void baby() {
		System.out.println("this is baby dog");
	}
}
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Babydog s1 =new Babydog();
s1.animal2();
s1.baby();
s1.dog1();

	}

}
