package Clases;

import java.util.ArrayList;
import java.util.List;

public class Lavarropas {

	private static List<Lavarropas> listaLavarropas = new ArrayList<Lavarropas>();
	private int cantProgramas = 0;
	private String nombreMarca = "generico";
	private boolean encendido = false;
	private List<Programas> programas = new ArrayList<Programas>();
	
	public Lavarropas()
	{
		
	}
	
	public Lavarropas (String nombreMarca) 
	{
		this.nombreMarca = nombreMarca;
	}
	
	public static void agregar(String nombreMarca) 
	{
		listaLavarropas.add(new Lavarropas(nombreMarca));
	}
	
	public void agregarPrograma(Programas programa) 
	{
		programas.add(programa);
	}

	public void encender(String programaSeleccionado) 
	{
		encendido = true;
		Programas programa = getPrograma(programaSeleccionado);
		
		String newline = System.lineSeparator();
		System.out.println("Lavarropas " + nombreMarca + " encendido" + newline + programa.getMensajeLavado() + newline);
	}
	
	public int getCantProgramas() {
		return cantProgramas;
	}

	public void setCantProgramas(int cantProgramas) {
		this.cantProgramas = cantProgramas;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public List<Programas> getProgramas() {
		return programas;
	}

	public void setProgramas(List<Programas> programas) {
		this.programas = programas;
	}
	
	public static List<Lavarropas> getListaLavarropas() {
		return listaLavarropas;
	}
	
	public static Lavarropas getLavarropas(String nombreMarca) 
	{		
		for(Lavarropas lavarropas : listaLavarropas)
		{
			if(nombreMarca.equals(lavarropas.getNombreMarca()))
				return lavarropas;
		}
		
		return null;
	}
		
	public Programas getPrograma(String nombrePrograma) 
	{		
		for(Programas programa : programas)
		{
			if(nombrePrograma.equals(programa.getNombrePrograma()))
				return programa;
		}
		
		return null;
	}


	@Override
	public String toString() {
		String newline = System.lineSeparator();
		
		cantProgramas = programas.size();
		
		String mensaje = "Lavarropas: " + nombreMarca + newline + "Cantidad de programas: " + cantProgramas + newline + newline;
		
		for(Programas programa : programas) 
		{
			mensaje = mensaje + programa.toString() + newline;
		}
		
		return mensaje;
	}
	
}
