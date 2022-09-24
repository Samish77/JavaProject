package Class_Object;

public class Program2 {
//main method in another class
	int id=20;
	String name="samm"; 
}

class Program3{
 public static void main(String arg[]) {
	 Program2 s1= new Program2();
	System.out.println(s1.id);
	System.out.println(s1.name);
	
 }
	
}

