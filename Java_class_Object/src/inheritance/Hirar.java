package inheritance;

// This is Hirarchical Inheritance 
// Java does not support Multiple Inheritance
class Animal3{
	void animal2() {System.out.println("This is dog");
}
}
class Dog3 extends Animal3{
	void dog1() {
		System.out.println("It is barking");
	}
}
class Babydog3 extends Animal3{
	void baby() {
		System.out.println("this is baby dog");
	}
}
public class Hirar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Babydog3 s1 =new Babydog3();
s1.animal2();
s1.baby();
//s1.dog1();

	}

}