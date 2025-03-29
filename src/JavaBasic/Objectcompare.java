package JavaBasic;

public class Objectcompare {
    public static void main(String[] args) {
        String str1 = new String("Arjun");
        String str2 = new String("Arjun");
        System.out.println(str1.equals(str2)); // it check contains of string
        System.out.println(str1 == str2); // it check refernece of address of String

//        When to Use .equals() and ==?
//✔ Use == if you want to check whether two references point to the same object in memory.
//✔ Use .equals() when checking logical equality (i.e., if two objects have the same data).
//
//        For custom objects, always override .equals() in your class if you want meaningful equality comparison.

    }
}
