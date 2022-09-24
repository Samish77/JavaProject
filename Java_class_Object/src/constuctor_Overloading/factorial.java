package constuctor_Overloading;
//factorial calculation


class Calculation{
        void cal(int n){
	         int fact=1;
                for(int i=1;i<=n;i++) {
	                    fact=fact*i;
                                      }	
System.out.println("factorial" +fact);
                       }
}

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new Calculation().cal(5);
	}

}
