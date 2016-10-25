package uzd5;
//Importeejam scanner klasi
import java.util.Scanner;

public class Uzd5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Defineejam rindu un kolonnu tipus
        int row, col;
        //Defineejam atziimju masiivu
        int[][] gradeArray = new int[0][];
        //Defineejam studentu skaitu klasee
        int studentCount = 3;
        //Defineejam uzvaardu masiivu
        String[] surnamesArray = new String[studentCount];
        //Pieprasam ievadiit konkreeto uzvaardu daudzumu
        System.out.println("Please enter " + studentCount + " names to sort");
        //Izejam cauri visam studentu skaitam un ievadam attieciigi tik skoleenus
        for (int i = 0; i < surnamesArray.length; i++) {
            surnamesArray[i] = s.nextLine();
        }
        System.out.println(surnamesArray[0]);
        System.out.println(surnamesArray[1]);
        System.out.println(surnamesArray[2]);
        
        
        
        
        
        
    }
    
}
