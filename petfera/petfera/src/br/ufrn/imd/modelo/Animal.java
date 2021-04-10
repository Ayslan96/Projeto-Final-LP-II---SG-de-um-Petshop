package br.ufrn.imd.modelo;

public abstract class Animal implements AcaoComum{

	int id;
	String classe;
	String nomeCientifico;
	String sexo;
	double tamanho;
	String dieta;
	String veterinario;
	String tratador;
	String nomeBatismo;
	String autorizacaoIbama;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getDieta() {
		return dieta;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	public String getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}
	public String getTratador() {
		return tratador;
	}
	public void setTratador(String tratador) {
		this.tratador = tratador;
	}
	public String getNomeBatismo() {
		return nomeBatismo;
	}
	public void setNomeBatismo(String nomeBatismo) {
		this.nomeBatismo = nomeBatismo;
	}
	public String getAutorizacaoIbama() {
		return autorizacaoIbama;
	}
	public void setAutorizacaoIbama(String autorizacaoIbama) {
		this.autorizacaoIbama = autorizacaoIbama;
	}
	
	@Override
	public void alimentar(){
		System.out.println("Alimentando...");
	}	
	
}
