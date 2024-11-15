
public class doWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("00000000000000000DO WHILE000000000000000000");	
		int contador=0;
		final int MAX=100;
		do{
			System.out.println(contador);
			contador-=5;
		}while(contador>0);
		System.out.println("00000000000000000DO WHILE000000000000000000");	

		do {
			contador+=5;
			System.out.println(contador);
		}while(contador <MAX);

	}

}
