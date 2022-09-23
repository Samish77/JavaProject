package Class_Object;
//Object and Class Example: Initialization through method
class Test2
{
int rollno;
String name;

void insertData(int r,String s) {
	rollno=r;
	name=s;
}
void displayData() {System.out.println(rollno+" "+name);}
}
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 s1=new Test2();
Test2 s2=new Test2();
s1.insertData(20, "sam");
s1.displayData();
s2.insertData(25, "tom");
s2.displayData();

	}

}
