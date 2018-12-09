/**
 * 
 */
package com.receiver;

/**
 * @author hp
 *
 */
public class Portao {

	/**
	 * Marcos
	 * site: http://www.csi.uneb.br/padroes_de_projetos/command_2.html
	 */
	
	public final static int ABERTO=0;
	public final static int FECHADO=1;


	private int estado=0;


	public Portao() {
		// TODO Auto-generated constructor stub
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}

	public void abrir()
	{
	this.estado= ABERTO;
	System.out.println("O portão abriu");
	}

	public void fechar()
	{
	this.estado=FECHADO;
	System.out.println("O portão fechou");
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estado;
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
		Portao other = (Portao) obj;
		if (estado != other.estado)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Portao [estado=" + estado + "]";
	}

}
