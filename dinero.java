import java.util.Scanner;
public class dinero {
	public static void main (String[] args) {
		Scanner dato = new Scanner(System.in);
		int dinero=0, resto=0, quin=0, dosc=0, cien=0, cincuenta=0, veinte=0, diez=0, cinco=0, dos=0, un=0;
		System.out.println("Introduce tu dinero aquí: ");
		dinero=dato.nextInt();
		dato.close();
		
		quin=dinero/500;
		resto=dinero%500;
		
		
		dosc=resto/200;
		resto=resto%200;
		
		cien=resto/100;
		resto=resto%100;
		
		cincuenta=resto/50;
		resto=resto%50;
		
		veinte=resto/20;
		resto=resto%20;
		
		diez=resto/10;
		resto=resto%10;
		
		cinco=resto/5;
		resto=resto%5;
		
		dos=resto/2;
		resto=resto%2;
		
		un=resto/1;
		resto=resto%1;
		
		System.out.println(quin + " billete de 500€");
		System.out.println(dosc+ " billete de 200€");
		System.out.println(cien+ " billete de 100€");
		System.out.println(cincuenta+ " billete de 50€");
		System.out.println(veinte+ " billete de 20€");
		System.out.println(diez+ " billete de 10€");
		System.out.println(cinco+ " billete de 5€");
		System.out.println(dos + " moneda de 2€");
		System.out.println(un + " moneda de 1€");

		
	}
}
