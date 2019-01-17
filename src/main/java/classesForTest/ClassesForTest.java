package classesForTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassesForTest {


    public int sumOfNum(int a, int b){
    int result =a+b;
        return result;
    }

    public static void main(String[] args) {
        String a = "Hello you guys! I'm glad that we are doing git! Nargiza";
        StringBuilder b= new StringBuilder(a);
        System.out.println(b.reverse().toString());
        System.out.println("=========================================================");

        System.out.println(reversedStr("Hey,team! Today is a good day!"));




        int [][] anyName={{4,46,7},{7,5,33,77},{5,6},{7}};



        for(int i =0; i <anyName.length; i ++){

            System.out.println();
            for(int k=0; k<anyName[i].length; k++){

                System.out.print(anyName[i][k]+" ");


            }




        }
        System.out.println("\n==========ArrayList and it's methods===========================");


        ArrayList<String>hello=new ArrayList();

        hello.add("Kamil");
        hello.add("Jaza");
        hello.add("Aizhana");
        hello.add("Ajara");
        hello.add("Elif abla");
        hello.add("Kutmanai");


        System.out.println(hello.contains("Nargiza"));
      boolean tf=  hello.isEmpty();
        System.out.println(tf);
        //System.out.println(hello.iterator());

hello.add("Nargiza" );

        System.out.println(hello);


        System.out.println("Testing QA branch");

    }



    public static String reversedStr(String str){
        String reverse="";
        for(int i =str.length()-1; i >=0; i --){

            reverse+=str.charAt(i);

        }


        return reverse;
    }

}
