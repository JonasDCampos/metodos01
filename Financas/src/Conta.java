
public class Conta {

	//Atributos
	private String agencia;
	private String numero;
	private String titular;
	private double saldo;
	
	//Construtor 1
	public Conta() {
		this.agencia = "";
		this.numero = "";
		this.titular = "";
		this.saldo = 0.0;
	}
	
	//Construtor 2
	public Conta(double saldo) {
		this.saldo = saldo;
	}


	// Metodos de acesso
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String identificar() {
		if (this.saldo>0) {
			return "Titular: " +this.titular+ "\nSaldo positivo!";
		}else if (this.saldo<0) {
			return "Titular: " +this.titular+ "\nSaldo negativo!";
		}else {
			return "Titular: " +this.titular+ "\nSaldo neutro!";
		}
	}
}