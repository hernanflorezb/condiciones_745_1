import java.util.Scanner;

class Condicion {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
	String name;
    System.out.println("Ingrese su nombre");
    name = leer.nextInt();
    System.out.println("Ingrese el numero del mes de nacimiento");
    int mesin = leer.nextInt();
	System.out.println("Ingrese el numero del año de nacimiento");
	int yearin = leer.nextInt();
	int year = 2024;
	int mes =8;
	int dia=23;
	int yearout;
	yearout = year-yearin;
	System.out.println("Su edad es"+year);
	System.out.println("Porfavor ingrese el dia de nacimiento");
	int nacimiento = leer.nextInt();
	if (mesin >= 3 || <=4)
	{
		System.out.println(" Su Signo es Aries");
	} else if (mesin >= 4 || <= 5)
	{
		System.out.println(" Su Signo es Tauro");
	}
	else if (mesin <= 5 || >= 6)
	{
		System.out.println(" Su Signo es Geminis");
	}
	else if (mesin <= 6 || >= 7)
	{
		System.out.println(" Su Signo es Cancer");
	}
	else if (mesin <= 7 || >= 8)
	{
		System.out.println(" Su Signo es Leo");
	}
	else if (mesin <= 8 || >= 9)
	{
		System.out.println(" Su Signo es Virgo");
	}
	else if (mesin <= 9 || >= 10)
	{
		System.out.println(" Su Signo es Libra");
	}
	else if (mesin <= 10 || >= 11)
	{
		System.out.println(" Su Signo es Escorpio");
	}
	else if (mesin <= 11 || >= 12)
	{
		System.out.println(" Su Signo es Sagitario");
	}
	else if (mesin <= 12 || >= 1)
	{
		System.out.println(" Su Signo es Capriconio");
	}
	else if (mesin <= 1 || >= 2)
	{
		System.out.println(" Su Signo es Acuario");
	}
	else if (mesin <= 2 || >= 3)
	{
		System.out.println(" Su Signo es Piscis");
	}
	
  }
 }
