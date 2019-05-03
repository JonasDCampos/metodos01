import javax.swing.JOptionPane;

public class Pacote {

	private String descricao;
	private String origem;
	private String destino;
	private int dias;
	private String meioTransporte;
	private double valor;
	
	//Construtor 1
	
	public Pacote(){
		this.descricao = "";
		this.origem = "";
		this.destino = "";
		this.dias = 0;
		this.meioTransporte = "";
		this.valor=0 ;
	}
	
	//Construtor 2
	public Pacote(String descricao, String origem, String destino, int dias, String meioTransporte, double valor) {
		this.descricao = descricao;
		this.origem = origem;
		this.destino = destino;
		this.dias = dias;
		this.meioTransporte = meioTransporte;
		this.valor = valor;
	}
		
	//Metodos de acesso
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		if (dias <= 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}else {	
		this.dias = dias;
		}
	}
	public String getMeioTransporte() {
		return meioTransporte;
	}
	public void setMeioTransporte(String meioTransporte) {
		this.meioTransporte = meioTransporte;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if (valor <= 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
		}else {	
		this.valor = valor;
		}
	}
	public String identificar() {
		return "Descrição: "+this.descricao +
				"\nOrigem: "+this.origem +
				"\nDestino: "+this.descricao ;
	}
	
}
