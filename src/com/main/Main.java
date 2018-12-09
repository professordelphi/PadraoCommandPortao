package com.main;

import com.concret.command.AbrirComando;
import com.concret.command.FecharComando;
import com.invoker.Controle;
import com.receiver.Portao;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args){
	       
		 //cria-se o objeto portao
		 Portao portao = new Portao();

		 //objetos do tipos: AbrirComando, FecharComando. Recebendo como parametro o objeto Portao
	        AbrirComando abrirCommand = new AbrirComando(portao);
	        FecharComando fecharCommand = new FecharComando(portao);
	        
	  Controle controle = new Controle(abrirCommand, fecharCommand);

	        controle.abrirPortao();
	        controle.desfazerAbrir();
	        controle.fecharPortao();
	        controle.desfazerFechar();
	 

	        
	    }
}
