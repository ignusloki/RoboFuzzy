package com.fuzzy;

public class Tabuleiro {

	static int[][] tabuleiro = new int[15][15];
	static final int OBSTACULO = 1;
	static final int LIVRE = 0;
	static final int CHEGADA = 3;

	public int pegaStatus(int x, int y) {

		return tabuleiro[y][x];

	}

	public Tabuleiro() {

		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 15; x++) {

				tabuleiro[y][x] = LIVRE;

			}
		}

		criaObstaculo();
		tabuleiro[14][14] = CHEGADA;

		imprimeTabuleiro();

	}

	private void imprimeTabuleiro() {

		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 15; x++) {

				System.out.print(tabuleiro[y][x] + " ");

			}
			System.out.println();
		}
	}

	private void criaObstaculo() {

		int numeroObstaculos = 0;

		while (numeroObstaculos < 7) {

			int base = (int) (Math.random() * 168);
			int x;
			int y;

			y = base / 15;
			x = base % 15;

			if (tabuleiro[y][x] == LIVRE && tabuleiro[y + 1][x] == LIVRE && tabuleiro[y + 2][x] == LIVRE) {

				tabuleiro[y][x] = OBSTACULO;
				tabuleiro[y + 1][x] = OBSTACULO;
				tabuleiro[y + 2][x] = OBSTACULO;
				numeroObstaculos++;

			}

		}
	}

}
