/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class array {
    
    public static void main(String[] args)
    {
        System.out.println("\nINTEGER ARRAY\n");
        Integer num[] = new Integer[20];
        num[0]=10;num[1]=20;num[2]=30;
        System.out.println("Elements of array:");
        for(int i=0;i<3;i++)
        {
            System.out.println(num[i]);  
        }
        add<Integer>obj1=new add<>(num);
        System.out.println("After insertion:");
        obj1.front(5);
        obj1.end(35);
        obj1.mid(15);
        for(int i=0;i<6;i++)
        {
            System.out.println(num[i]);  
        }
        System.out.println("Before deletion:");
        obj1.view();
        obj1.deleteat(6);
        System.out.println("After deletion:");
        obj1.view();
        
        
        System.out.println("\nCHARACTER ARRAY\n");
        Character ch[] = new Character[20];
        ch[0]='a';ch[1]='b';ch[2]='c';
        System.out.println("Elements of array:");
        for(int i=0;i<3;i++)
        {
            System.out.println(ch[i]);  
        }
        add<Character>obj2=new add<>(ch);
        System.out.println("After insertion:");
        obj2.front('x');
        obj2.end('y');
        obj2.mid('z');
        for(int i=0;i<6;i++)
        {
            System.out.println(ch[i]);  
        }
        System.out.println("Before deletion:");
        obj2.view();
        obj2.deleteat(3);
        System.out.println("After deletion:");
        obj2.view();
        
        
        System.out.println("\nFLOAT ARRAY\n");
        Float fnum[] = new Float[20];
        fnum[0]=2.34f;fnum[1]=6.7f;fnum[2]=2.9f;
        System.out.println("Elements of array:");
        for(int i=0;i<3;i++)
        {
            System.out.println(fnum[i]);  
        }
        add<Float>obj3=new add<>(fnum);
        System.out.println("After insertion:");
        obj3.front(4.4f);
        obj3.end(9.8f);
        obj3.mid(6.8f);
        for(int i=0;i<6;i++)
        {
            System.out.println(fnum[i]);  
        }
        System.out.println("Before deletion:");
        obj3.view();
        obj3.deleteat(1);
        System.out.println("After deletion:");
        obj3.view();

        
        System.out.println("\nDOUBLE ARRAY\n");
        Double dnum[] = new Double[20];
        dnum[0]=2.34;dnum[1]=6.7;dnum[2]=2.9;
        System.out.println("Elements of array:");
        for(int i=0;i<3;i++)
        {
            System.out.println(dnum[i]);  
        }
        add<Double>obj4=new add<>(dnum);
        System.out.println("After insertion:");
        obj4.front(4.4);
        obj4.end(9.8);
        obj4.mid(6.8);
        for(int i=0;i<6;i++)
        {
            System.out.println(dnum[i]);  
        }
        System.out.println("Before deletion:");
        obj4.view();
        obj4.deleteat(1);
        System.out.println("After deletion:");
        obj4.view();
        
        
        System.out.println("\nSTRING ARRAY\n");
        String str[] = new String[20];
        str[0]="hulk";str[1]="thor";str[2]="panther";
        System.out.println("Elements of array:");
        for(int i=0;i<3;i++)
        {
            System.out.println(str[i]);  
        }
        add<String>obj5=new add<>(str);
        System.out.println("After insertion:");
        obj5.front("captain");
        obj5.end("ironman");
        obj5.mid("antman");
        for(int i=0;i<6;i++)
        {
            System.out.println(str[i]);  
        }
        System.out.println("Before deletion:");
        obj5.view();
        obj5.deleteat(1);
        System.out.println("After deletion:");
        obj5.view();
    }
}

class add<T>{
 T[] vals;
 add(T[] array) {
     vals = array; 
 }

 public  void front(T element) {
    int i=0,j=0;
    while(vals[i]!=null)//counting numberof element
       i++;


    while(i!=0){//shifting one element ahead
        vals[i]=vals[i-1];
        i--;
     }
    vals[0]=element;


 }
 public  void end(T element) {
    int i=0;
    while(vals[i]!=null)
       i++;//counting elements

    vals[i]=element;//placing at end

 }
 public  void mid(T element) {
    int i=0,k;
    while(vals[i]!=null)
       i++;//counting element 
    k=(int)i/2;//finding mid point

    while(i!=k){
        vals[i]=vals[i-1];//shifting one step ahead
        i--;

    }

    vals[i]=element;//placing at min position
 }

 public void deleteat(int pos){
     int i=pos;
     while(vals[i]!=null){
         vals[i-1]=vals[i];//shifting one step before 
         i++;

     }
     //System.out.println(i);
     vals[i-1]=null; //setting last element as null
 }
 //to view the elements of array
 public void view(){
     System.out.print("Your array: ");
     int i=0;
     while(vals[i]!=null){
       System.out.print(vals[i]+" ");
       i++;
     }
     System.out.println();  
 }

 } 