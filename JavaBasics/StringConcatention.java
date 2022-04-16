package JavaBasics;

public class StringConcatention {

	public static void main(String[] args) {
		
		//+: is concatenation operator
		
	   String x = "Good Evening";
	   String y = "Satyanarayana";
	   
	   int a = 100;
	   int b = 200;
	   
	   System.out.println(x+y);//Good EveningSatyanarayana
	   System.out.println(a+b);//300
	   System.out.println(x+y+a+b);//Good EveningSatyanarayana100200
	   System.out.println(a+b+x+y);//300Good EveningSatyanarayana
	   System.out.println(a+x+b+y+(x+y));//100Good Evening200SatyanarayanaGood EveningSatyanarayana
	   System.out.println(a+x);//100Good Evening
	   
	   double c = 12.33;
	   double d = 34.66;
	   
	   System.out.println(c+d);//46.99
	   System.out.println(d);//34.66
	   System.out.println(a);//100
	   System.out.println("Hello");//Hello
	   System.out.println("the vallue of a is :"+a);//100
	   System.out.println("the value of b is ;"+b);//200
	   
	   System.out.print("Evening");
	   System.out.println("Narayana");
        //EveningNarayana	   
	
	
	
	
	
	
	
	
	
	
	}

}
