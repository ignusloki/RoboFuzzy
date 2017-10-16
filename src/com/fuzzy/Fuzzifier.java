package com.fuzzy;

public class Fuzzifier {

	GrauPertinencia[] gpCoordenada;

	public GrauPertinencia[] fuzzificarCoordenada(int[][] matrixVisao) {

		gpCoordenada = new GrauPertinencia[16];

		int iterador = 0;

		System.out.println("Matrix visao:");
		for (int row = 0; row < 5; row++) {

			for (int col = 0; col < 5; col++) {

				System.out.print(matrixVisao[row][col] + " ");

				if (row == 0 || row == 4 || col == 0 || col == 4) {
					if (matrixVisao[row][col] == Tabuleiro.OBSTACULO)
						gpCoordenada[iterador] = new GrauPertinencia(0, 0, 0, 0, 1, 0);
					else if (matrixVisao[row][col] == Tabuleiro.CHEGADA)
						gpCoordenada[iterador] = new GrauPertinencia(0, 0, 0, 0, 0, 1);
					else
						switch (iterador) {
						case 0: // -4 grafico
							gpCoordenada[iterador] = new GrauPertinencia(1, 0, 0, 0, 0, 0);
							break;
						case 1:
						case 5: // -3 grafico
							gpCoordenada[iterador] = new GrauPertinencia(0.75, 0.33, 0, 0, 0, 0);
							break;
						case 2:
						case 7:// -2 grafico
							gpCoordenada[iterador] = new GrauPertinencia(0.5, 0.66, 0, 0, 0, 0);
							break;
						case 3:
						case 9:// -1 grafico
							gpCoordenada[iterador] = new GrauPertinencia(0.25, 1, 0, 0, 0, 0);
							break;
						case 4:
						case 11:// 0
							gpCoordenada[iterador] = new GrauPertinencia(0, 0.5, 0.5, 0, 0, 0);
							break;
						case 6:
						case 12:// 1
							gpCoordenada[iterador] = new GrauPertinencia(0, 0, 1, 0.25, 0, 0);
							break;
						case 8:
						case 13:// 2
							gpCoordenada[iterador] = new GrauPertinencia(0, 0, 0.66, 0.5, 0, 0);
							break;
						case 10:
						case 14:// 3
							gpCoordenada[iterador] = new GrauPertinencia(0, 0, 0.33, 0.75, 0, 0);
							break;
						case 15:// 4
							gpCoordenada[iterador] = new GrauPertinencia(0, 0, 0, 1, 0, 0);
							break;
						default:
							System.out.println("Erro!!!");
							break;
						}
					iterador++;
				}

			}
			System.out.println();
		}

		return gpCoordenada;

	}

}
