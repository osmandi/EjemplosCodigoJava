import java.util.Scanner;

public class EntradaAlumnos{



  public EntradaAlumnos(){

    //String x = sc.nextLine();
  }
  // String Nif, String Nombre,
  //String Apellido, String Dirección,
  //String Población, String Matrícula
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    Alumnos alumno1 = new Alumnos();

    System.out.println("Ingresa el DNI del alumno 1 para obtener en Nif");
    alumno1.setNif(sc.nextInt());

    System.out.println("El NIF del alumno 1 es: " + alumno1.getNif());

    System.out.println("Ingrese nombre del alumno 1");
    alumno1.setNombre(sc.nextLine());




    System.out.println("Definiendo datos del Alumno 2");
    char nifAlumno2 = 'A';
    String nombreAlumno2 = "Osmandi";
    String apellidoAlumno2 = "Gómez";
    String direcciónAlumno2 = "Dirección 2";
    String poblaciónAlumno2 = "Población 2";
    String matrículaAlumno2 = "Matrícula 2";

    Alumnos alumno2 = new Alumnos(
      nifAlumno2, nombreAlumno2,
      apellidoAlumno2, direcciónAlumno2,
      poblaciónAlumno2, matrículaAlumno2);

      System.out.println("El NIF del Alumno 2 es: " + alumno2.getNif());

    //System.out.println("El nombre del alumno 1 es "+ alumno1.getNombre());
    //System.out.println("El nombre del alumno2 es " + alumno2.getNombre());



  }
}
