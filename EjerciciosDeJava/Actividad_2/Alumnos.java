public class Alumnos{
    private char nif;
    private String nombre;
    private String apellido;
    private String dirección;
    private String población;
    private String matrícula;

    public Alumnos(){

    }



    public Alumnos(char Nif, String Nombre, String Apellido, String Dirección, String Población, String Matrícula){
      this.nif = Nif;
      this.nombre = Nombre;
      this.apellido = Apellido;
      this.dirección = Dirección;
      this.población = Población;
      this.matrícula = Matrícula;
    }

    // ===== Setters ===========S

    // Debe comprobar de la lettra

    public void setNombre(String Nombre){
      this.nombre = Nombre;
    }

    public void setNif(int DNI){
      this.nif = obtenerNif(DNI);
    }

    public void setApellido(String Apellido){
      this.apellido = Apellido;
    }

    public void setDirección(String Dirección){
      this.dirección = Dirección;
    }

    public void setPoblación(String Población){
      this.población = Población;
    }

    public void setMatrícula(String Matrícula){
      this.matrícula = Matrícula;
    }

    // Getters
    public String getNombre(){
        return this.nombre;
    }

    public char getNif(){
      return this.nif;
    }
    public char obtenerNif(int DNI){
      // Obtener NIf a partir del DNI
      char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
       'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
       int NIF = DNI%23;
       return letras[NIF];
    }

    public String getApellido(){
      return this.apellido;
    }

    public String getDirección(){
      return this.dirección;
    }

    public String getPoblación(){
      return this.población;
    }

    public String  getMatrícula(){
      return this.matrícula;
    }


}
