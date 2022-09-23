package Class_Object;
//We can also create multiple objects and store information in it through reference variable.
class test1 {
int id;
String name;
}
class Program4{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   test1 s1=new test1();
   test1 s2=new test1();
   s1.id=10;
   s1.name="tom";
   s2.id=25;
   s2.name="man";
   System.out.println(s1.id+ " " + s1.name);
   System.out.println(s2.id+ " " + s2.name);
	}

}
