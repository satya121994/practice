package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		//1.int array:
		
		//lowest bound /index =0
		//upper bound/index = n-1(n is size of array)
		
		//dis -advantage of array:
		//1.size is fixed --static arraay --to overcome this problem we can use collections--arraylist,hashtable,use dynamic array
		//2.stores only similar data type --to overcome of this problem ,we use object array
		 int i []= new int [4];
		  i[0] = 10;
		  i[1]= 20;
		  i[2] =30;
		  i[3]=40;
		  
		  System.out.println(i[2]);//30
		System.out.println(i[3]);//40
		System.out.println(i.length);//4
		
		//print all the values of array :use for loop
		for (int j=0;j<i.length;j++) {
			System.out.println(i[j]);//10 20 30 40 
			
		}
		//2.double array:
		
		double d [] = new double [3];
		d[0] = 12.33;
		d[1] =24.55;
		d[2] = 34.77;
		
		System.out.println(d[2]);//34.77
		System.out.println(d.length);//3
		
		
		//3.char array:
		char c[] = new char [3];
		c[0] = 'a';
		c[1] = 'A';
		c[2] ='3';
		
		System.out.println(c[2]);//3
		
		//4.boolean array:
		boolean b[] = new boolean [2];
		b[0] = true;
		b[1] = false;
		
		//5.String array:
		  String s[] = new String [4];
		  s[0] = "Hello";
		  s[1] = "Satya";
		  s[2] = "Evening";
		  
		  System.out.println(s[2]);//evening
		  System.out.println(s[1]);//satya
		  
		
		//6.Object array:
		  Object ob [] = new Object [6];
		   ob[0] = "Nani";
		   ob[1] = 26;
			ob[2] = 44.66;
			ob[3]= "1/1/1994";
			ob[4] = "M";
			ob[5] = "Vizag";
			
			System.out.println(ob[0]);//Nani
			System.out.println(ob[5]);//Vizag
			System.out.println(ob.length);//6
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
