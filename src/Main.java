import java.util.Scanner;

//Cambiarlo a un switch
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("A = dimeHola, B=dimeAdios, C=hastalavista");
        String opcion = sc.nextLine();
        if (opcion.equals("A"))
            System.out.println("dimeHola");
        if (opcion.equals("B"))
            System.out.println("dimeAdios");
        if (opcion.equals("C"))
            System.out.println("hasta la vista");
        if (!opcion.equals("A") && opcion!= "B" && opcion!="C")
            System.out.println("opcion no valia");
    }
}