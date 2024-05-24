import java.rmi.*;
public interface MathServerInf extends Remote{
	public long add(int a, int b) throws RemoteException;
	public long sub(int a, int b) throws RemoteException;
	public long product(int a, int b) throws RemoteException;
	public float div(int a, int b) throws RemoteException;
}
