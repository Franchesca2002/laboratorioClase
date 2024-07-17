package areaRectangulo;

import javax.swing.*;

public class claseEntidad 
{
	
	private double ladoA;  //declarar variables
	private double ladoB;
	
	public void ingresarDatos ()
	{
		
		String cadena;
		
		cadena = JOptionPane.showInputDialog (null,"ingrese la longitud del lado A:"); //ingresar datos de las variables
		ladoA  = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog (null,"Ingrese la longitud del lado B:");
		ladoB  = Double.parseDouble(cadena);
	}
	
	public void calcularArea ( )
	{
		double resultado;
		
		resultado = ladoA * ladoB;
		
		JOptionPane.showMessageDialog(null,"El resultado es: " + resultado );  //el resultado de la multiplicacion de los datos ingresados
	}
} // Fin de la clase Entidad
	
	   
	   
	  


