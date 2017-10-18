import java.util.Scanner;
public class tiempo{
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int seg=0, min=0, hora=0;
		System.out.println("Introduce segundos: ");
		seg = dato.nextInt();
		dato.close();
		min=seg/60;
		hora=min/60;
		System.out.println("Los segundos en horas son: "+hora+ " h");
		System.out.println("Los segundos en minutos son: "+min+ " min");
		System.out.println("Los segundos en segundos son: "+seg+ " seg");
		}
	}