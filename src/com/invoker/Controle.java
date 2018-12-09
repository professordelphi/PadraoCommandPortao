package com.invoker;

import com.concret.command.AbrirComando;
import com.concret.command.FecharComando;
import com.interface1.ICommand;
import com.receiver.Portao;

public class Controle {

	private ICommand abre, fecha;



	public Controle(AbrirComando abrirCommand, FecharComando fecharCommand)
	{

		 abre = abrirCommand;
		 fecha=fecharCommand;
	
	

	}

	public void abrirPortao()
	{
	abre.execute();


	}
	public void fecharPortao()
	{
	fecha.execute();


	}
	
	public void desfazerAbrir()
	{
	
		abre.undo();
	}
	
	
	
	public void desfazerFechar()
	{
	
		fecha.undo();
	}
	public Controle() {
		// TODO Auto-generated constructor stub
	}

	
}
