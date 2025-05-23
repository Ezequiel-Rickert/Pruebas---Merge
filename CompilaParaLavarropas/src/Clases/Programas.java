package Clases;

import java.util.ArrayList;
import java.util.List;

public class Programas {

	private static List<Programas> listaProgramas = new ArrayList<Programas>();
	private String nombrePrograma;
	private int minutosDeLavado;
	private int numeroPrograma;
	private String mensajeLavado;
	
	public Programas(String nombrePrograma, String mensajeLavado, int minutosDeLavado, int numeroPrograma) 
	{
		this.nombrePrograma = nombrePrograma;
		this.mensajeLavado = mensajeLavado;
		this.minutosDeLavado = minutosDeLavado;
		this.numeroPrograma = numeroPrograma;
	}
	
	public static void agregar(String nombrePrograma, String mensajeLavado, int minutosDeLavado, int numeroPrograma)
	{
		listaProgramas.add(new Programas(nombrePrograma, mensajeLavado, minutosDeLavado, numeroPrograma));
	}
	
	public String getNombrePrograma() {
		return nombrePrograma;
	}
	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}
	public int getMinutosDeLavado() {
		return minutosDeLavado;
	}
	public void setMinutosDeLavado(int minutosDeLavado) {
		this.minutosDeLavado = minutosDeLavado;
	}
	public int getNumeroPrograma() {
		return numeroPrograma;
	}
	public void setNumeroPrograma(int numeroPrograma) {
		this.numeroPrograma = numeroPrograma;
	}
	
	public String getMensajeLavado() {
		return mensajeLavado;
	}

	public void setMensajeLavado(String mensajeLavado) {
		this.mensajeLavado = mensajeLavado;
	}

	public static List<Programas> getListaProgramas() {
		return listaProgramas;
	}

	public static Programas getPrograma(String nombrePrograma) 
	{		
		for(Programas programa : listaProgramas)
		{
			if(nombrePrograma.equals(programa.getNombrePrograma()))
				return programa;
		}
		
		return null;
	}

	@Override
	public String toString() {
		String newline = System.lineSeparator();
		
		return "Programa: " + nombrePrograma + newline + "Minutos de Lavado: " + minutosDeLavado + newline + "NumeroPrograma: " + numeroPrograma + newline;
	}
	
}
