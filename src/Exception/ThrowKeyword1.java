package Exception;

public class ThrowKeyword1 {
	 public static void checkNum(int num) {  
	        if (num < 1) {  
	            throw new ArithmeticException(" cannot calculate square");  
	        }  
	        else {  
	            System.out.println("Square of " + num + " is " + (num*num));  
	        }  
	    }  
	  
	    public static void main(String[] args) {  
	            ThrowKeyword1 obj = new ThrowKeyword1(); 
	            ThrowKeyword1.checkNum(-3);  
	            System.out.println("Rest of the code..");  
	    } 

}
