public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World_update!");
        System.out.println(greeting("Sampo"));
    }

    static String greeting(String name) {
        return "Hello, " + name + "!";
    }
}
