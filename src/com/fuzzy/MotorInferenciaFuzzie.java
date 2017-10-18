package com.fuzzy;

public class MotorInferenciaFuzzie {

	// 1- Se o ponto � chegada ent�o a utilidade � altissima
	// 2- Se o ponto � obstaculo ent�o a utilidade � nula
	// 3- Se ponto aproxima muito ent�o a utilidade � muito alta
	// 4- Se ponto aproxima pouco ent�o a utilidade � pouco alto
	// 5- Se ponto afasta pouco ent�o a utilidade � pouco baixa
	// 6- Se ponto afasta muito ent�o a utilidade � muito baixa

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
