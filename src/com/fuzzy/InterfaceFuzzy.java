package com.fuzzy;

public class InterfaceFuzzy {

	static int i = 0;
	static boolean chegou = false;
	static int[][] statusCoordenada;

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro();
		Robo robo = new Robo();
		Fuzzifier fuzzifier = new Fuzzifier();
		GrauPertinencia[] grauP;
		MotorInferenciaFuzzie motorI = new MotorInferenciaFuzzie();
		Desfuzzier desfuzzifier = new Desfuzzier();
		double[] utilidadePonto;
		int direcao;

		while (!chegou) {

			// Vê dois de espaco do tabuleiro e monta uma matrix visão
			statusCoordenada = robo.verTabuleiro(tabuleiro);

			if (statusCoordenada == null) {
				System.out.println("Robo chegou em no final");
				break;
			}

			// Pega as coordenadas do tabuleiro e fuzzifica para tomar decisao pelo motor
			grauP = fuzzifier.fuzzificarCoordenada(statusCoordenada);

			// Realiza a inferencia com as regras
			utilidadePonto = motorI.inferenciaFuzzie(grauP);

			direcao = desfuzzifier.desfuzzify(utilidadePonto);

			robo.andarTabuleiro(direcao);

		}

	}

}
