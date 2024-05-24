import java.rmi.*;
import java.rmi.server.*;
public class MathServerImpl extends UnicastRemoteObject implements MathServerInf
{
	public MathServerImpl() throws RemoteException
	{
			System.out.println("Invoking of Remote Method has started.....");
	}
	public long add(int a, int b) throws RemoteException
	{
		System.out.println("Processing of Addtion Operation");
		return (a+b);
	}
	public long sub(int a, int b) throws RemoteException
	{
		System.out.println("Processing of Subtraction Operation");
		return (Math.abs(a-b));
	}
	public long product(int a, int b) throws RemoteException
	{
		System.out.println("Processing of Multiplication Operation");
		return (a*b);
	}
	public float div(int a, int b) throws RemoteException
	{
		System.out.println("Processing of Division Operation");
		return (a/b);
	}
}
