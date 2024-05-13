public class Doctor {
    //Atributos del doctor (como los ingredientes de una receta de cocina)
    /**
     * Doctor.java
     * Definición de la clase Doctor
     * @author Jaqueline Torres Pérez
     * */
    static int id = 0;//Autoincrement
    public static String name;
    String speciality;

    Doctor(){
        System.out.println("Contruyendo el Objeto Doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }
    //Comportamiento (Métodos)
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " +  id);
    }
}
