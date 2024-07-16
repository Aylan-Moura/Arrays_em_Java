package br.Aylan;

public class BubbleSort {
public static void main(String[] args) {
	int[] vet = {5,2,9,7,4,6,8,9,1};
	int aux = 0;
	int i = 0;
	
	System.out.println("Vetor desordenado");
	for(i = 0; i<9; i++){
	 System.out.println(vet[i]);
	 }
	
	System.out.println(" ");
	
	for(i=0; i<9; i++) {
		for(int j =0; j<8; j++){
		if(vet[j]>vet[j+1]) {
			aux=vet[j];
			vet[j]=vet[j+1];
			vet[j+1]=aux;
		}	
		}
	}
	
	System.out.println("Vetor organizado");
	for(i=0; i<8; i++) {
		System.out.println(" "+ vet[i]);
	}
	
}
}
