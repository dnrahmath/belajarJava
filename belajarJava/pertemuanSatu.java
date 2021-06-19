package belajarJava;

public class pertemuanSatu {
    public static void main(String args[]) {

        System.out.println("Hello world");

        // comments
        /*
         * enter enter comments
         */

        /**/

        // ----------------------------------------------------

        // variabel
        String a = "ini String"; // ini type data String
        int b = 10; // ini type data Integer

        System.out.println(a);
        System.out.println(b);

        // --- Operator Relasional (==,!=,>=,<=,>,<) Operator Pembanding
        // --- Operator Logic (&&,||) Operator Logika

        //disjungsi (atau)
        boolean c = 10 == 10 || 10 == 10; //true
        //boolean c = 10 != 10 || 10 == 10; //true
        //boolean c = 10 == 10 || 10 != 10; //true
        //boolean c = 10 != 10 || 10 != 10; //false
        
        //konjungsi (dan)
        boolean d = 10 == 10 && 10 == 10; //true
        //boolean d = 10 != 10 && 10 == 10; //false
        //boolean d = 10 == 10 && 10 != 10; //false
        //boolean d = 10 != 10 && 10 != 10; //false]

        System.out.println(c);
        System.out.println(d);

        System.out.println(!c); // operator negasi (bukan)
    }
}
