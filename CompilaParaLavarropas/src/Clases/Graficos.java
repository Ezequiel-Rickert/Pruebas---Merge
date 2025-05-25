package Clases;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class Graficos extends Frame {

	private static final long serialVersionUID = 1L;
	private static List<String> rutaImagenes = new ArrayList<String>();
	private static List<Button> listaBotones = new ArrayList<Button>();
	Image imagen;
	
	public Graficos()
	{
		setTitle("Lavanderia");
		setSize(800, 600);
		imagen = Toolkit.getDefaultToolkit().getImage("imagenes/Lavarropas/fondo lavanderia.jpg");
		setVisible(true);
		setLayout(null);
		
		String mensajeBoton = "Apagado";
		
		Button boton1 = new Button(mensajeBoton);
		boton1.setBounds(70, 170, 100, 40);
		listaBotones.add(boton1);
		
		Button boton2 = new Button(mensajeBoton);
		boton2.setBounds(330, 180, 100, 40);
		listaBotones.add(boton2);
		
		Button boton3 = new Button(mensajeBoton);
		boton3.setBounds(520, 175, 100, 40);
		listaBotones.add(boton3);
		
		Button boton4 = new Button(mensajeBoton);
		boton4.setBounds(80, 380, 100, 40);
		listaBotones.add(boton4);
	
		Button boton5 = new Button(mensajeBoton);
		boton5.setBounds(320, 400, 100, 40);
		listaBotones.add(boton5);
		
		Button boton6 = new Button(mensajeBoton);
		boton6.setBounds(670, 420, 100, 40);
		listaBotones.add(boton6);
		
		for(Button boton : listaBotones)
		{
			boton.setBackground(Color.RED);
			boton.setForeground(Color.WHITE);
			boton.setFont(new Font("Impact", Font.BOLD, 16));
			boton.setVisible(false);
		}
		
		boton1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Lavarropas.getLavarropas("Whirlpool Corporation").encender("Prendas delicadas");
				boton1.setBackground(Color.GREEN);
				boton1.setForeground(Color.BLACK);
				boton1.setLabel("Encendido");
	        }
	    });
		
		boton2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Lavarropas.getLavarropas("KOH-I-NOOR A655 Linea Acero").encender("Centrifugado");
				boton2.setBackground(Color.GREEN);
				boton2.setForeground(Color.BLACK);
				boton2.setLabel("Encendido");
	        }
	    });
		
		boton3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Lavarropas.getLavarropas("Samsung").encender("Prendas Blancas");
				boton3.setBackground(Color.GREEN);
				boton3.setForeground(Color.BLACK);
				boton3.setLabel("Encendido");
	        }
	    });
		
		boton4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Lavarropas.getLavarropas("Drean").encender("Enjuague");
				boton4.setBackground(Color.GREEN);
				boton4.setForeground(Color.BLACK);
				boton4.setLabel("Encendido");
	        }
	    });
		
		boton5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Lavarropas.getLavarropas("LG").encender("Lavado Suave");
				boton5.setBackground(Color.GREEN);
				boton5.setForeground(Color.BLACK);
				boton5.setLabel("Encendido");
	        }
	    });
		
		boton6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				boton6.setBackground(Color.GREEN);
				boton6.setForeground(Color.BLACK);
				boton6.setLabel("Encendido");
				
				imagen = Toolkit.getDefaultToolkit().getImage("imagenes/Lavarropas/LavanderiaChuavechito.jpg");
				repaint();
	        }
	    });
		
		
		for(Button boton : listaBotones)
		{
			add(boton);
		}
		
		addWindowListener(new WindowAdapter() 
		{ 
			public void windowClosing(WindowEvent e) 
			{ 
				dispose(); 
			}
		});
	}
	
	public static void agregar(String rutaImagen)
	{
		rutaImagenes.add(rutaImagen);
	}
	
	public static List<String> getRutaImagenes() {
		return rutaImagenes;
	}
	
	public static void botonesVisibles()
	{
		for(Button boton : listaBotones)
		{
			boton.setVisible(true);
		}
	}
	
	public void setImagen(Image imagen) 
	{	
		this.imagen = imagen;
	}
	
	public void setImagen(final String rutaImagen) 
	{	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		imagen = Toolkit.getDefaultToolkit().getImage(rutaImagen);
		
		repaint();
	}
	
	public void setImagen(String rutaImagen, boolean escalado) 
	{			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		imagen = Toolkit.getDefaultToolkit().getImage(rutaImagen).getScaledInstance(800, 600, Image.SCALE_FAST);
		
		repaint();
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
