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
	//verifica��o de valor
	public void setValorImovel(double valorImovel) {
		if (valorImovel < 0) {
			JOptionPane.showMessageDialog(null, "Valor inv�lido");
		}else {	
		this.valorImovel= valorImovel;
		}
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	//verifica��o de valor
	public void setValorAluguel(double valorAluguel) {
		if (valorAluguel < 0) {
			JOptionPane.showMessageDialog(null, "Valor inv�lido");
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
			mensagem = "Propriet�rio: " + proprietario
					+ "\nA venda: Sim"
					+ "\nD�spon�vel: Sim";
		}else{
			
			if(this.isaVenda() == true && this.isDisponivel()== false){
				mensagem = "Propriet�rio: " + proprietario
						+ "\nA venda: Sim"
						+ "\nD�spon�vel: N�o";
			}else{
				
				if(this.isaVenda() == false && this.isDisponivel()== false){
					mensagem = "Propriet�rio: " + proprietario
							+ "\nA venda: N�o"
							+ "\nD�spon�vel: N�o";
				}else {
					if(this.isaVenda() == false && this.isDisponivel()== true) {
						mensagem = "Propriet�rio: " + proprietario
								+ "\nA venda: N�o"
								+ "\nD�spon�vel: Sim";
					}
				}
			}	
		}
		
		return mensagem;
		
	}
	
}
