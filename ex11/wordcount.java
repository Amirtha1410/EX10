/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ELCOT
 */
public class wordcount {
    
    public static void main(String[] args) throws IOException
    {
        
        thread1 obj=new thread1();
        obj.start();
        
        thread2 obj1=new thread2();
        obj1.start();
        
        thread3 obj2=new thread3();
        obj2.start();
      
    }
}

class thread1 extends Thread 
{
   // @Override
    public void run()
    {
        try
        {
         FileInputStream fis=new FileInputStream("address.txt");
       int read,count=0;
       while((read=fis.read())!=-1)
       {
           if((char)read==' ' || (char)read=='.')
           {
               count++;  
           }
       }
       System.out.println("Address.txt :"+count+" words");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());        
        }
    }
}

class thread2 extends Thread
{
  public void run() 
  {
      try
      {
     FileInputStream fis1=new FileInputStream("final.txt");
       int read1,count1=0;
       while((read1=fis1.read())!=-1)
       {
           if((char)read1==' ' || (char)read1=='.')
           {
               count1++;  
           }
       }
       System.out.println("Final.txt :"+count1+" words"); 
      }
       catch(IOException e)
        {
            System.out.println(e.getMessage());        
        }
  }
}

class thread3 extends Thread
{
   public void run()
   {
       try
       {
       FileInputStream fis2=new FileInputStream("first.txt");
       int read2,count2=0;
       while((read2=fis2.read())!=-1)
       {
           if((char)read2==' ' || (char)read2=='.')
           {
               count2++;  
           }
       }
       System.out.println("First.txt :"+count2+" words");
       }
       catch(IOException e)
        {
            System.out.println(e.getMessage());        
        }
   }
}