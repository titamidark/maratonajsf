package br.com.altsystem.beanestudante;


import java.io.Serializable;
import java.util.*;

import javax.inject.Named;

import br.com.altsystem.model.Estudante;

@Named
public class EstudanteRegistrarBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Estudante estudante = new Estudante();
	
	private String[] nomesArray = {"Altamir", "Cristianne", "Geovanna", "Joelma"};
	private String[] nomesListas = {"Alair", "Leninha", "Bernardo", "Eu"};	
	private List<String> nomepais = Arrays.asList("Brasil", "Argentina", "Paraguai", "Brasil", "Paraguai");
	private List<String> nomesList = Arrays.asList(nomesListas);
	private Set<String> nomesSet = new HashSet<String>(nomepais);
	private Map<String,String> nomesMap = new HashMap<>();
	
	{
		nomesMap.put("Altamir", "O mais lindo");
		nomesMap.put("Ster", "Filha Mulher");
		nomesMap.put("Caio", "O caçula");
	}
	
	public void executar() {
		System.out.println("Fazendo uma busca no Banco de Dados");
		System.out.println("Processando os dados");
		System.out.println("Exibindo os dados");
	}
	
	public String irParaPagina02() {
		return "page02?faces-redirect=true";
	}
	
	public Map<String, String> getNomesMap() {
		return nomesMap;
	}

	public void setNomesMap(Map<String, String> nomesMap) {
		this.nomesMap = nomesMap;
	}

	public List<String> getNomepais() {
		return nomepais;
	}

	public void setNomepais(List<String> nomepais) {
		this.nomepais = nomepais;
	}

	public Set<String> getNomesSet() {
		return nomesSet;
	}

	public void setNomesSet(Set<String> nomesSet) {
		this.nomesSet = nomesSet;
	}

	public String[] getNomesListas() {
		return nomesListas;
	}

	public void setNomesListas(String[] nomesListas) {
		this.nomesListas = nomesListas;
	}

	public List<String> getNomesList() {
		return nomesList;
	}

	public void setNomesList(List<String> nomesList) {
		this.nomesList = nomesList;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String[] getNomesArray() {
		return nomesArray;
	}

	public void setNomesArray(String[] nomesArray) {
		this.nomesArray = nomesArray;
	}
	
	

}
