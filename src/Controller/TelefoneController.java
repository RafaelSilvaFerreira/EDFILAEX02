package Controller;

import Model.Fila;


public class TelefoneController {
	//insereLigacao(Filaf,  StringnumeroTelefone):void, que insere números de telefone em uma fila iniciada
	//consultaLigaçcoes(Filaf):void, que desenfilera cada ligação realizada e exibe no console. 
	
	public static void insereLigacao(Fila f,  String numeroTelefone) {
		f.insert(numeroTelefone);
	}
	
	public static void consultaLigacoes(Fila f){
		while (!f.filaVazia()) {
			try {
				System.out.println(f.remove());
				
			} catch (Exception e) {
				System.err.println("Não há ligações a exibir!");
				e.printStackTrace();
			}
		}
		
	}
}
