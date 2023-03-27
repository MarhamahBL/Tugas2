/* NIM      : 13020210247
Nama        : Marhamah BL
Hari/Tgl    : Minggu, 26 Maret 2023
Waktu       : 02.50PM */
package tgs11;
import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan ITERATE */
public class PrintIterasi {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Nilai N > 0 = ");     /* Inisialisasi*/
        N = masukan.nextInt();

        i = 1;      /* First Elmt */
        System.out.print ("Print i dengan ITERATE : \n");
        for (;;){
            System.out.println(i); /* Proses */
            if (i == N)
                /* Kondisi Berhenti */ break;
            else {
                i++; /* Next Elmt */
            }
        }       /* (i == N) */
    }
    
}