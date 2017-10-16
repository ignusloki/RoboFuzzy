package com.fuzzy;

public class MotorInferenciaFuzzie {

	private static final double PESO_OBSTACULO = -10000;
	private static int PESO_CHEGADA = 10000;
	private static int PESO_APROXIMAM = 6;
	private static int PESO_APROXIMAP = 3;
	private static int PESO_AFASTAP = 2;
	private static int PESO_AFASTAM = 1;

	// 1- Se o ponto � chegada ent�o ande muito rapido (peso 10000) para o ponto
	// 2- Se o ponto � obstaculo ent�o n�o ande
	// 3- Se ponto aproxima muito ent�o ande r�pido (peso 6) para o ponto
	// 4- Se ponto aproxima pouco ent�o ande normal (peso 3) para o ponto
	// 5- Se ponto afasta pouco ent�o ande devagar (peso 2) para o ponto
	// 6- Se ponto afasta muito ent�o ande muito devagar (peso 1) para o ponto*/

	public double[] inferenciaFuzzie(GrauPertinencia[] grauP) {

		double[] utilidadePonto = new double[16];

		for (int i = 0; i < utilidadePonto.length; i++) {

			utilidadePonto[i] = grauP[i].getChegada() * PESO_CHEGADA + grauP[i].getAproximaM() * PESO_APROXIMAM
					+ grauP[i].getAproximaP() * PESO_APROXIMAP + grauP[i].getAfastaP() * PESO_AFASTAP
					+ grauP[i].getAfastaM() * PESO_AFASTAM + grauP[i].getObstaculo() * PESO_OBSTACULO;
			System.out.print(i + ": '" + utilidadePonto[i] + "' ");
		}
		System.out.println();

		return utilidadePonto;
	}

}
