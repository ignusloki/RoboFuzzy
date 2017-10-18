package com.fuzzy;

public class Desfuzzier {

	public int desfuzzify(GrauPertinenciaUtilidade utilidadePonto, GrauPertinenciaCoordenadas[] grauP) {

		int destino = -1;
		double soma;
		double aux = -5;

		for (int i = 0; i < grauP.length; i++) {

			// Grau de aderencia do que é a coordenada * grau de utilidade de acordo com a
			// regra
			soma = utilidadePonto.getAltissimo() * grauP[i].getChegada()
					+ utilidadePonto.getMuitoAlta() * grauP[i].getAproximaM()
					+ utilidadePonto.getPoucoAlta() * grauP[i].getAproximaP()
					+ utilidadePonto.getPoucoBaixa() * grauP[i].getAfastaP()
					+ utilidadePonto.getMuitoBaixa() * grauP[i].getAfastaM()
					+ utilidadePonto.getNulo() * grauP[i].getObstaculo();

			soma = soma / (grauP[i].getChegada() + grauP[i].getAproximaM() + grauP[i].getAproximaP()
					+ grauP[i].getAfastaP() + grauP[i].getAfastaM() + grauP[i].getObstaculo());

			// Capturo o primeiro melhor resultado para indicar o angulo que o robo vai
			// andar
			if (soma > aux) {

				aux = soma;
				destino = i;

			}

		}

		System.out.println("Escolhido foi: " + destino);
		return destino;

	}

}
