import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Master {
    static int licznik = 1;
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(fun_rek(99887766554432122l));
        System.out.println(licznik);
        System.out.println(przestaw2(1234));

    }
    public static long fun_rek(long n){
        long r = (int) (n % 100);
        long a = r/10;
        long b = r % 10;
        n = n/100;

        long w = 0;
        if(n > 0){
            w = a + (10 * b) + 100 * fun_rek(n);
            licznik++;
        }
        else{
            if(a > 0){
                w = a + 10 * b;
            }
            else{
                w = b;
            }
        }
        return w;
    }

    static public long przestaw2(long n){
        long liczba = 1;

        long w = 0;

            while(n >= 10){

                long liczba1 = (n/10) % 10;

                long liczba2 = n % 10;

                w += (liczba1 + liczba2 * 10) * liczba;

                liczba *= 100;

                n = n/100;

            }

            w += n * liczba;

        return w;
    }

}
