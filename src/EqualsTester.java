public class EqualsTester {
    public static void main(String[] args) {

        String name = "Tomek";

        System.out.println(name.getClass());
        System.out.println(name.getClass().getName());
        System.out.println(name.getClass().getSimpleName());

        System.out.println();

        System.out.println(name instanceof String);
        System.out.println(name instanceof Object);

        Object object = new Object();
        object = name;
        System.out.println(object instanceof Integer);

    }

}
