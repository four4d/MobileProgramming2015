package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);

      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt"));

         
         String str;
         int lineNumber = 0;
         
         while((str = inputStream.readLine()) != null){
             lineNumber++;
             str = Integer.toString(lineNumber).concat(" ").concat(str).concat("\n");
             System.out.println(str);
             outputStream.write(str);             
         }
         
          /**
           구현하시오. 
          **/
         inputStream.close( );
         outputStream.close( );
      } catch(Exception e) {
          System.out.println("error발생");
      }
      
      /** catch() 구문 작성하시오 **/

   }
}