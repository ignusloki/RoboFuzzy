package com.fuzzy;

public class Robo {

	int passos;
	int coordenadaAtualX = 0;
	int coordenadaAtualY = 0;
	int visão = 2;
	int[][] tabuleiroVisao = new int[5][5];

	public int[][] verTabuleiro(Tabuleiro tabuleiroInicializado) {

		int posX;
		int posY;

		for (int col = 0; col < 5; col++) {
			for (int row = 0; row < 5; row++) {

				posX = coordenadaAtualX - 2 + row;
				posY = coordenadaAtualY - 2 + col;

				if (posX < 0 || posX > 14 || posY < 0 || posY > 14) {

					tabuleiroVisao[row][col] = Tabuleiro.OBSTACULO;

				} else {

					tabuleiroVisao[row][col] = tabuleiroInicializado.pegaStatus(posX, posY);

					if (row == 2 && col == 2 && tabuleiroVisao[row][col] == Tabuleiro.CHEGADA) {

						// Parada, robo chegou no fim!!
						return null;

					}
				}

				System.out.print(tabuleiroVisao[row][col] + " ");

			}
			System.out.println();
		}

		// Interpretação da visão do Robo
		// O que ele não consegue ver por causa de obstaculos, ele trata como obstaculo
		// e ignora
		if (tabuleiroVisao[1][1] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[0][0] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[1][2] == Tabuleiro.OBSTACULO && tabuleiroVisao[1][1] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[0][1] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[1][3] == Tabuleiro.OBSTACULO && tabuleiroVisao[1][2] == Tabuleiro.OBSTACULO
				&& tabuleiroVisao[1][1] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[0][2] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[1][3] == Tabuleiro.OBSTACULO && tabuleiroVisao[1][2] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[0][3] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[1][3] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[0][4] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[1][3] == Tabuleiro.OBSTACULO && tabuleiroVisao[2][3] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[1][4] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[1][3] == Tabuleiro.OBSTACULO && tabuleiroVisao[2][3] == Tabuleiro.OBSTACULO
				&& tabuleiroVisao[3][3] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[2][4] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[2][3] == Tabuleiro.OBSTACULO && tabuleiroVisao[3][3] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[3][4] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[3][3] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[4][4] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[3][3] == Tabuleiro.OBSTACULO && tabuleiroVisao[3][2] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[4][3] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[3][3] == Tabuleiro.OBSTACULO && tabuleiroVisao[3][2] == Tabuleiro.OBSTACULO
				&& tabuleiroVisao[3][1] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[4][2] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[3][2] == Tabuleiro.OBSTACULO && tabuleiroVisao[3][1] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[4][1] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[3][1] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[4][0] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[3][1] == Tabuleiro.OBSTACULO && tabuleiroVisao[2][1] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[3][0] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[3][1] == Tabuleiro.OBSTACULO && tabuleiroVisao[2][1] == Tabuleiro.OBSTACULO
				&& tabuleiroVisao[1][1] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[2][0] = Tabuleiro.OBSTACULO;
		if (tabuleiroVisao[2][1] == Tabuleiro.OBSTACULO && tabuleiroVisao[1][1] == Tabuleiro.OBSTACULO)
			tabuleiroVisao[1][0] = Tabuleiro.OBSTACULO;

		return tabuleiroVisao;

	}

	public void andarTabuleiro(int direcao) {

		switch (direcao) {
		case 0:
			coordenadaAtualX = coordenadaAtualX - 2;
			coordenadaAtualY = coordenadaAtualY - 2;
			System.out.println("Andou: x-2 e y-2");
			break;
		case 1:
			coordenadaAtualX = coordenadaAtualX - 1;
			coordenadaAtualY = coordenadaAtualY - 2;
			System.out.println("Andou: x-2 e y-1");
			break;
		case 2:
			coordenadaAtualY = coordenadaAtualY - 2;
			System.out.println("Andou: y-2");
			break;
		case 3:
			coordenadaAtualX = coordenadaAtualX + 1;
			coordenadaAtualY = coordenadaAtualY - 2;
			System.out.println("Andou: x+1 e y-2");
			break;
		case 4:
			coordenadaAtualX = coordenadaAtualX + 2;
			coordenadaAtualY = coordenadaAtualY - 2;
			System.out.println("Andou: x+2 e y-2");
			break;
		case 5:
			coordenadaAtualX = coordenadaAtualX - 2;
			coordenadaAtualY = coordenadaAtualY - 1;
			System.out.println("Andou: x-2 e y-1");
			break;
		case 6:
			coordenadaAtualX = coordenadaAtualX + 2;
			coordenadaAtualY = coordenadaAtualY - 1;
			System.out.println("Andou: x+2 e y-1");
			break;
		case 7:
			coordenadaAtualX = coordenadaAtualX - 2;
			System.out.println("Andou: x-2");
			break;
		case 8:
			coordenadaAtualX = coordenadaAtualX + 2;
			System.out.println("Andou: x+2");
			break;
		case 9:
			coordenadaAtualX = coordenadaAtualX - 2;
			coordenadaAtualY = coordenadaAtualY + 1;
			System.out.println("Andou: x-2 e y+1");
			break;
		case 10:
			coordenadaAtualX = coordenadaAtualX + 2;
			coordenadaAtualY = coordenadaAtualY + 1;
			System.out.println("Andou: x+2 e y+1");
			break;
		case 11:
			coordenadaAtualX = coordenadaAtualX - 2;
			coordenadaAtualY = coordenadaAtualY + 2;
			System.out.println("Andou: x-2 e y+2");
			break;
		case 12:
			coordenadaAtualX = coordenadaAtualX - 1;
			coordenadaAtualY = coordenadaAtualY + 2;
			System.out.println("Andou: x-1 e y+2");
			break;
		case 13:
			coordenadaAtualY = coordenadaAtualY + 2;
			System.out.println("Andou: y+2");
			break;
		case 14:
			coordenadaAtualX = coordenadaAtualX + 1;
			coordenadaAtualY = coordenadaAtualY + 2;
			System.out.println("Andou: x+1 e y+2");
			break;
		case 15:
			coordenadaAtualX = coordenadaAtualX + 2;
			coordenadaAtualY = coordenadaAtualY + 2;
			System.out.println("Andou: x+2 e y+2");
			break;
		case -1:
		default:
			System.out.println("Ficar parado!!!!!");
			break;
		}
		System.out.println("Coordenadas do Robo: " + coordenadaAtualX + "," + coordenadaAtualY);
		System.out.println();

	}
}
