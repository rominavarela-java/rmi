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
		
		int square = mathService.square(2);
		System.out.println(square);
	}
}
