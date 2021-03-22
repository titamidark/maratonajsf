package br.com.altsystem.beanestudante;

import java.io.Serializable;

import javax.inject.Named;

import br.com.altsystem.model.Estudante;

@Named
public class EstudanteRegistrarBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Estudante estudante = new Estudante();

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
