import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ImplementacaoInterfaceVeiculo extends UnicastRemoteObject implements InterfaceVeiculo {

    public ImplementacaoInterfaceVeiculo() throws RemoteException {
    }
	
	private List<Veiculo> carList = new ArrayList<Veiculo>(); 
	

    public List<Veiculo> search(String field, String value) throws RemoteException {
		field = field.toLowerCase();
		List<Veiculo> listReturn = new ArrayList<Veiculo>();
		System.out.println("Searching for: " + field + " by " + value);
		if (field.equals("seller")) { 
			for (int i=0; i < carList.size(); i++) {
				Veiculo v = carList.get(i);
				if(v.getSeller().contains(value))
					listReturn.add(v);
			}
		} else if(field.equals("price")) { 
			for (int i=0; i < carList.size(); i++) {
				Veiculo v = carList.get(i);
				if(v.getPrice() < Float.parseFloat(value))
					listReturn.add(v);
			}
		} else if(field.equals("model")) { 
			for (int i=0; i < carList.size(); i++) {
				Veiculo v = carList.get(i);
				if(v.getModel().equals(value))
					listReturn.add(v);
			}
		} else if(field.equals("year")) { 
			for (int i=0; i < carList.size(); i++) {
				Veiculo v = carList.get(i);
				if(v.getYear() == Integer.parseInt(value))
					listReturn.add(v);
			}
		}
		System.out.println(listReturn);	 
		return listReturn;
	}

	public void add(Veiculo v) throws RemoteException {
		carList.add(v);
	}
	

}