package leetCode;

public class sumOfTwoIntegers {
    public static int getSum(int a, int b) {
        //The main idea is to use Half Adder Logic
        //contains logic XOR and Carry
        int s = 0;
        while (b != 0){
            int carry = a & b;
        	System.out.println("Carry is " + carry);
            a = a ^ b ;
        	System.out.println("a is "+a);

            b = carry << 1;
            
        	System.out.println("b is " + b);

        }
        
        return a;
        
    }
    
    public static void main(String[] args) {
    	System.out.println(getSum(10,20)); // Display the string.
    }
}


