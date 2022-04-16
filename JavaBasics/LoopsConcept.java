package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1.while loop:
		
		//dis -advantage of while loop:it will generate infinite loop if you don't give increment/decrement 
		
		int i =1;//initialization
		while(i<=10) {//condition
			System.out.println(i);//1 2 3 4 5 6 7 8 9  10
			i=i+1; //Increment/decrement
			
		}
		
		System.out.println("*************");
		
		//j++means j =j+1
		//2.for loop:
		
		for(int j=1;j<=10;j++) {//initialization,condition,increment,decrement
			System.out.println(j);//1  2 3 4 5 6 7 8 9 10
		}
		
		//print 10 to 1
		//10 9 8 7 6 5 4 3 2 1
		//k -- means k=k-1
		
		//-10>-1  true
		//1>10 false
		for(int k=10;k>=1;k--) {
			System.out.println(k);//10 9 8 7 6 5 4 3 2 1
		}
		
	}

}
