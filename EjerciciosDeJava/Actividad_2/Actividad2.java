import java.util.Scanner;
import java.util.ArrayList;


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
    public static Scanner sc_1;
    public static Scanner sc_2;
    public static Scanner sc_3;
    public static Scanner sc_4;
    
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
                    case 0:
                        System.exit(0);
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
        //Creación de una lista donde se guardarán todos los números ingresados
        ArrayList<Integer> numerosIngresados = new ArrayList<Integer>();
        
        // Instancia del teclado
        sc_1 = new Scanner(System.in);       
        
        // Inicio del contador límite
        int nTotal = 0;
        while(nTotal < 20){
            System.out.println("Ingresa un número entero");        
            
            if(sc_1.hasNextInt()){
                // Si es un número lo añade al ArrayList
                numerosIngresados.add(sc_1.nextInt());
                
                // Verificar si hay más de dos valores en el ArrayList
                if(numerosIngresados.size() >= 2){
                    // Obtener los dos últimos índices
                    int ultimoIndice = numerosIngresados.size()-1;
                    int penultimoIndice = numerosIngresados.size()-2;
                    
                    // Obtener el valor de los dos últimos índices
                    int ultimoValor = numerosIngresados.get(ultimoIndice);
                    int penultimoValor = numerosIngresados.get(penultimoIndice);
                    
                    // Sumar los dos últimos valores del ArrayList
                    nTotal = ultimoValor + penultimoValor;
                }
                
            }else{
                // Si no es un número envía no guarda nada
                System.out.println("¡Debe ser un número entero!");
                
            }
            
            // Limpiear el Scanner
            sc_1.nextLine();
        }
        
        // Detectar cuántos pares e impares fueron ingresados        
        int numerosPares = 0;
        int numerosImpares = 0;
        for(Integer i : numerosIngresados){
            if(i%2==0){
                // Es un número par
                numerosPares++;
            }else{
                // Es un número impar
                numerosImpares++;
            }
            
        }
        
        // Mensajes de salida
        System.out.println("Números impares: " + numerosImpares);
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Los dos últimos números dan: " + nTotal);
        
    }

    public static void supuesto2(){
        System.out.println("Soy el supuesto 2");
        System.out.println("Debes ingresar los datos de 3 alumnos");
        // Tener clase alumno de la actividad 1
        // Instanciar 3 alumnos
        Alumnos[] alumnos = new Alumnos[3];
        alumnos[0] = new Alumnos();
        alumnos[1] = new Alumnos();
        alumnos[2] = new Alumnos();
        sc_2 = new Scanner(System.in);
        int nAlumnos = 0;
        
        
        for (Alumnos j : alumnos){
            nAlumnos++;
            System.out.println("|||||||||||||||||||||||||||||");
            
            System.out.println("Ingrese el nombre del alumno " + nAlumnos);
            j.setNombre(sc_2.nextLine());
            
            System.out.println("Ingrese el DNI del alumno "+ nAlumnos);
            j.setNif(sc_2.nextInt());
            sc_2.nextLine(); // Limpiar el scanner
            System.out.println("Ingrese el Apellido del alumno " + nAlumnos);
            j.setApellido(sc_2.nextLine());
            
            System.out.println("Ingrese la dirección del alumno "+ nAlumnos);
            j.setDirección(sc_2.nextLine());

            System.out.println("Ingrese la población del alumno "+ nAlumnos);
            j.setPoblación(sc_2.nextLine());

            System.out.println("Ingrese la matrícula del alumno "+ nAlumnos);
            j.setMatrícula(sc_2.nextLine());            
                 
        }
        //Osmandi José Pedro        
        
        // Ordear al array por el apallido
        Alumnos alumnoAuxiliar;
        for (int i = 0 ; i <alumnos.length-1;i++){
            for(int j = i+1; j < alumnos.length;j++){
                int comparacion = alumnos[i].getApellido().compareToIgnoreCase(alumnos[j].getApellido());
                
                if(comparacion >0){
                    // i < j
                    alumnoAuxiliar = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = alumnoAuxiliar;
                }
            }
        }
        
        // Mostar los alumnos ingresados
        System.out.println("Los apellidos ordenados son:");
        for(Alumnos i : alumnos){
            System.out.println(i.getApellido() +  " " + i.getNombre());
        }
        
        System.out.println("Termina el supuesto 1");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°"); 
    }

    public static void supuesto3(){
        System.out.println("Soy el supuesto 3");
    }

    public static void supuesto4(){
        System.out.println("Soy el supuesto 4");
    }

}
