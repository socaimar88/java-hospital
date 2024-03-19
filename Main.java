import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor= new Doctor();
        myDoctor.name="Fred Willians Solis";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorAnn= new Doctor();
        myDoctor.name="Caro Cruz";
        myDoctor.showName();
        myDoctor.showId();

        showMenu();
    }
}