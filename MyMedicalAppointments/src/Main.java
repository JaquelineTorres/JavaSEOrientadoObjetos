import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();//Obj 1
        myDoctor.name = "Alex Giménez";
        myDoctor.showName();
        myDoctor.showId();// id = 1;

        Doctor myDoctorJaq = new Doctor();
        myDoctorJaq.name = "Eduardo Torres";
        myDoctorJaq.showName();
        myDoctorJaq.showId();// id = 1;
        showMenu();//Forma resumida
    }
}