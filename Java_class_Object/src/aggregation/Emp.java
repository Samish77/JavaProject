package aggregation;

public class Emp {

	int id;
	String name;
	Address address;
	
	public Emp(int id,String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}

	void display() {
		System.out.println("ID:" +id+ "Name: " +name);
		System.out.println(address.city+" " +address.state+" " +address.country);
	}
	
	public static void main(String arg[]) {
		Address address1=new Address("san","maha","ind");
		Address address2=new Address("pun","maha","ind");
		Emp e1=new Emp(1,"sam",address1);
		Emp e2=new Emp(2,"tom",address2);
		e1.display();
		e2.display();
	}
	
}



