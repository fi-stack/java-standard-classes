package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

//        String name = "Rafi";
//
//        name = name + " " + "Nur";
//
//        name = name + " " + "Oktafian";
//
//        System.out.println(name);

//         Rafi
//         Rafi Nur
//         Rafi Nur Oktafian

        StringBuilder builder = new StringBuilder();
        builder.append("Rafi");
        builder.append(" ");
        builder.append("Nur");
        builder.append(" ");
        builder.append("Oktafian");

        String name = builder.toString();
        System.out.println(name);

    }
}
