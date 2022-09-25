package inheritance;
class Animal{
	void animal1() {System.out.println("This is a dog");}
	}
class Dog extends Animal{
	void dog() { System.out.println("It is barking");
}
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog s1=new Dog();
s1.animal1();
s1.dog();

	}

}
