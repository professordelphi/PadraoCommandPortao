/**
 * 
 */
package com.concret.command;

import com.interface1.ICommand;
import com.receiver.Portao;

/**
 * @author hp
 *
 */
public class FecharComando implements ICommand{

	/**
	 * Marcos
	 */
	
	
	private Portao portao;

	public FecharComando(Portao portao)
	{
	this.portao=portao;
	}
	
	
	public FecharComando() {
		// TODO Auto-generated constructor stub
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((portao == null) ? 0 : portao.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FecharComando other = (FecharComando) obj;
		if (portao == null) {
			if (other.portao != null)
				return false;
		} else if (!portao.equals(other.portao))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "AbrirComando [portao=" + portao + "]";
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		portao.fechar();
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		portao.abrir();
	}

}
