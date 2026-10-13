import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/symbole.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<StringBuilder> linie = new ArrayList<>();

        while(scanner.hasNextLine()){
            StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
            linie.add(stringBuilder);
        }

        for(int i=0;i<linie.size();i++){
            if(linie.get(i).toString().equals(linie.get(i).reverse().toString())){
                System.out.println(linie.get(i).toString());
            }
        }

        scanner.close();
    }
}
