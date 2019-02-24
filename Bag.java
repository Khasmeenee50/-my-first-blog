import java.io.*;
import java.util.Scanner;
public class Bag{
    public void MyBag(){
        Subnovice nv = new Subnovice();
        SubBag b = new SubBag();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose your Item");
        System.out.println("(1)Chicken (2)Hit (3)Stomp (4)Status (5)Stop");
        int n=0;
        while(n!=5)
        {
            System.out.print("Enter number: ");
            n=scan.nextInt();
            if(n==1){
                b.PrintItem(1);
                nv.Eat(0.5);
            }
            else if(n==2){
                b.PrintItem(2);
                nv.Walk();
            }
            else if(n==3){
                b.PrintItem(3);
                nv.Jump();
            }
            else if(n==4){
                nv.PrintStatus(nv.level,nv.hp,nv.exp);
            }   
        }
        System.out.println("End Game");
    }
}
