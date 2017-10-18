package com.fuzzy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MotorInferenciaFuzzie {

	// 1- Se o ponto é chegada então a utilidade é altissima
	// 2- Se o ponto aproxima muito então a utilidade é muito alta
	// 3- Se o ponto aproxima pouco então a utilidade é pouco alto
	// 4- Se o ponto afasta pouco então a utilidade é pouco baixa
	// 5- Se o ponto afasta muito então a utilidade é muito baixa
	// 6- Se o ponto é obstaculo então a utilidade é nula

	private static final String DBFILE = "E:\\documentos\\faculdade\\2017-2\\AI\\db_regras.txt";

	public GrauPertinenciaUtilidade inferenciaFuzzie() {

		final double ALTISSIMO = carregarRegras(1);
		final double MUITOALTA = carregarRegras(2);
		final double POUCOALTA = carregarRegras(3);
		final double POUCOBAIXA = carregarRegras(4);
		final double MUITOBAIXA = carregarRegras(5);
		final double NULO = carregarRegras(6);

		GrauPertinenciaUtilidade gpu = new GrauPertinenciaUtilidade();

		gpu.setAltissimo(ALTISSIMO);
		gpu.setMuitoAlta(MUITOALTA);
		gpu.setPoucoAlta(POUCOALTA);
		gpu.setPoucoBaixa(POUCOBAIXA);
		gpu.setMuitoBaixa(MUITOBAIXA);
		gpu.setNulo(NULO);

		return gpu;
	}

	public double carregarRegras(int regra) {

		double gpuRegra = -1000000;
		String readData;
		BufferedReader br = null;

		try {

			// Carrega o DB na memoria
			br = new BufferedReader(new FileReader(DBFILE));

			// Popula os arrays com os dados do DB usando o split ";"
			for (int i = 0; i < 6; i++) {

				readData = br.readLine();
				double value = Double.parseDouble(readData);
				if (i == regra - 1) {
					gpuRegra = value;
					System.out.println("Regra carregada: " + gpuRegra);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		/*
		 * for (int i = 0; i < arrayDeRetorno.length; i++) { for (int k = 0; k <
		 * arrayDeRetorno[i].length; k++) { System.out.print(arrayDeRetorno[i][k] +
		 * " ");
		 * 
		 * if (k == arrayDeRetorno[i].length - 1) { System.out.println(""); } } }
		 */

		return gpuRegra;
	}

}
