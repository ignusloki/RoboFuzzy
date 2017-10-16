package com.fuzzy;

public class Desfuzzier {

	public int desfuzzify(double[] utilidadePonto) {

		int destino = -1;
		double aux = -10000;

		for (int i = 0; i < utilidadePonto.length; i++) {

			if (utilidadePonto[i] > aux) {

				aux = utilidadePonto[i];
				destino = i;

			}

		}

		System.out.println("Escolhido foi: " + destino);
		return destino;

	}

}
