package Controller;

import Model.Fila;


public class TelefoneController {
	//insereLigacao(Filaf,  StringnumeroTelefone):void, que insere n�meros de telefone em uma fila iniciada
	//consultaLiga�coes(Filaf):void, que desenfilera cada liga��o realizada e exibe no console. 
	
	public static void insereLigacao(Fila f,  String numeroTelefone) {
		f.insert(numeroTelefone);
	}
	
	public static void consultaLigacoes(Fila f){
		while (!f.filaVazia()) {
			try {
				System.out.println(f.remove());
				
			} catch (Exception e) {
				System.err.println("N�o h� liga��es a exibir!");
				e.printStackTrace();
			}
		}
		
	}
}
