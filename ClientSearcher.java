import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;

public class ClientSearcher {

	public static void main(String[] args) {
		String type, value;
		try {
			InterfaceVeiculo objRemoto = (InterfaceVeiculo) Naming.lookup("rmi://localhost:3221/veiculo");
			type = JOptionPane.showInputDialog("Please enter (seller/year/model/price):");
			value = JOptionPane.showInputDialog("Enter a value:");
            List<Veiculo> msg = (List) objRemoto.search(type, value);
			for (int i=0; i < msg.size(); i++) { 
				Veiculo v = msg.get(i);
				System.out.println(v.getSeller() + " is selling Year:" + v.getYear() + " Model:" + v.getModel() + " Price " + v.getPrice());
			}
			System.out.println("Message from Server: " + msg);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
