public class Sample {

    public static void main(String[] args) {

    Employee emp = new Employee() ;
    VicePresident vp = new VicePresident();

    emp = vp;


    }
}


class Employee {}
class VicePresident extends Employee {};