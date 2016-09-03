package smapless;

import java.util.Scanner;


public class strcomm {
     public static void main(String[] args){
        System.out.println("enter the strings");
        Scanner sc=new Scanner(System.in); 
         String s1=sc.nextLine();
         String s2=sc.nextLine();
        int a=s1.length();
        int b=s2.length();
         System.out.println("enter the key");
         Scanner in=new Scanner(System.in);
         int k=in.nextInt();
        int k1=k-1;
       if(a>b){
            String s3=s1.substring(a-2,a);
            System.out.println(""+s3);
           char s4=s1.charAt(k1);
            char s5=s1.charAt(a-k);
             char s8=s3.charAt(0);
             System.out.println(""+s8);
            int s9=Character.toUpperCase(s8);
            char s10=s3.charAt(1);
             String s6=s10+s2+s4+s5;
            //System.out.println(""+s6);
            System.out.println((char)s9+s6);
            
        }else{
            String s3=s2.substring(b-2,b);
            char s4=s2.charAt(k1);
            char s5=s2.charAt(b-k);
            char s8=s3.charAt(0);
            int s9=Character.toUpperCase(s8);
            char s10=s3.charAt(1);
             String s7=s10+s1+s4+s5;
             System.out.println((char)s9+s7);
        }
    }
}
