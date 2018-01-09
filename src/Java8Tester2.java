import java.util.ArrayList;
import java.util.List;

public class Java8Tester2 {

   final static String salutation = "Hello! ";
   
   public static void main(String args[]) {
      GreetingService greetService1 = message -> 
      System.out.println(salutation + message);
      greetService1.sayMessage("Mahesh");
      
      
      
      List names = new ArrayList();
		
      names.add("Mahesh");
      names.add("Suresh");
      names.add("Ramesh");
      names.add("Naresh");
      names.add("Kalpesh");
		
      names.forEach(System.out::println);
      
      
      
      
      
      
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
}