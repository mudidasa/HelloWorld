package helloworldapp;

public class HelloWorldApp {

	public static void main(String[] args) {
		 int index;


		 
	        System.out.println("Hello World!"); // Display the string.
	        System.out.println("I am going to print"); // Display the string.
	        
	        if (args.length != 0)
	        {
	        for (index = 0; index < args.length; ++index)
	        {
	            System.out.println("args[" + index + "]: " + args[index]);
	        }

	        }

	}

}
