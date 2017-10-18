package com.fuzzy;

public class InterfaceFuzzy {

	static int i = 0;
	static boolean chegou = false;
	static int[][] statusCoordenada;

	public static void main(String[] args) {

		// Monta o tabuleiro e inicializa os objetos
		Tabuleiro tabuleiro = new Tabuleiro();
		Robo robo = new Robo();
		Fuzzifier fuzzifier = new Fuzzifier();
		MotorInferenciaFuzzie motorI = new MotorInferenciaFuzzie();
		Desfuzzier desfuzzifier = new Desfuzzier();
		GrauPertinenciaCoordenadas[] grauP;
		GrauPertinenciaUtilidade[] utilidadePonto;
		int direcao;
		int passos;

		while (!chegou) {

			// Vê dois de espaco do tabuleiro e monta uma matrix visão
			statusCoordenada = robo.verTabuleiro(tabuleiro);
			passos = Robo.getContador();

			// Caso o Robo fique preso por uma condição dos obstaculos
			if (passos == 100) {
				System.out.println("Robo demorou demais e deve ter ficado preso! Numero de passos: " + passos);
				break;
			}

			// Método de parada quando chegar na chegada!
			if (statusCoordenada == null) {
				System.out.println("Robo chegou no final com " + passos + " passos");
				break;
			}

			// Pega as coordenadas do tabuleiro e fuzzifica para tomar decisao pelo motor
			grauP = fuzzifier.fuzzificarCoordenada(statusCoordenada);

			// Realiza a inferencia com as regras
			utilidadePonto = motorI.inferenciaFuzzie(grauP);

			// Desfuzzifica para tomar a decisão
			direcao = desfuzzifier.desfuzzify(utilidadePonto);

			// Anda com o robo
			robo.andarTabuleiro(direcao);

		}

	}

}
