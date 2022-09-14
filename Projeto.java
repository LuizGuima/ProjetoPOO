package universidade;

public class Projeto {
	String idProjeto;
	String descriProjeto;
	String inicioProjeto;
	String terminoProjeto;
	String coordenador;
	String integrantes;
	double valorBolsa;
	String duracaoBolsa;
	String statusProjeto;
	
	Projeto(String idProjeto,String descriProjeto,String inicioProjeto,String terminoProjeto,String coordenador,String integrantes,double valorBolsa,String duracaoBolsa, String statusProjeto){
		this.idProjeto = idProjeto;
		this.descriProjeto = descriProjeto;
		this.inicioProjeto = inicioProjeto;
		this.terminoProjeto = terminoProjeto;
		this.coordenador = coordenador;
		this.integrantes = integrantes;
		this.valorBolsa = valorBolsa;
		this.duracaoBolsa = duracaoBolsa;
		this.statusProjeto = statusProjeto;
	}
}
