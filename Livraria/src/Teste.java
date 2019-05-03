import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		Produto livros = new Produto();

	
		livros.setDescricao("");
		livros.setGenero("");
		livros.setOrigem("");
		livros.setFormato("");
		livros.setPrecoCusto(0.0);
		
	
		JOptionPane.showMessageDialog(null, livros.identificar());

	}
}