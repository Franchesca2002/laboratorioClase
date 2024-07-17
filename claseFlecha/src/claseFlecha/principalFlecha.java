package claseFlecha;

import javax.swing.JOptionPane;

public class principalFlecha {
	
	flecha flecha1,flecha2,flecha3;
	
	public static void main(String[]args){
		principalFlecha miPrincipal=new principalFlecha();
	}
	
	public principalFlecha(){
		flecha1=new flecha();
		flecha1.construirflecha();
		flecha1.imprimirEspacio();
		
		
		flecha2=new flecha();
		flecha2.longitud=34;
		flecha2.color="rojo";
		flecha2.construirflecha();
		flecha2.imprimirEspacio();
		
		flecha3=new flecha(12,"negro");
		flecha3.construirflecha();
		flecha3.imprimirEspacio();
		int size=Integer.parseInt(JOptionPane.showInputDialog (null,"ingrese el tamaño de las flechas"));
		int opt= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el color \n1 negro\n2 verde"));
 String color;
 	if (opt == 1) {
 		color = "negro";
 	} else {
 		color = "rojo";
 	}
 	flecha flecha4 = new flecha("la longitud de la flecha y color de flecha");
 
	}

 

}


