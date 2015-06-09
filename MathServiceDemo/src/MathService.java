import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MathService extends Remote
{
    public int square (int n) throws RemoteException;
}
