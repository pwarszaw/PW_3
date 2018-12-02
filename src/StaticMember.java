public class StaticMember {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.name = "Janusz";
        dad.age = 32;

        FamilyMember mom = new FamilyMember();
        mom.name = "Grażyna";
        mom.age = 31;

        FamilyMember kid = new FamilyMember();
        kid.name = "Piotr";
        kid.age = 4;

        show(mom);
        show(dad);
        show(kid);

    }

    static void show(FamilyMember familyMember) {

        System.out.print(familyMember.name);
        System.out.print(", ");
        System.out.print(familyMember.surname);
        System.out.print(" ");
        System.out.print(familyMember.age);
        System.out.println(" lat/a");
    }

}

class FamilyMember{
    static String surname = "Nowak";
    String name;
    int age;

}