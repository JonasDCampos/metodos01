import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pacote dados = new Pacote();
		
		dados.setDescricao("Europa");
		dados.setOrigem("S�o Paulo");
		dados.setDestino("R�ssia");
		dados.setDias(5);
		dados.setMeioTransporte("Avi�o");
		dados.setValor(156464);
		
		JOptionPane.showMessageDialog(null, dados.identificar());
		JOptionPane.showMessageDialog(null, "Valor: " + dados.getValor());
		
		
	}

}
