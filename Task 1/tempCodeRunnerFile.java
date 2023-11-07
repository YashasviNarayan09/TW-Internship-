import java.lang.*;
import java.util.*;
import java.io.*;
class Main{
    
    public static int gen(int diff){

        if(diff<1||diff>3)
        return -1;

        int  n=0;
        double t=(long)Math.random();
        
        if(diff==1)
        n=(int)(t*10);

        else if(diff==2)
        n=(int)(t*100);

        else 
        n=(int)(t*1000);
        return n;
    }

    public static void main(String[]Args){
        System.out.println("qwerty");
    }

}