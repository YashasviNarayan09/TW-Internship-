import java.lang.*;
import java.util.*;
import java.io.*;

class NumberGuessing {

    public static int gen(int diff) {

        if (diff < 1 || diff > 3)
            return -1;

        int n = 0;
        double t = Math.random();

        if (diff == 1)
            n = (int) (t * 100);

        else if (diff == 2)
            n = (int) (t * 1000);

        else
            n = (int) (t * 10000);
        return n;
    }

    public static void in(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the difficulty in 1 for easy and 3 for hard");
        System.out.println("Maximum attempts for easy 10 medium 5 and hard 3");
        int d= sc.nextInt();
        logic(d); 
    }

    public static void logic(int d){

        int n= gen(d);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter guessed number");
        int temp=sc.nextInt();

        switch(d){
            case 1:{

                for(int i=1;i<10;i++){
                    if(temp<n){
                        System.out.println("Enter a greater number");
                        temp=sc.nextInt();
                    }
                    else if(temp>n){
                        System.out.println("Enter a smaller number");
                        temp =sc.nextInt();
                    }
                    else
                    {System.out.println("Congratulations you have won!!!!");break;}
                }
                break;
            }
            case 2:{

                for(int i=1;i<5;i++){
                    if(temp<n){
                        System.out.println("Enter a greater number");
                        temp=sc.nextInt();
                    }
                    else if(temp>n){
                        System.out.println("Enter a smaller number");
                        temp =sc.nextInt();
                    }
                    else
                    {System.out.println("Congratulations you have won!!!!");break;}
                }
                break;
            }
            case 3:{

                for(int i=1;i<3;i++){
                    if(temp<n){
                        System.out.println("Enter a greater number");
                        temp=sc.nextInt();
                    }
                    else if(temp>n){
                        System.out.println("Enter a smaller number");
                        temp =sc.nextInt();
                    }
                    else
                    {System.out.println("Congratulations you have won!!!!");break;}
                }
                break;
            }
        }
        System.out.println("Original number: "+n);
        System.out.println("Play Again press 1 for YES and 0 for NO");
        temp= sc.nextInt();
        if(temp==1)
        in();
    }

    public static void main(String[] Args) {
        System.out.println("Welcome to the Number guessing game");
        System.out.println("Guess the number correctly to win");
        in();
    }

}