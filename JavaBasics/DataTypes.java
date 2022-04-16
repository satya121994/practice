package JavaBasics;

public class DataTypes {
    
	//Hi this is my first java code
	/*Hi this is 
	 * my first 
	 * Java code
	 * and Im so happy*/
	 
	//main() ---method  starting/exection point of the program   
	public static void main(String[] args) {
		
		//primitive data type : int,double,char,boolean
		
		//1.int :
		int i = 10;
		i = 20;
		int j = 30;
		int k = 40;
		System.out.println(i);//20
		System.out.println(i+j);//50
		System.out.println(j);//30
		
		//2.double :
		double d1 = 12.33;
		double d2 = 24.66;
		
		System.out.println(d1);//12.33
		System.out.println(d1+d2);//36.99
		
		//3.char : only single digit value ,should be written with in single quotes
		char c = 'a';
		char c1 = 'A';
		char c2 = '1';
		
		//4.boolean :
		boolean b1 = true;
		boolean b2 = false;
		
		//5.String : is a class not a data type,should be written with in double quotes
		String s ="Satya";
		String s1 = "Good Evening";
		String s2 = "Playing cricket";
		
		System.out.println(s1);//Good Evening
		System.out.println(s2);//Playing cricket
		
	}

}
