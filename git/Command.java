package git;

public class Command {


	    public static void main(String[] args) {
	        // Check if command-line arguments are provided
	        if (args.length == 0) {
	            System.out.println("No input provided. Please provide a value as a command-line argument.");
	            return;
	        }
	       
	        // Print the provided input
	        System.out.println("Input provided from command line:");
	        for (String arg : args) {
	        	
	            System.out.println(arg);
	            
	        }
	        
	    }
}

