import java.rmi.Naming;


public class client {
	public static void main ( String args[] ) throws Exception {		
		String url = "rmi://localhost:6789/MathService";
		MathService mathService = (MathService)Naming.lookup(url);
		
		int square = mathService.square(2);
		System.out.println(square);
	}
}
