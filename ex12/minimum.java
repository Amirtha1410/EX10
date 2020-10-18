/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

import java.util.Scanner;
import java.lang.Double;
/**
 *
 * @author ELCOT
 */
public class minimum {
    
    public static void main(String[] args)
    {
        
        System.out.println("\nINTEGER ARRAY\n");
        Integer list[]={8,7,9,0,4,5};
        sample1<Integer> obj = new sample1<>(list);
        obj.display();
        obj.sort1();
        
         System.out.println("\nDOUBLE ARRAY\n");
        Double list1[]={8.0,7.0,9.0,4.0,5.0};
        sample1<Double> obj1 = new sample1<>(list1);
        obj1.display();
        obj1.sort2();
        
        System.out.println("\nFLOAT ARRAY\n");
        Float list2[]={8.0f,7.0f,9.0f,0.0f,5.0f};
        sample1<Float> obj2 = new sample1<>(list2);
        obj2.display();
        obj2.sort3();
        
        System.out.println("\nCHARACTER ARRAY\n");
        Character list3[]={'z','h','i','o'};
        sample1<Character> obj3 = new sample1<>(list3);
        obj3.display();
        obj3.sort4();
        
        System.out.println("\nSTRING ARRAY\n");
        String list4[]={"zoo","hulk","ironman","oyster","thor"};
        sample1<String> obj4 = new sample1<>(list4);
        obj4.display();
        obj4.sort5();
    }
}

class sample1 <T>
{
    Scanner obj1=new Scanner(System.in);
    T[] value;
    //int n;
    T v;
    //double temp;

    public sample1(T[] value)
    {
        this.value=value;
        //this.n=n;
    }
    public void display()
    {
        
        System.out.println("Elements of Array");
        for(int i=0;i<value.length;i++)
        {
            System.out.println(value[i]);
        }
    }
    public void sort1()
    {
        T temp;
        for(int i=0;i<value.length;i++)
        {
            for(int j=i+1;j<value.length;j++)
            {
               int t=(int)value[i];
               int g=(int)value[j]; 
               if(t>g)
               {
                  
                   temp=value[i];
                   value[i]=value[j];
                   value[j]= temp;
               } 
            }
        }
         System.out.println("Minimum value in array:"+value[0]);
    }
    
     public void sort2()
    {
        T temp;
        double t,g;
        for(int i=0;i<value.length;i++)
        {
            for(int j=i+1;j<value.length;j++)
            {
                t =(double)value[i];
                g =(double)value[j];
               if(t>g)
               {
                  
                   temp=value[i];
                   value[i]=value[j];
                   value[j]= temp;
               } 
            }
        }
         System.out.println("Minimum value in array:"+value[0]);
    }
    
     public void sort3()
    {
        T temp;
        for(int i=0;i<value.length;i++)
        {
            for(int j=i+1;j<value.length;j++)
            {
                
               float t=(float)value[i];
               float g=(float)value[j]; 
               if(t>g)
               {
                  
                   temp=value[i];
                   value[i]=value[j];
                   value[j]= temp;
               } 
            }
        }
         System.out.println("Minimum value in array:"+value[0]);
    }
     
     public void sort4()
    {
        T temp;
        for(int i=0;i<value.length;i++)
        {
            for(int j=i+1;j<value.length;j++)
            {
                
               char t=(char)value[i];
               char g=(char)value[j]; 
               if(t>g)
               {
                  
                   temp=value[i];
                   value[i]=value[j];
                   value[j]= temp;
               } 
            }
        }
         System.out.println("Minimum value in array:"+value[0]);
    }
 
      public void sort5()
    {
        T temp;
        String t,g;
        for(int i=0;i<value.length;i++)
        {
            for(int j=i+1;j<value.length;j++)
            {
                
                t=value[i].toString();
                g=value[j].toString(); 
               if(t.compareTo(g)>=0)
               {
                  
                   temp=value[i];
                   value[i]=value[j];
                   value[j]= temp;
               } 
            }
        }
         System.out.println("Minimum value in array:"+value[0]);
    }
}

//Integer i[]=new Integer[20];