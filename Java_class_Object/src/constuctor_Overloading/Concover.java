package constuctor_Overloading;

public class Concover {
	int id;
	String name;
	int age;
	
	Concover(int i,String n){
		id=i;
		name=n;
		}
	Concover(int ii,String nn,int a){
		id=ii;
		name=nn;
		age=a;
		}
	
	void display() {System.out.println(id+ " " +name +age);}
	//void display1() {System.out.println(id+ " " +name);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concover s1=new Concover(10,"sam");
		Concover s2=new Concover(20,"tom",44);
		s1.display();
		s2.display();

	}

}
