import java.lang.reflect.Field;

public class App{
    public static void main(String[] args) throws  Exception{
        // Prints "Hello, World" in the terminal window.
        System.out.println("Hello, World");

        Cat myCat = new Cat("Stella", 6);
// ici
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for(Field field: catFields){
            System.out.printf(field.getName()); // --> prints "name" prints "age
            // magic : it prints PRIVATE && FINAL attributes names
            // Should not be abble to change PRIVATE && FINAL attributes
            // but ?? ..
            if (field.getName().equals("name")){
                field.setAccessible(true); // --> ligne magique qui résoud l'exception illegalaccces_machin
                // si l'attribut "name" existe ..
                field.set(myCat, "Jimmy McGill");
            }
            // we added "throw Exception", we currently receive a "IllegalAccessException"

        }

        // lets check if the cat's name has been changed

        System.out.println(myCat.getName()); // actually works --> "Jimmy McGill"

        // Can also do the same with METHODS rather than ATTRIbUTES

        // la suite ici : https://www.youtube.com/watch?v=bhhMJSKNCQY&t=332s&ab_channel=CodingwithJohn
    }
}