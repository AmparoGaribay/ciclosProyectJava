
public class whileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX=100;
		int contador =0;
		while(contador <MAX) {
			if (contador==50) {
				contador+=5;
				continue;
			}
			contador+=5;
			System.out.println(contador);
		}
	System.out.println("00000000000000000000000000000000000");
		while (contador>0) {
			System.out.println(contador);
			contador-=5;
		}
		

	}//MAIN

}//CLASS
