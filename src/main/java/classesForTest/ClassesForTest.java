package classesForTest;

public class ClassesForTest {


    public int sumOfNum(int a, int b){
    int result =a+b;
        return result;
    }

    public static void main(String[] args) {
        String a = "Hello you guys! I'm glad that we are doing git! Nargiza";
        StringBuilder b= new StringBuilder(a);
        System.out.println(b.reverse().toString());


        System.out.println(reversedStr("Hey,team! Today is a good day!"));

    }






    public static String reversedStr(String str){
        String reverse="";
        for(int i =str.length()-1; i >=0; i --){

            reverse+=str.charAt(i);

        }


        return reverse;
    }

}
