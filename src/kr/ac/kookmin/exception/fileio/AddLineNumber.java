package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
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
         
         while((str = inputStream.readLine()) != null){ //inputStream에서 한 줄씩 읽음. null일 경우 반복문 종료.
             lineNumber++;
             str = Integer.toString(lineNumber).concat(" ").concat(str).concat("\n");
             System.out.println(str);  //모니터링을 위한 콘솔 출력.
             outputStream.write(str);  //파일에 한 줄 출력.             
         }
         
          /**
           구현하시오. 
          **/
         inputStream.close( );
         outputStream.close( );
      } catch(Exception e) {
          System.out.println("error발생 : origianl.txt파일이 존재하는지 확인해주십시오.");
      }
      
      /** catch() 구문 작성하시오 **/

   }
}