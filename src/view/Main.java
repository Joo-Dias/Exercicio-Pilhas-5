package view;

import br.edu.fateczl.pilhaint.Pilha;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// Instanciando a Pilha
		Pilha pilha = new Pilha();
		
		// Criando o vetor
		int vetor[] = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3 , -6, 2, -9, 1, -5};
		
		// Criando variáveis auxiliares
		int v1 = 0;
		int v2 = 0;
		
		// Criando variável para a soma
		int somaPop;
		
		for(int i = 0; i < 16; i++) {
			if(vetor[i] > -1) {
				pilha.push(vetor[i]);
			} else {
				v1 = pilha.pop();
				v2 = pilha.pop();
				somaPop = v1 + v2;
				pilha.push(v1);
				pilha.push(somaPop);
			}
		}
		
		System.out.println("Na pilha tem um total de "+pilha.size()+" valores!");

	}

}
