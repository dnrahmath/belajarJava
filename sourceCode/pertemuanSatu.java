package belajarJava;

//----------------------------------------------

import java.util.Scanner;  //scanner no.5

//----------------------------------------------

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter; //file writer no.8
import java.io.IOException; //library menangani catch 

//----------------------------------------------

import belajarJava.pertemuanDua;


/**
 * Write a description of class pertemuanSatu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class pertemuanSatu
{
    public static void main(String args[]){  
      /**/
      System.out.println("Hello world");  
      
      //comments
      /* enter
       * enter
       * comments
       */
      
      /**/
      
      
      
      //---------------------------------------------------------------------------
      
      
      
      System.out.println(); //membuat baris baru
      
      
      
      //---------------------------------------------------------------------------
      
      //variabel
      String a = "ini String";    // ini type data String
      int b = 10 % 3;    // ini type data Integer
      
      
      
      // --- Operator Relasional (==,!=,>=,<=,>,<) Operator Pembanding
      // --- Operator Logic (&&,||) Operator Logika
      //disjungsi (atau)
      //boolean c = 10 == 10 || 10 == 10; //true
      //boolean c = 10 != 10 || 10 == 10; //true
      //boolean c = 10 == 10 || 10 != 10; //true
      //boolean c = 10 != 10 || 10 != 10; //false
      
      //konjungsi (dan)
      //boolean c = 10 == 10 && 10 == 10; //true
      //boolean c = 10 != 10 && 10 == 10; //false
      //boolean c = 10 == 10 && 10 != 10; //false
      boolean c = 10 != 10 && 10 != 10; //false
      
      
      
      
      // --- Operator Aritmatika (+,-,*,/,%,++,--) Operator Hitung
      
      //b++;
      //b=b+1;
      
      //int d = 15 ;
      String e = c + " ini integer";  //fungsi lain operator Aritmatika + (plus) pada penggunaan perubahan data
      // - type data = string
      
      System.out.println(e);
      
      
      //-------------------------------- Scanner input
      String f;
      Scanner input = new Scanner(System.in);
      f = input.nextLine();
      //--------------------------------
      
      
      System.out.println(a);
      System.out.println(b);
      System.out.println(!c);  //negasi (bukan)
      //System.out.println(d);
      System.out.println(f);
      
      
      //---------------------------------------------------------------------------
      
      //array
      String[] arrayA = {"dataSatu","dataDua","dataTiga"};
      int[] arrayB = {1,2,3};
      
      System.out.println(arrayA[0]);
      System.out.println(arrayB[0]);
      
      
      //---------------------------------------------------------------------------
      
      
      
      System.out.println(); //membuat baris baru
      
      
      
      //---------------------------------------------------------------------------
      
      //Scanner
      int g;
      Scanner scanSatu = new Scanner(System.in);
      System.out.print("Masukkan sebuah bilangan : ");  g = scanSatu.nextInt();
      
      System.out.println("Ini yang kamu input = " + g);
      Scanner scanDua = new Scanner(System.in);
      String h = scanDua.nextLine();
      
      
      //percabangan
      
      //if else -- berdasarkan kondisi  
      if (g % 2 == 0) {
        System.out.println("dan ini Bilangan " + g + " adalah genap.\n");
      } else {
        System.out.println("dan ini Bilangan " + g + " adalah ganjil.\n");
      }
      
      //switch case -- berdasarkan 1 kondisi
      //break and continue (contoh pengunaan break) 
      switch (g) {
        case 1: 
          System.out.println("ini angka 1");
          break;
        case 2:
          System.out.println("ini angka 2");
          break;
        default:
          System.out.println("ini bukan angka 1 ataupun 2");
          break;
      }
      
      
      if (g == 1) {
        System.out.println("ini angka 1");
      } else if (g == 2) {
        System.out.println("ini angka 2");
      } else {
        System.out.println("ini bukan angka 1 ataupun 2");
      }
        
        
      //---------------------------------------------------------------------------
      
      
      
      System.out.println(); //membuat baris baru
      
      
      
      //---------------------------------------------------------------------------
      
      int i = 5;
      
      while ( i <= 10) {
          i++;  // nanti dideklarasikan
          
          //contoh penggunaan continue 
          if(i == 8){
            break;
            //continue;  //akan melakukan skip pada perintah sytax selanjutnya  pada menu selanjutny jika i bernilai 8
          }
          
          System.out.println("perulangan  while  ke-- " + i);  //nanti ditukar posisinya
          //i++;
          
      };
      
      
      do {
          System.out.println("pengulangan  do while  ke-- " + i);
          i++;
          //h = input.nextLine();
          //i = input.nextInt();
      } while ( i <= 15);
      
      //---------------------------------------------------------------------------
      
      
      
      System.out.println(); //membuat baris baru
      
      
      
      //---------------------------------------------------------------------------
      
      boolean running = true;
      int counter = 0;
      String jawab;
      Scanner scanTiga = new Scanner(System.in);
      
      while(running){
        System.out.println("keluar??[ya/tidak]");
        
        jawab = scanTiga.nextLine();
        
        if(jawab.equalsIgnoreCase("ya")){
          running = false;
        }
        
        counter++;
      }
      
      //---------------------------------------------------------------------------
      
      
      
      System.out.println(); //membuat baris baru
      
      
      
      //---------------------------------------------------------------------------
      
      // pengulangan untuk membuat sebuah table
      
      // membuat variabel
      int barisX, kolomY;

      System.out.println();
      
      System.out.println("|-----------|");
      //System.out.print("");
      // melakukan pengulangan sebanyak x dan y kali
      for (barisX = 0; barisX <= 3; barisX++){
          
          System.out.print("| "+barisX+" : ");
              
          for( kolomY = 0; kolomY <= 2; kolomY++){
              System.out.print(kolomY+",");
          }
          
          System.out.println("|");
          
      }
      System.out.println("|-----------|");
      
      //---------------------------------------------------------------------------
      
      
      
      System.out.println(); //membuat baris baru
      
      
      
      //---------------------------------------------------------------------------
      
      //file Writer
      System.out.println("Masukan isi didalam text : ");
      Scanner scanEmpat = new Scanner(System.in);
      String j = scanEmpat.nextLine();
      //String j = "ini text.";
      
      try {
          //String content = "ini text.";
          File file = new File("C:\\Users\\Family\\Downloads\\Desktop\\fileText.txt");
          
          if ( !file.exists()){
             file.createNewFile();
          }
          
          FileWriter fw = new FileWriter(file.getAbsoluteFile());
          BufferedWriter bw = new BufferedWriter(fw);
          
          bw.write(j);
          bw.close();
          
          System.out.println("Done Output File");
      }
      catch (IOException ex) {
          ex.printStackTrace();
      }
      
      
      //---------------------------------------------------------------------------
      
      
      
      System.out.println(); //membuat baris baru
      
      /**/
      
      //---------------------------------------------------------------------------
      
      //menuju pertemuan 2
      
      String[] xDua = {"dataSatu"};
      String yDua = "";
      String zDua = ""; 

      pertemuanDua iniPertemuanDua = new pertemuanDua(xDua);
      
      //---------------------------------------------------------------------------


      
  }  
}
