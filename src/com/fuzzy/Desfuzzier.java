package com.fuzzy;

public class Desfuzzier {

	private static final double NULO = -5;
	private static final double ALTISSIMO = 5;
	private static final double MUITOALTA = 3;
	private static final double POUCOALTA = 1;
	private static final double POUCOBAIXA = -1;
	private static final double MUITOBAIXA = -3;

	public int desfuzzify(GrauPertinenciaUtilidade[] utilidadePonto) {

		int destino = -1;
		double soma;
		double aux = -5;

		for (int i = 0; i < utilidadePonto.length; i++) {

			soma = utilidadePonto[i].getAltissimo() * ALTISSIMO + utilidadePonto[i].getMuitoAlta() * MUITOALTA
					+ utilidadePonto[i].getPoucoAlta() * POUCOALTA + utilidadePonto[i].getPoucoBaixa() * POUCOBAIXA
					+ utilidadePonto[i].getMuitoBaixa() * MUITOBAIXA + utilidadePonto[i].getNulo() * NULO;

			soma = soma / (utilidadePonto[i].getAltissimo() + utilidadePonto[i].getMuitoAlta()
					+ utilidadePonto[i].getPoucoAlta() + utilidadePonto[i].getPoucoBaixa()
					+ utilidadePonto[i].getMuitoBaixa() + utilidadePonto[i].getNulo());

			if (soma > aux) {

				aux = soma;
				destino = i;

			}

		}

		System.out.println("Escolhido foi: " + destino);
		return destino;

	}

}
