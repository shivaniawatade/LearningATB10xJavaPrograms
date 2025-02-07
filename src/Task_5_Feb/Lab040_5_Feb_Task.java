package Task_5_Feb;

public class Lab040_5_Feb_Task {
    public static void main(String[] args) {
        PrintNo();
        System.out.println("______________________________");
        even();
        System.out.println("______________________________");
        hello();
        System.out.println("______________________________");
        natural();
        System.out.println("______________________________");
        multiplication();
        System.out.println("______________________________");
        printNo1To10();
        System.out.println("______________________________");
        evenNum();
        System.out.println("______________________________");
        printingJava();
        System.out.println("______________________________");
        naturalNum();
        System.out.println("______________________________");
        multiplicationTable7();

    }

    // print numbers from 1 to 10
    static void PrintNo(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    static void even(){
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    static void hello(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
        }
    }
    static void natural(){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }
    static void multiplication() {
        for(int i=1;i<=10;i++){
            System.out.println(5*i);
        }
    }
    static void printNo1To10()
    {
        int i=1;
        while (i <= 10)
        {
            System.out.println(i);
            i++;
        }
    }

    static void evenNum()
    {
        int i=1;
        while (i<=20)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }

    static void printingJava()
    {
        int i=1;
        while(i<=5)
        {
            System.out.println(i+":Java");
            i++;
        }
    }

    static void naturalNum()
    {
        System.out.println("Printing first 10 natural numbaers:");
        int i=0;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
    }

    static  void multiplicationTable7()
    {
        int i=1;
        while (i<=10)
        {
            System.out.println(7*i);
            i++;
        }
    }
}
