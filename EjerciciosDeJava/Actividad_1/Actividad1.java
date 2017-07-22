import java.util.Scanner;
//import javax.swing.JOptionPane;
class Actividad1{



    public static void main(String[] args){

        //JOptionPane.showMessageDialog(null, "Hola");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un nombre");
        String nombre = sc.nextLine();


        Alumno pedro = new Alumno();
        pedro.setNombre(nombre);

        System.out.println("El alumno se llama "+pedro.getNombre());

    }
}
