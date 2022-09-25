package overRiding;
//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  

class Bank{
	
	int  bankIntrest(){return 0;}
}

class Sbi extends Bank{
	int bankIntrest(){return 9;}
}
 class Icici extends Bank{
	 int bankIntrest() { return 10;}
 }
 class Boi extends Bank{
	 int bankIntrest() {return 5;}
 }
 
public class BankPrb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Boi s1=new Boi();
         Icici s2=new Icici();
         Sbi s3=new Sbi();
         
         System.out.println("Intrest rate of Boi is: " +s1.bankIntrest());
         System.out.println("Intrest rate of Icici is: " +s2.bankIntrest());
         System.out.println("Intrest rate of Sbi is: " +s3.bankIntrest());
	}

}
