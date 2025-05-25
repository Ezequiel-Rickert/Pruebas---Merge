package Clases;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graficos extends Frame{

	private static final long serialVersionUID = 1L;
	Image imagen;
	
	public Graficos()
	{
		setTitle("Lavanderia");
		setSize(800, 600);
		
		addWindowListener(new WindowAdapter() 
		{ 
			public void windowClosing(WindowEvent e) 
			{ 
				dispose(); 
			}
		});
	}
	
	public void setImagen(Image imagen) 
	{	
		this.imagen = imagen;
	}
	
	public void setImagen(String rutaImagen) 
	{	
		Image imagen = Toolkit.getDefaultToolkit().getImage(rutaImagen);
		
		this.imagen = imagen;
	}
	
	public void activar()
	{
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) 
	{
	    g.drawImage(imagen, 0, 0, this);
	}
}
