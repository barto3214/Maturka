import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("src/pi.txt");
        Scanner scanner = new Scanner(file);
        char[] znaki = new char[10000]; //10000
        int licznik = 0;

        for(int i = 0;i<znaki.length;i++){
            znaki[i] = scanner.next().charAt(0);
        }

        ArrayList<String> dwuznaki = new ArrayList<>();
        for (int i = 0; i < znaki.length - 1; i++) {
            dwuznaki.add("" + znaki[i] + znaki[i+1]);
            if(Integer.parseInt(dwuznaki.get(i)) > 90){
                licznik++;
            }
        }
        System.out.println(licznik);
        System.out.println(dwuznaki);


//        while (scanner.hasNext()){
//            char znak = scanner.next().charAt(0);
//            System.out.println(znak);
//
//        }

        scanner.close();
    }
}