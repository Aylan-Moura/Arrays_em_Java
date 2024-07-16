package br.Aylan;

public class ArrayBidimensional {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {1, 8, 3}};
        int[][] array2 = {{4, 5, 6}, {89, 2, 3}, {1, 72, 3}};

        outputArray(array1);
        System.out.println("array1");

        outputArray(array2);
        System.out.println("array2");
    }

    private static void outputArray(int[][] array) {
        for (int linha = 0; linha < array.length; linha++) {
            for (int coluna = 0; coluna < array[linha].length; coluna++) {
                int valor = array[linha][coluna];
                System.out.print(valor + " ");
            }
            /*System.out.println();*/ // Add a newline character after each row
        }
    }
}
