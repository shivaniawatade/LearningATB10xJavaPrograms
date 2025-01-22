package ex_01_Java_Basic;

public class Lab007_CLI {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);
        System.out.println("Name is : "+ name);
        System.out.println("Age is : "+ age);
        System.out.println("Salary is : "+ salary);
    }
}
