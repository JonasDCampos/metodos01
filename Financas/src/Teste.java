import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta dados = new Conta(10);
		
		dados.setAgencia("456123");
		dados.setNumero("4561-1");
		dados.setTitular("Jonas");
//		dados.getSaldo();
		
		JOptionPane.showMessageDialog(null, dados.identificar());
	}

}
