package areaRectangulo;

import javax.swing.JOptionPane;

public class ejercicioClaseDos {

	public static void main(String[] args) {
		{
			double ladoA;
			double ladoB;
			
			ladoA = ingresarDatos ("Ingrese la longitud del lado A: ");
			ladoB = ingresarDatos ("Ingrese la longitud del lado B: ");
			
			calcularArea  (ladoA, ladoB);
		}
		
		
	}

	private static double ingresarDatos(String mensaje) 
	{
		String cadena;
		double valor;
		
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor  = Double.parseDouble(cadena);
		
		return valor;
	}
	
	private static void calcularArea(double a, double b) 
	{
		double resultado;
		
		resultado = a * b;
		
		JOptionPane.showMessageDialog(null,"El resultado es:" + resultado);
	}} // Fin de la clase claseDos

//resultado del area del rectangulo
