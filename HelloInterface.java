import java.rmi.*;
import java.rmi.server.*;
public interface HelloInterface extends Remote 
{
 public String say() throws RemoteException;
}
