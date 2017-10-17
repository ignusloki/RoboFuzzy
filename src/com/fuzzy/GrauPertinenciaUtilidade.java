package com.fuzzy;

public class GrauPertinenciaUtilidade {

	public GrauPertinenciaUtilidade(double muitoBaixa, double poucoBaixa, double poucoAlta, double muitoAlta,
			double nulo, double altissimo) {
		super();
		this.muitoBaixa = muitoBaixa;
		this.poucoBaixa = poucoBaixa;
		this.poucoAlta = poucoAlta;
		this.muitoAlta = muitoAlta;
		this.nulo = nulo;
		this.altissimo = altissimo;
	}

	public GrauPertinenciaUtilidade() {

		this.muitoBaixa = 0;
		this.poucoBaixa = 0;
		this.poucoAlta = 0;
		this.muitoAlta = 0;
		this.nulo = 0;
		this.altissimo = 0;

	}

	private double muitoBaixa;
	private double poucoBaixa;
	private double poucoAlta;
	private double muitoAlta;
	private double nulo;
	private double altissimo;

	public double getMuitoBaixa() {
		return muitoBaixa;
	}

	public void setMuitoBaixa(double muitoBaixa) {
		this.muitoBaixa = muitoBaixa;
	}

	public double getPoucoBaixa() {
		return poucoBaixa;
	}

	public void setPoucoBaixa(double poucoBaixa) {
		this.poucoBaixa = poucoBaixa;
	}

	public double getPoucoAlta() {
		return poucoAlta;
	}

	public void setPoucoAlta(double poucoAlta) {
		this.poucoAlta = poucoAlta;
	}

	public double getMuitoAlta() {
		return muitoAlta;
	}

	public void setMuitoAlta(double muitoAlta) {
		this.muitoAlta = muitoAlta;
	}

	public double getNulo() {
		return nulo;
	}

	public void setNulo(double nulo) {
		this.nulo = nulo;
	}

	public double getAltissimo() {
		return altissimo;
	}

	public void setAltissimo(double altissimo) {
		this.altissimo = altissimo;
	}

}
