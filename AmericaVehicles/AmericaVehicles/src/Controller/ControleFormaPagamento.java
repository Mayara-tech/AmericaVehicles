package Controller;

public class ControleFormaPagamento {
	
//  A validação de números de cartão de crédito normalmente é feita pelo algoritmo de Luhn:
//  Retire o último dígito do número. Ele é o verificador;
//  Escreva os números na ordem inversa;
//  Multiplique os dígitos das casas ímpares por 2 e subtraia 9 de todos os resultados maiores que 9;
//  Some todos os números;
//  O dígito verificador (aquele do passo 1) é o número que você precisa somar a todos os outros números somados pra obter um módulo 10.
	
	public static int somaDigitos(int numero) {
		if( numero < 9 ) {
			return numero;
		} else {
			return numero%10 + 1;
		}
	}
		
	public static boolean checkValidade(String numeroCartao) { 
		
		int somaPar=0;
		int somaImpar=0;
		int aux=0;
		
		//PARES
		for( int j=numeroCartao.length()-2; j>=0; j=j-2) {
			aux = Integer.parseInt(numeroCartao.charAt(j) + "");
			somaPar = somaPar + somaDigitos(aux*2);
		}
		
		//IMPARES
		for( int i=numeroCartao.length()-1; i>=0; i=i-2) {
			aux = Integer.parseInt(numeroCartao.charAt(i) + "");
			somaImpar = somaImpar + aux;			
		}
		
		if( (somaPar+somaImpar)%10 == 0 ) {
			return true;
		} else {
			return false;
		}
		
	}
	

}
