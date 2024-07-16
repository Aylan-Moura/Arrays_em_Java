package br.Aylan;

public class ExemplosArray {
	public static void main(String[] args) {
		exp1();
		exp2();
		
	}

	private static void exp2() {
		// TODO Auto-generated method stub
		int[] a = new int[4]; /* primeira maneira de criar um array*/
		
		int[] b; /* segunda maneira*/
		b = new int[10];
		
		int[] iniciandoValores = {1,2,3,4,5,6,7,8,9}; /* ja coloca os valores de um array*/
		
		int [] meuArray; /* cria um array de inteiros*/
		meuArray = new int [10]; /* aloca memoria para dentro do arrray*/
		
		/* inicializa os elementos*/
		meuArray [0] = 100;
		meuArray [1] = 200;
		meuArray [2] = 30;
		meuArray [3] = 1500;
		meuArray [4] = 1050;
		meuArray [5] = 100;
		meuArray [6] = 17800;
		meuArray [7] = 100;
		meuArray [8] = 15400;
		meuArray [9] = 18700;
		
		/*System.out.println(meuArray[9]);*/
		
		int total = 0;
		/*for (int i : meuArray) {
			total+=i;
		}
		System.out.println(" Total de elementos de um array " + total);*/
		
		/*Pecorrendo o array*/
		for(int i = 0; i <meuArray.length; i++) {
			System.out.println(meuArray[i]);
		}
		

		
	}

	private static void exp1() {
		// TODO Auto-generated method stub
		
	}
	
	
}
