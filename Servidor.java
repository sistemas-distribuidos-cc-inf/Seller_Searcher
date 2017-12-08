import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class Servidor {
	public Servidor() throws RemoteException {
        try {
           LocateRegistry.createRegistry(3221);
		   /* Registra o nome do serviço */
           Naming.rebind("rmi://localhost:3221/veiculo", new ImplementacaoInterfaceVeiculo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws RemoteException {
       new Servidor();
	   System.out.println("Server connected...");
    }
	


}
