package claseFlecha;

public class flecha {
	 int longitud;
	 String color;
	 
	 public flecha(){
		 longitud=18;
		 color="negro";
	 }
	 
	 public flecha(int longitud,String color){  
		 this.longitud=longitud;
		 this.color=color;
	 }
	 
	 public void imprimirEspacio(){
		 System.out.println();
	 }
	 
	 public void construirflecha(){
		 for(int i = 0; i<longitud;i++){
			 imprime("-");
		 }
		 imprime(">");
	 }

	 private void imprime(String simbolo){
		 if(color.equals("negro")){
			 System.out.print(simbolo);
		 }else{
			 System.err.print(simbolo);
		 }
}


 }


