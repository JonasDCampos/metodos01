import javax.swing.JOptionPane;

public class Imovel {

	//Atributos
	private String proprietario;
	private String endereco;
	private double valorImovel;
	private double valorAluguel;
	private boolean aVenda;
	private boolean disponivel;
	
	//Construtor
	public Imovel() {
		this.proprietario = "";
		this.endereco = "";
		this.valorImovel = 0;
		this.valorAluguel = 0;
		this.aVenda = false;
		this.disponivel = true;
	}
	
	//Metodos de acesso
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValorImovel() {
		
		return valorImovel;
	}
	//verificação de valor
	public void setValorImovel(double valorImovel) {
		if (valorImovel < 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}else {	
		this.valorImovel= valorImovel;
		}
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	//verificação de valor
	public void setValorAluguel(double valorAluguel) {
		if (valorAluguel < 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}else {	
		this.valorAluguel= valorAluguel;
		}
	}
	public boolean isaVenda() {
		return aVenda;
	}
	public void setaVenda(boolean aVenda) {
		this.aVenda = aVenda;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public String identificar() {
		
		String mensagem = "";
		
		if(this.isaVenda() == true && this.isDisponivel()== true){
			mensagem = "Proprietário: " + proprietario
					+ "\nA venda: Sim"
					+ "\nDísponível: Sim";
		}else{
			
			if(this.isaVenda() == true && this.isDisponivel()== false){
				mensagem = "Proprietário: " + proprietario
						+ "\nA venda: Sim"
						+ "\nDísponível: Não";
			}else{
				
				if(this.isaVenda() == false && this.isDisponivel()== false){
					mensagem = "Proprietário: " + proprietario
							+ "\nA venda: Não"
							+ "\nDísponível: Não";
				}else {
					if(this.isaVenda() == false && this.isDisponivel()== true) {
						mensagem = "Proprietário: " + proprietario
								+ "\nA venda: Não"
								+ "\nDísponível: Sim";
					}
				}
			}	
		}
		
		return mensagem;
		
	}
	
}
