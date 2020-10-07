/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ELCOT
 */
public class binaryfile {
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //BYTE STREAM.
        FileInputStream fis=null;
        FileOutputStream fos=null;
        fis=new FileInputStream("iron_man_.jpg");
        fos=new FileOutputStream("image.jpg");
        int read;
        while((read=fis.read())!=-1)
        {
            fos.write(read);
        }
        fis.close();
        fos.close();
        
        //CHARECTER STREAM.
        FileReader obj=null;
        FileWriter obj1=null;
        obj=new FileReader("lion king.jpg");
        obj1=new FileWriter("image1.jpg");
        int read1;
        while((read1=obj.read())!=-1)
        {
            obj1.write(read1);
        }
        obj.close();
        obj1.close();
    }
}
