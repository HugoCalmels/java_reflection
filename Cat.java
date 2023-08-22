public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow(){
        System.out.println("Meow");

    }

    public void heyThisIsPrivate(){
        System.out.println("How did you call this ??");
    }

    public static void thisIsApublicStaticMethod(){
        System.out.println("Im public and static");
    }

    private static void thisIsAPrivateStaticMethod(){
        System.out.println("Hey, im private and static !");
    }
}