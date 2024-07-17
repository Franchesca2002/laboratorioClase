package areaRectangulo;

import javax.swing.JOptionPane;

public class ejercicioClase {

	public static void main(String[] args) {
		{
			String cadena;   // variables y resultado de variables para hallar el area
			double ladoA;
			double ladoB;
			double resultado;
			
			cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado A: " );
			ladoA  = Double.parseDouble(cadena);
			
			cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado B: " );
			ladoB  = Double.parseDouble(cadena);
			
			resultado = ladoA * ladoB;
			JOptionPane.showMessageDialog(null,"El resultado es: " + resultado );
		}

	} // Fin de la clase ejercicioClase

}
