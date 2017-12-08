import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

public class ClientSender {
	public static void main(String[] args) {
		String seller, model;
	try {
			InterfaceVeiculo objRemoto = (InterfaceVeiculo) Naming.lookup("rmi://localhost:3221/veiculo");
			System.out.println("Sending new Vehicle to server");
			
			seller = JOptionPane.showInputDialog("Enter a seller:");
			float price = Float.parseFloat(JOptionPane.showInputDialog("Enter a value:"));	
			model = JOptionPane.showInputDialog("Enter a model:");
			int year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year:"));	
			objRemoto.add(new Veiculo(seller, price, model, year));
			objRemoto.add(new Veiculo("Felipe", 5000, "Caminhão", 2008));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
