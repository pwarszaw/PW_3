public class ExampleParams {
    public static void main(String[] args) {

        Example Obj1 = new Example();

        Obj1.height = 150;
        Obj1.weight = 40;
        Obj1.depth = 32;



        System.out.println("Height: " + Obj1.height);
        System.out.println("Weigth: " + Obj1.weight);
        System.out.println("Depth: " + Obj1.depth);

        System.out.println(Example.counter);

        Example Obj2 = new Example();

        Obj2.height = 170;
        Obj2.weight = 70;
        Obj2.depth = 64;

        System.out.println("Height: " + Obj2.height);
        System.out.println("Weigth: " + Obj2.weight);
        System.out.println("Depth: " + Obj2.depth);

              System.out.println(Example.counter);


    }

}

class Example {

    static int counter;

    int height;
    int weight;
    int depth;

    public Example() {
        counter++;

    }
}