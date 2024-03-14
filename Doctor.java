public class Doctor {
    int id;
    String name;
    String speciality;

    //construyendo el metodo constructor
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    //Comportamientos
    public void showName(){
        //esta metodo imprime el nombre del doctor
        System.out.println(name);
    }

}
