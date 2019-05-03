import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pacote dados = new Pacote();
		
		dados.setDescricao("Europa");
		dados.setOrigem("São Paulo");
		dados.setDestino("Rússia");
		dados.setDias(5);
		dados.setMeioTransporte("Avião");
		dados.setValor(156464);
		
		JOptionPane.showMessageDialog(null, dados.identificar());
		JOptionPane.showMessageDialog(null, "Valor: " + dados.getValor());
		
		
	}

}
