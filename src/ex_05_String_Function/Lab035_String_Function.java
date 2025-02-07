package ex_05_String_Function;

public class Lab035_String_Function {
    public static void main(String[] args) {
        String name="Shivani";
        //charAt
        System.out.println(name.charAt(1));
        //concat
        String s1="Awatade";
        System.out.println(name.concat(s1));
        // contains
        System.out.println(name.contains("Shiv"));
        //equals
        System.out.println(name.equals(s1));
        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("SHIVANI"));
        //indexOF
        System.out.println(name.indexOf('i'));
        //length
        System.out.println(name.length());
        //replace
        System.out.println(name.replace('n','j'));
        //split
        String name1="Shivani@Awatade@2000";
        String[] split=name1.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        //substring()
        System.out.println(name.substring(1,5));

        //toLowerCase()
        System.out.println(name.toLowerCase());

        //toUpperCase()
        System.out.println(name.toUpperCase());

        //startsWith()
        System.out.println(name.startsWith("S"));

        //endWith()
        System.out.println(name.endsWith("i"));

        //trim()
        String name3="     Prasad     ";
        System.out.println(name3.trim());

        //compareTo()
        System.out.println(name.compareTo("Shivani"));

        //CompareToIngnoreCase
        System.out.println(name.compareToIgnoreCase("SHIVANI"));
        //string builder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString());


    }
}
