package com.fuzzy;

public class MotorInferenciaFuzzie {

	// 1- Se o ponto é chegada então a utilidade é altissima
	// 2- Se o ponto é obstaculo então a utilidade é nula
	// 3- Se ponto aproxima muito então a utilidade é muito alta
	// 4- Se ponto aproxima pouco então a utilidade é pouco alto
	// 5- Se ponto afasta pouco então a utilidade é pouco baixa
	// 6- Se ponto afasta muito então a utilidade é muito baixa

	public GrauPertinenciaUtilidade[] inferenciaFuzzie(GrauPertinenciaCoordenadas[] grauP) {

		GrauPertinenciaUtilidade[] utilidadePonto = new GrauPertinenciaUtilidade[16];

		for (int i = 0; i < utilidadePonto.length; i++) {

			GrauPertinenciaUtilidade gpu = new GrauPertinenciaUtilidade();

			gpu.setNulo(grauP[i].getObstaculo());
			gpu.setAltissimo(grauP[i].getChegada());
			gpu.setMuitoBaixa(grauP[i].getAfastaM());
			gpu.setPoucoBaixa(grauP[i].getAfastaP());
			gpu.setPoucoAlta(grauP[i].getAproximaP());
			gpu.setMuitoAlta(grauP[i].getAproximaM());

			utilidadePonto[i] = gpu;

		}
		System.out.println();

		return utilidadePonto;
	}

}
