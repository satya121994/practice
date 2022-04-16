package JavaBasics;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		//++
		//--
		
		//post increment
		int i = 10;
		int j = i++;
		System.out.println(i);//11
		System.out.println(j);//10
		
		//pre increment
		int a = 22;
		int b = ++a;
		System.out.println(a);//23
		System.out.println(b);//23
		
		
		//post decrement
		int m =2;
		int n =m--;
		System.out.println(m);//1
		System.out.println(n);//2
		
		//pre decrement
		int p = 49;
		int q = --p;
		System.out.println(p);//48
		System.out.println(q);//48
		
			}

}
