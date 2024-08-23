import java.util.Scanner;

class Condicion {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int n1 = leer.nextInt();
    System.out.println("Ingrese otro numero");
    int n2 = leer.nextInt();

    if(n1>n2)
    {
      System.out.println("El numero: "+n1+" es el mayor");
    }
    else
    {
      System.out.println("El numero: "+n2+" es el mayor");
    }
  }
}
