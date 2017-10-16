package com.fuzzy;

public class GrauPertinencia {

	public GrauPertinencia(double afastaM, double afastaP, double aproximaP, double aproximaM, double obstaculo,
			double chegada) {
		super();
		this.afastaM = afastaM;
		this.afastaP = afastaP;
		this.aproximaP = aproximaP;
		this.aproximaM = aproximaM;
		this.obstaculo = obstaculo;
		this.chegada = chegada;
	}

	private double afastaM;
	private double afastaP;
	private double aproximaP;
	private double aproximaM;
	private double obstaculo;
	private double chegada;

	public double getAfastaM() {
		return afastaM;
	}

	public void setAfastaM(double afastaM) {
		this.afastaM = afastaM;
	}

	public double getAfastaP() {
		return afastaP;
	}

	public void setAfastaP(double afastaP) {
		this.afastaP = afastaP;
	}

	public double getAproximaP() {
		return aproximaP;
	}

	public void setAproximaP(double aproximaP) {
		this.aproximaP = aproximaP;
	}

	public double getAproximaM() {
		return aproximaM;
	}

	public void setAproximaM(double aproximaM) {
		this.aproximaM = aproximaM;
	}

	public double getObstaculo() {
		return obstaculo;
	}

	public void setObstaculo(double obstaculo) {
		this.obstaculo = obstaculo;
	}

	public double getChegada() {
		return chegada;
	}

	public void setChegada(double chegada) {
		this.chegada = chegada;
	}

}
