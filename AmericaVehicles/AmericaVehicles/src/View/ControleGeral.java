package View;
import java.util.Date;
import java.util.Scanner;

import Controller.*;
import Model.*;
import View.*;

public class ControleGeral {

	public static void main(String[] args) {
		 int opcao;
		 int opcao1;
		 int opcao2;
		 int opcao3;
		 
		
		System.out.print("======================================================================\n");
		System.out.print("                          WELCOME TO AMERICA VEHICLES             \n\n ");
		System.out.print("Selecione a opção que deseja utilizar: \n");
		System.out.print("1.Entrar como Cliente \n");
		System.out.print("2.Entrar como Vendedor \n");
		
		Scanner ler = new Scanner(System.in);
		opcao = ler.nextInt();
		switch (opcao) {
     	case 1: 
    		System.out.print("            Bem vindos a pagina do cliente           \n");
     		System.out.print("Selecione a opção que deseja utilizar: \n");
     		System.out.print("1.Cadastrar Cliente \n");
     		System.out.print("2.Visualizar Clientes Cadastrados \n");
    		opcao1 = ler.nextInt();
    		switch (opcao1) {
         	case 1: 
         		Cliente[] cliente = new Cliente [1];
         		cliente[0] = new Cliente ("MAYARA ALVES DE OLIVEIRA", 358715697, 552056553 , 23042002, "Faturista",
         				2500.0f, "Solteira", "IGOR LUNA ALMEIDA", "MARIA JOSE ALVES DE OLIVEIRA");
        		System.out.print("Cliente cadastrado com sucesso           \n");
         	break;
         	case 2:
         		Cliente cliente1 = new Cliente("MAYARA ALVES DE OLIVEIRA", 358715697, 552056553 , 23/04/2002, "Faturista",
         				2500.0f, "Solteira", "IGOR LUNA ALMEIDA", "MARIA JOSE ALVES DE OLIVEIRA");
         		cliente1.ApresentarCliente();
         			
         	break;
         	default: 
         		System.out.println("Opção Invalida. Tente Novamente!");
         	break;
         }
     	break;
     	case 2:System.out.print("            Bem vindos a pagina do Vendedor           \n");
 		System.out.print("Selecione a opção que deseja utilizar: \n");
 		System.out.print("1.Cadastrar Vendedor \n");
 		System.out.print("2.Cadastrar Veiculo \n");
		opcao1 = ler.nextInt();
		switch (opcao1) {
     	case 1: 
     		Vendedor[] vendedor = new Vendedor [1];
     		vendedor[0] = new Vendedor ("MAYARA ALVES DE OLIVEIRA", 358715697, 552056553 , 23042002, "amayara939@gmail.com",
     				"Brasileira", "Brasilia");
    		System.out.print("Vendedor cadastrado com sucesso           \n");
     	break;
     	case 2:
     		Carro carro1 = new Carro("CARRO", "FIAT", "MOBI" , 2015, 25000.0f,
     				"SEMI NOVO","UNICO DONO, COM TODOS OS DOCUMENTOS EM DIAS, SEM BATIDA", "BRANCO", "AUTOMATICO", 2586165);
    		System.out.print("Carro cadastrado com sucesso           \n");
     		carro1.ApresentarCarro();
     			
     	break;
     	default: 
     		System.out.println("Opção Invalida. Tente Novamente!");
     	break;
     }
     	break;
     	default: 
     		System.out.println("Opção Invalida. Tente Novamente!");
     	break;
     }
		

	}

}
