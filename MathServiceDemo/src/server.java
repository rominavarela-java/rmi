import java.rmi.Naming;

public class server {
	public static void main ( String args[] ) throws Exception {
	   // Create an instance of our service
	   System.setProperty("java.rmi.server.hostname", "127.0.0.2");
	   MathServiceImpl impl = new MathServiceImpl();
	   Naming.rebind ("MathService", impl);
	   System.out.println ("Service bound.");
	}
	
}
