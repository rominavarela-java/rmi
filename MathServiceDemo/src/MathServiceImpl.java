import java.rmi.*;
import java.rmi.server.*;

public class MathServiceImpl extends UnicastRemoteObject implements MathService
{
	private static final long serialVersionUID = 1L;

	public MathServiceImpl () throws RemoteException
    {
        super();
    }

    public int square(int n) throws RemoteException
    {
        return n*n;
    }
}
