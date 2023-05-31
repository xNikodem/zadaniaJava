import Test1.Test1;
import Test2.Test2;
import Test3.Test3;

public class Main {
    public static void main(String[] args) {
        //ustaw na sztywno numer testu z którego zadania chcesz wywołać
        testSelector(1);
    }
    private static void testSelector(int i) {
        switch (i) {
            case 1 -> zadaniaTest1();
            case 2 -> zadaniaTest2();
            case 3 -> zadaniaTest3();
            default -> System.out.println("Invalid test number");
        }
    }

    private static void zadaniaTest1(){
        Test1.zadanie1();
        Test1.zadanie2();
        Test1.zadanie3();
        Test1.zadanie4();
    }
    private static void zadaniaTest2(){
        Test2.zadanie1();
        Test2.zadanie2();
        Test2.zadanie3();
        Test2.zadanie4();
        //Zadanie 5 jest ale nie wywoływałem
    }
    private static void zadaniaTest3(){
        Test3.zadanie1();
        Test3.zadanie2();
        Test3.zadanie3();
    }
}
