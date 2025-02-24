package ex_07_Oops;

public class Lab057_Parametrized_Constructor {
    public static void main(String[] args) {
        Student s1=new Student("shivani","xyz",1);
        s1.getdeatils();
    }
}
class Student{
    String name;
    String address;
    int no;
    Student(String name,String address,int no){
        this.name=name;
        this.address=address;
        this.no=no;
    }
    void getdeatils(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(no);
    }

}
