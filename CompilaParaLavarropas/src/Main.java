import java.util.ArrayList;
import java.util.List;
import java.awt.Image;
import java.awt.Toolkit;

import Clases.Graficos;
import Clases.Lavarropas;
import Clases.Programas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 1;
		
		String palabra = "Sopa";
		
		List<String> listaEspecialidades = new ArrayList<String>();
		
		//Comentario de ejemplo - push a main
		
		//Codigo realizado en Branch - Eze-Branch
		
		Lavarropas.agregar("KOH-I-NOOR A655 Linea Acero");
		Lavarropas.agregar("Whirlpool Corporation");
		Lavarropas.agregar("Drean");
		Lavarropas.agregar("Samsung");
		Lavarropas.agregar("LG");
		
		Programas.agregar("Lavado Rapido","Iniciando Lavado rapido, por favor no abra la puerta", 60, 1);
		Programas.agregar("Lavado Suave", "Lavado Suave seleccionado, cargando agua caliente", 90, 2);
		Programas.agregar("Enjuague","Enjuague inciado, su ropa estara limpia en unos minutos" , 30, 3);
		Programas.agregar("Prendas Blancas", "Programa ropa blanca seleccionado, preparando jabon especial", 60, 4);
		Programas.agregar("Prendas delicadas","Preparando agua templada", 120, 5);
		Programas.agregar("Centrifugado","Iniciando centrifugado a 2800 RPM, su ropa esta casi limpia!!!", 20, 6);
		
		Lavarropas.getLavarropas("Samsung").agregarPrograma((Programas.getPrograma("Lavado Rapido")));
		Lavarropas.getLavarropas("Samsung").agregarPrograma((Programas.getPrograma("Lavado Suave")));
		Lavarropas.getLavarropas("Samsung").agregarPrograma((Programas.getPrograma("Prendas Blancas")));
		Lavarropas.getLavarropas("KOH-I-NOOR A655 Linea Acero").agregarPrograma((Programas.getPrograma("Prendas Blancas")));
		Lavarropas.getLavarropas("KOH-I-NOOR A655 Linea Acero").agregarPrograma((Programas.getPrograma("Centrifugado")));
		Lavarropas.getLavarropas("Whirlpool Corporation").agregarPrograma((Programas.getPrograma("Prendas delicadas")));
		Lavarropas.getLavarropas("Drean").agregarPrograma((Programas.getPrograma("Centrifugado")));
		Lavarropas.getLavarropas("Drean").agregarPrograma((Programas.getPrograma("Enjuague")));
		Lavarropas.getLavarropas("Drean").agregarPrograma((Programas.getPrograma("Lavado Suave")));
		
		Lavarropas.getLavarropas("LG").agregarPrograma((Programas.getPrograma("Lavado Rapido")));
		Lavarropas.getLavarropas("LG").agregarPrograma((Programas.getPrograma("Lavado Suave")));
		Lavarropas.getLavarropas("LG").agregarPrograma((Programas.getPrograma("Prendas Blancas")));
		Lavarropas.getLavarropas("LG").agregarPrograma((Programas.getPrograma("Centrifugado")));
		
		Lavarropas.getLavarropas("Whirlpool Corporation").agregarPrograma((Programas.getPrograma("Enjuague")));
		Lavarropas.getLavarropas("Whirlpool Corporation").agregarPrograma((Programas.getPrograma("Prendas Blancas")));
		Lavarropas.getLavarropas("Whirlpool Corporation").agregarPrograma((Programas.getPrograma("Lavado Suave")));
		
		for(Programas programa : Programas.getListaProgramas())
		{
			System.out.println(programa.toString());
		}
		
		System.out.println("------------------");
		
		for(Lavarropas lavarropas : Lavarropas.getListaLavarropas())
		{
			System.out.println(lavarropas.toString());
			System.out.println("------------------");
		}
		
		//Codificacion en base al hardware especifico del dispositivo electronico
		//...........
		
		Lavarropas.getLavarropas("LG").encender("Lavado Suave");
		Lavarropas.getLavarropas("Drean").encender("Enjuague");
		Lavarropas.getLavarropas("Samsung").encender("Prendas Blancas");
		Lavarropas.getLavarropas("Whirlpool Corporation").encender("Prendas delicadas");
		Lavarropas.getLavarropas("KOH-I-NOOR A655 Linea Acero").encender("Centrifugado");
		
		//Con Chuavechito Vivere, llegas.
		
		Image imagen = Toolkit.getDefaultToolkit().getImage("imagenes/LavarropasJPG.jpg");
		
		imagen = imagen.getScaledInstance(800, 600, Image.SCALE_FAST);
		Graficos ventana = new Graficos();
		ventana.setImagen(imagen);
		ventana.activar();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		imagen = Toolkit.getDefaultToolkit().getImage("imagenes/Samsung.jpg");
		imagen = imagen.getScaledInstance(800, 600, Image.SCALE_FAST);
		ventana.setImagen(imagen);
		ventana.repaint();
		
		List<String> rutaImagenes = new ArrayList<String>();
		rutaImagenes.add("imagenes/Lavarropas/Whirpool.jpg");
		rutaImagenes.add("imagenes/Lavarropas/KOH-I-NOOR.jpg");
		rutaImagenes.add("imagenes/Lavarropas/KOH-I-NOOR A655 Linea Acero.jpg");
		rutaImagenes.add("imagenes/Lavarropas/Samsung.jpg");
		rutaImagenes.add("imagenes/Lavarropas/Drean.jpg");
		rutaImagenes.add("imagenes/Lavarropas/LG.jpg");
		rutaImagenes.add("imagenes/Lavarropas/White-Westtinghouse.jpg");
		rutaImagenes.add("imagenes/Lavarropas/Lavanderia.jpg");
		
		for (String rutaImagen : rutaImagenes) {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ventana.setImagen(rutaImagen);
			ventana.repaint();
		}
	}

}
