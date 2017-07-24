import java.util.Scanner;

/*
  Supuesto1: Realiza un programa que permita números enteros por teclado
            hasta que la suma de los dos últimos números introducidos sea 20,
            diciendo al final cuantos de ellos han sido pares y cuántos impares.

  Supuesto2: Realiza un programa que pida la entrada por teclado de los datos de
            3 alumnos (deberemos utilizar la clase declarada en la unidad anterior)
            alumno1, alumno2, alumno3. Sacando al final por consola los datos de estos
            alumnos ordenados por orden alfabético de sus apellidos.
            Debes usar aquí el método  String.CompareTo()

  Supuesto3: Realiza un programa que pida cadenas hasta que el número de palabras
            introducidas en total sea mayor que 30, ya e diga cual de las cadenas
            introducidas tine más vocales, así como cuantas palabras de todas de las
            introducidas han termindao en 's'. teniendo en cuenta que solo debe contar una
            palabra independientemente de los espacios en blanco que haya entre cada palabra
            En este supuesto usar:
                        charAt(posición)
                        length
                        subString(inicio,final)

  Supuesto4: Escribe un programa que muestre un menú por consola, con las siguientes opciones:
              - Factorial
              - Multiplicación
              - División
              - Salir
              - Elegir opción

            Estas operaciones deben realizarse de la manera como se detalla a continuación:
              . Factorial 5! = 5*4*3*2*1
              - Multiplicación mediante sumas 4*5=4+4+4+4+4=20
              - División mediante restas: 11/3 -> 11-3=8 -> 8-3=5 -> 5-3=2 => Resto: 2 Cociente: 3

              En la opción se pedirá un número, en las opciones 2 y 3 se deberían pedir dos números enteros
              y mostrar el resultado según la opción elegida, en la opción 3 se debe tener en cuenta que no
              se puede dividir por 0

              Usar try{}catch(){}
              Entregar todo en un único archivo .jar
*/

/**
 *
 * @author osmandi
 */
public class Actividad2 {

    public static Scanner sc;
    public static Boolean ejecucion=true;
    public static int supuesto;

    public Actividad2(){
        supuesto = 0;
    }

    public static void menuPrincipal(){
        sc = new Scanner(System.in);

        while(ejecucion){

            System.out.println("Elije el supuesto que deseas");
            System.out.println("1\n2\n3\n4");
            System.out.print("__");

            if(!sc.hasNextInt()){
                System.out.println("\nDebes ingresar un número");
            }else{
                supuesto = sc.nextInt();

                //System.out.println("Supuesto es " + supuesto);

                switch (supuesto) {
                    case 1:
                        supuesto1();
                        break;
                    case 2:
                        supuesto2();
                        break;
                    case 3:
                        supuesto3();
                        break;
                    case 4:
                        supuesto4();
                        break;

                    default:
                        //throw new AssertionError();
                        System.out.println("Ingresa un valor desde el 1 al 4");
                }


            }

            sc.nextLine(); // Limpiar el Scanner


        }
    }

    public static void main(String[] args) {

       menuPrincipal();

    }


    // Funciones de cada supuesto
    public static void supuesto1(){
        System.out.println("Soy el supuesto 1");
    }

    public static void supuesto2(){
        System.out.println("Soy el supuesto 2");
    }

    public static void supuesto3(){
        System.out.println("Soy el supuesto 3");
    }

    public static void supuesto4(){
        System.out.println("Soy el supuesto 4");
    }

}
