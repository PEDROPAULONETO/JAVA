package sef.module3.activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumerosInteiros2 {

	   public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        //iniciando variaveis:
	        int saoPares = 0;
	        ArrayList<Integer> numerosPares = new ArrayList<>();
	        
	        //lendo a Quantidade de entrada:
	        System.out.println();
	        System.out.print("Quantos números você deseja digitar: ");
	        int quantidadeDeNumeros = input.nextInt();
	        
	        //Criando vetor recebendo a entrada:
	        int[] numeros = new int[quantidadeDeNumeros];
	        
	        //criando la�o for para armazenar as posi��es e armazenar a quantidade de pares:
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.printf("Entre com a posição %d: ", i + 1);
	            numeros[i] = input.nextInt();
	            
	            //contando os pares
	            if (numeros[i] % 2 == 0)
	                saoPares++;
	            
	            //pegando os valores que s�o pares e armazenando em uma Lista. "esse aqui � um plus":
	            if (numeros[i] % 2 == 0){
	                numerosPares.add(numeros[i]);
	            }
	        }
	        
	        //imprimindo conforme sintaxe
	        System.out.println();
	        if (numeros.length == 1){
	            System.out.println("O número digitados é: " + Arrays.toString(numeros) + " ");
	        }else {
	            System.out.println("Os números digitados são: " + Arrays.toString(numeros) + " ");
	        }

	        if (saoPares == 1){
	            System.out.println("A quantidade de numeros pares é " + saoPares + ".");
	            System.out.println(numerosPares + " é um numero par");
	        }else{
	            System.out.println("Desses números apenas " + saoPares + " são pares.");
	            System.out.println("Os numeros pares são: " + numerosPares );
	        }

	        input.close();
	    }
}
