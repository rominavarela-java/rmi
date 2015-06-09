import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Code responsible for creating an instance of MathService <br/>
 * and registering (or binding) the service with the RMI Registry <br/>
 * Registry port is 1099.
 * @see <li>http://stackoverflow.com/questions/23104661/rmi-connection-refused-on-localhost
 * @see <li>http://www.javacoffeebreak.com/articles/javarmi/javarmi.html
 */
public class server {
	public static void main ( String args[] ) throws Exception {
		LocateRegistry.createRegistry(1099);
		MathServiceImpl impl=new MathServiceImpl();
		Naming.rebind("//localhost:1099/MathService", impl);
		System.out.println("Implementation has been bind and is ready for use");
	}
}
