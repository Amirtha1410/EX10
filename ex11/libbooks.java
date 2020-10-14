/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class libbooks {
    
    public static void main(String [] args) throws InterruptedException
    {
        library obj=new library();
        thread1 th1=new thread1(obj);
        thread2 th2=new thread2(obj);
        thread3 th3=new thread3(obj);
        th1.start();
        th1.join();
        th2.start();
        th2.join();
        th3.start();
        th3.join();
    }
}

class library
{
    static synchronized public void display(String str,String book)
    {
        System.out.println("Name:"+str);
        System.out.println("Book:"+book);
        System.out.println("Due date: 7 days");
    }
}

class thread1 extends Thread
{
    Scanner obj1=new Scanner(System.in);
    String str;
    String book;
    library lib;
    thread1(library lib)
    {
        this.lib=lib;
    }
    public void run()
    {
        System.out.println("Enter the name:");
        str=obj1.next();
        System.out.println("Enter the name of the book:");
        book=obj1.next();
        lib.display(str,book);
    }
}

class thread2 extends Thread
{
   Scanner obj1=new Scanner(System.in);
   String str;
   String book;
   library lib;
    thread2(library lib)
    {
        this.lib=lib;
    } 
    public void run()
    {
        System.out.println("Enter the name:");
        str=obj1.next();
        System.out.println("Enter the name of the book:");
        book=obj1.next();
        lib.display(str,book);
    }
}

class thread3 extends Thread
{
    Scanner obj1=new Scanner(System.in);
    String str;
    String book;
    library lib;
    thread3(library lib)
    {
        this.lib=lib;
    }
    public void run()
    {
        System.out.println("Enter the name:");
        str=obj1.next();
        System.out.println("Enter the name of the book:");
        book=obj1.next();
        lib.display(str,book);
    }
}
