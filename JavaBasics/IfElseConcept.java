package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a  =10;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is greater than a");//b is greater than a
		}else {
			System.out.println("a is greater than b");
		}
		
         int a1 = 30;
         int b1= 40;
         if(a1>b1) {
        	 System.out.println("b1 is greater than a1");
         }else {
        	 System.out.println("a1 is greater than b1");//a1 is greater than b1
         }
         
         //comparison operators:
         //< > <= >= == !=
         int c = 40;
         int d = 40;
         
         if (c==d) {
        	 System.out.println("c and d are equal");//c and d are equal
         }else {
        	 System.out.println("c and d are not equal");
         }
         
         //write a logic to find out the hightest number
         int a2 = 100;
         int b2 = 200;
         int c2 = 300;
         
         //nested if -else
         if (a2>b2&a2>c2) {
        	 System.out.println("a2 is the greatest");
         }else if (b2>c2) {
        	 System.out.println("b2 is the greatest");
         }else {
        	 System.out.println("c2 is the greatest");//c2 is the greatest
         }
         
         
         int a3 = 400;
         int b3 = 200;
         int c3 = 300;
         
         //nested if -else
         if (a3>b3&a3>c3) {
        	 System.out.println("a3 is the greatest");
         }else if (b3>c3) {
        	 System.out.println("b3 is the greatest");
         }else {
        	 System.out.println("c3 is the greatest");// a3is the greatest
         }

         
         int a4 = 100;
         int b4 = 500;
         int c4 = 300;
         
         //nested if -else
         if (a4>b4&a4>c4) {
        	 System.out.println("a4 is the greatest");
         }else if (b4>c4) {
        	 System.out.println("b4 is the greatest");
         }else {
        	 System.out.println("c4 is the greatest");//b4 is the greatest
         }

         
	}

}
