public class Produto {

	// Atributos
	private String descricao;
	private String genero;
	private String origem;
	private String formato;
	private Double precoCusto;
	
	// Construtores
	public Produto(){
		this.descricao = "";
		this.genero = "";
		this.origem = "";
		this.formato = "";
		this.precoCusto = 0.0;
	}
	
	public Produto(String descricao, String genero, String origem, String formato, Double precoCusto) {
		this.descricao = descricao;
		this.genero = genero;
		this.origem = origem;
		this.formato = formato;
		this.precoCusto = precoCusto;
	}
	
	// Metodos de Acesso
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public Double getPrecoCusto() {
		return precoCusto;
	}
	
	public void setPrecoCusto(Double precoCusto){
		this.precoCusto = precoCusto;
	}
		
	public String identificar() {
		return "Descrição: " + this.getDescricao() + 
				"\n Gênero: " + this.getGenero() +
				"\n Origem: " + this.getOrigem() +
				"\n Formato: " + this.getFormato() +
				"\n Preço Custo: " + this.getPrecoCusto();
	}
}