package br.senai.sp.jandira;

public class MatrizAB {

	public static void main(String[] args) {

		int matrizA[] = new int[10];
		int matrizB[] = new int[10];
				
		matrizA[0] = 33;
		matrizA[1] = 41;
		matrizA[2] = 10;
		matrizA[3] = 18;
		matrizA[4] = 26;
		matrizA[5] = 15;
		matrizA[6] = 100;
		matrizA[7] = 18;
		matrizA[8] = 49;
		matrizA[9] = 53;
		
		System.out.println("*************************");
		System.out.println("   Cáluclo da Matriz B");
		System.out.println("*************************");
		System.out.println("");
		
		for(int i = 0; i < matrizA.length; i++) {
			
			System.out.println("Matriz A = " + matrizA[i]);
			
			if (i % 2 == 0) {
				matrizB[i] = matrizA[i] * 5;
				System.out.println("Matriz B = " + matrizA[i] + " x 5 = " + matrizB[i]);
				
			}else {
				matrizB[i] = matrizA[i] + 5;
				System.out.println("Matriz B = " + matrizA[i] + " + 5 = " + matrizB[i]);

			}
			
			System.out.println("");
			

		}
		
		System.out.println("*************************");
		System.out.println("         Matriz B");
		System.out.println("*************************");
		System.out.println("");

		for(int c = 0; c < 10; c++){
			System.out.print("Posição " + (c + 1) + ": ");
			System.out.println(matrizB[c]);
		}			
		
	}

}
