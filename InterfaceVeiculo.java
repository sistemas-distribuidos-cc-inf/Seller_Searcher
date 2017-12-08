import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface InterfaceVeiculo extends Remote {

   public List<Veiculo> search(String field, String value) throws RemoteException;
   public void add(Veiculo v) throws RemoteException;
}