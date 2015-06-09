import java.rmi.Naming;

/**
 * Client must contact an RMI registry, and request the name of the service. <br/>
 * Client won't know the exact location this service, but he knows enough to contact it's registry. <br/>
 * The service may change regularly, so client doesn't have a copy of the class (MathService).
 * @author espnosa
 */
public class client {
	public static void main ( String args[] ) throws Exception {
		String url = "rmi://localhost:1099/MathService";
		MathService mathService = (MathService)Naming.lookup(url);

		if(args.length > 0)
			for(int i=0; i<args.length; i++)
			{
				int n= Integer.parseInt(args[i]);
				int square = mathService.square(n);
				System.out.println(square);
			}
		else
			System.err.println("you should pass at least one number in the arguments");

		System.out.println("demo terminated");
	}
}
