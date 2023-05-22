package Ejer;

import java.util.Scanner;

public class Matriz_max_por_menos {
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		// Matriz cuadrada de 3x3
		int matriz[][] = new int[3][3];
		// Rellenams la matriz
		rellenarMatriz(matriz);
		// Mostrar matriz random
		System.out.println("Array normal:");
		ShowMatriz(matriz);
		System.out.println("");
		System.out.println("Array max por min: ");
		Minimo(matriz);
		Maximo(matriz);
		ShowMatriz(matriz);
	}

	public static void ShowMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void rellenarMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 9 + 1);

			}
		}

	}

	public static void Minimo(int[][] matriz) {
		int min= 10;
		System.out.println();
		for (int x = 0; x <= 2; x++) {
			for (int i = 0; i <= 2; i++) {
				if (matriz[x][i] < min) {
					min=matriz[x][i];
				}
			}
		}
		System.out.println(min);

	}
	public static void Maximo(int[][] matriz) {
		int max = -1;
		System.out.println();
		for (int x = 0; x <= 2; x++) {
			for (int i = 0; i <= 2; i++) {
				if (matriz[x][i] > max) {
					max=matriz[x][i];
				}
			}
		}
		System.out.println(max);

	}
}
