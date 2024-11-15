
public class forDemo {

	public static void main(String[] args) {
		// inicio; comparacion ; in/decremento;
		final int MAX=100;//CONSTANTE se usa la palabra final para definirlo
	//inicio;comparacion ; int/decremento
		for(int contador=0; contador<MAX; contador+=5) {
			System.out.println(contador);
			if (contador==80) {
				break;///rompe una sentencia en medio de un cilco cuanto ocrre una condicon
			}
		}//for contador

		System.out.println("+0+++++++++++++++++++++++000000000000000000000000000+++++0000");
		
		for(int contador=MAX; contador>0;contador-=5) {
			if (contador==50) {
				continue;
			}
			System.out.println(contador);
		}
	}//main

}//class
