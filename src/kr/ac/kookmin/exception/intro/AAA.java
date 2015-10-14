package kr.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class AAA{



    public void readFile(String fileName) {
	    String path = AAA.class.getResource("").getPath();
	    //현재 AAA클래스가 존재하고 있는 경로 위치.
	    System.out.println(path);
	    BufferedReader inputStream = null;

	    try {
	        inputStream = new BufferedReader(new FileReader(path+fileName));

	         
	         String str;
	         
	         while((str = inputStream.readLine()) != null){ //inputStream에서 한 줄씩 읽음. null일 경우 반복문 종료.
                 System.out.println(str);
	         }
	         
	          
	         
	      }  catch(FileNotFoundException e) {
	          System.out.println("파일이 존재하지 않습니다. original.txt파일을 확인해주세요.");
	      } catch(IOException e) {
	          System.out.println("I/O error발생");	      
	      } finally {
	          
	      streamClose(inputStream);
	      //문제에서 제시된 finally 안에서의 close해주는 함수 호출.
	   }
	}
    
    public void streamClose(BufferedReader stream) {
        try {
            stream.close();
        } catch(Exception e) {
            System.out.println("error발생 : close하는 과정에서 에러가 발생했습니다.");
        }
    }
}