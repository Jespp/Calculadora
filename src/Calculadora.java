import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner reader= new Scanner (System.in);
		String com="HELP";
		float op1;
		float op2;
		
		do{
	
			switch (com) {
		
				case "":
					System.out.println("Debe escribir algo... ");
					break;
			
				case "QUIT":
					reader.close();
					break;
		
				case "HELP":
					System.out.println("╔═══════════════════════════════════╗");
					System.out.println("║    Comandos de la calculadora     ║");
					System.out.println("╠═══════════════════════════════════╣");
					System.out.println("║ SUM    para sumar                 ║");
					System.out.println("║ RES    para restar                ║");
					System.out.println("║ MUL    para multiplicar           ║");
					System.out.println("║ DIV    para dividir               ║");
					System.out.println("║ MOD    para módulo de la división ║");
					System.out.println("║ POT    para potencia              ║");
					System.out.println("║ HELP   Ayuda                      ║");
					System.out.println("║ QUIT   Salir                      ║");
					System.out.println("╚═══════════════════════════════════╝");
					break;
			
				case "SUM":
					System.out.print("Primer sumando: ");
					op1=Float.parseFloat(reader.nextLine());
					System.out.print("Segundo sumando: ");
					op2=Float.parseFloat(reader.nextLine());
					System.out.println(op1+" + "+op2+" = "+(op1+op2));
					break;
			
				case "RES":
					System.out.print("Minuendo: ");
					op1=Float.parseFloat(reader.nextLine());
					System.out.print("Sustraendo: ");
					op2=Float.parseFloat(reader.nextLine());
					System.out.println(op1+" - "+op2+" = "+(op1-op2));
					break;
			
				case "MUL":
					System.out.print("Multiplicando: ");
					op1=Float.parseFloat(reader.nextLine());
					System.out.print("Multiplicador: ");
					op2=Float.parseFloat(reader.nextLine());
					System.out.println(op1+" X "+op2+" = "+(op1*op2));
					break;
			
				case "DIV":
					System.out.print("Dividendo: ");
					op1=Float.parseFloat(reader.nextLine());
					System.out.print("Divisor: ");
					op2=Float.parseFloat(reader.nextLine());
					System.out.println(op1+" / "+op2+" = "+(op1/op2));
					break;
			
				case "MOD":
					System.out.print("Dividendo: ");
					op1=Float.parseFloat(reader.nextLine());
					System.out.print("Divisor: ");
					op2=Float.parseFloat(reader.nextLine());
					System.out.println("Al dividir "+op1+" entre "+op2+" da resto "+(op1%op2));
					break;
			
				case "POT":
					System.out.print("Base: ");
					op1=Float.parseFloat(reader.nextLine());
					System.out.print("Exponente: ");
					op2=Float.parseFloat(reader.nextLine());
					System.out.println(op1+" a la "+op2+" = "+(Math.pow(op1,op2)));
					break;
			
				default:
				System.out.println("Escriba un comando válido (Help para ayuda)");
			}
			
			System.out.print("\nOperación : ");
			com=reader.nextLine();
			com=com.toUpperCase();
		
		}while (true);
	}
}
