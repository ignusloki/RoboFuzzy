package com.fuzzy;

public class Tabuleiro {

	static int[][] tabuleiro = new int[15][15];
	static final int OBSTACULO = 1;
	static final int LIVRE = 0;
	static final int CHEGADA = 3;

	public int pegaStatus(int x, int y) {

		return tabuleiro[x][y];

	}

	public Tabuleiro() {

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {

				tabuleiro[i][j] = LIVRE;
				System.out.println("Tabuleiro[" + i + "][" + j + "]" + " = Livre");

			}
		}

		criaObstaculo();
		tabuleiro[14][14] = CHEGADA;
	}

	private void criaObstaculo() {

		tabuleiro[2][2] = OBSTACULO;
		tabuleiro[3][2] = OBSTACULO;
		tabuleiro[4][2] = OBSTACULO;

	}

}
