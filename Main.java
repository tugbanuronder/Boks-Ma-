import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fighter f1= new Fighter("Can",20,150,90,30);
        Fighter f2= new Fighter("Ozan",30,130,92,40);

        Match match= new Match(f1,f2,85,100);
        match.run();

    }
}