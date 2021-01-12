//import java.util.Scanner;
import java.io.*;
public class note{
    public static void main(String args[]){ 
        Console cin = System.console();
        int n = 0;
        String m = cin.readLine("Ce mesaj vrei sa afisezi?: ");
        
            String z = cin.readLine("De cate ori vrei sa se afiseze?: ");
            while(true){
                try{
                    n = 0;
                    for(int loop_through_string_of_number=0; loop_through_string_of_number<z.length(); loop_through_string_of_number++){
                        char ch = z.charAt(loop_through_string_of_number);
                        int ascii = (int)ch;
                        if(ascii>57 || ascii<48) throw new ArithmeticException();
                        n = n*10 + ascii-48;
                        //System.out.println( ascii );
                    }
                    break;
                }
                catch(ArithmeticException e){
                    System.out.println("Bai, vezi ca tre' sa introduci un numar.");
                    z = cin.readLine("Introdu din nou un numar:");
                }
            }
            
        coaie_e_un_mesaj obiect = new coaie_e_un_mesaj(n, m);
        obiect.Mesaj();
    }
}

class coaie_e_un_mesaj{
    static int i = 1;
    static String mesaj;
    int count;
    coaie_e_un_mesaj(int x, String y){
        this.count = x;
        mesaj = y;
    }
    public void Mesaj() {
        for (int j = 0; j < count; j++){
            System.out.println(mesaj+"  x"+i);
            i++;
        }
    }
}