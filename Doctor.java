public class Doctor {
    static int id=0;
    String name;
    String speciality;

    //construyendo el metodo constructor
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("El nombre del Doctor asiganado es: "+name);
    }

    //Comportamientos
    public void showName(){
        //esta metodo imprime el nombre del doctor
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }

}
