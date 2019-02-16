package code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSystem {

	public void textWriteScenario() {
//		텍스트 파일을 저장하는 실습 코드
		
//		1. 파일을 어디에 저장할지 경로 설정. 절대경로 / 상대경로
		
		File myFile = new File("phonebook.csv");
		
//		2. 설정된 경로에 접근하고 (텍스트) 파일 내용을 기록하는 클래스 소환
//		 myFile에 경로가 설정되어 있으니, fileWriter 클래스의 생성자의 재료로 집어넣자.
//		 FileWrither의 생성자에 throws IOException이 정의되어 있으니 처리해야한다!
//		 try문 안에 이어서 작성
		
		try {
			FileWriter fw = new FileWriter(myFile);
			
//			FileWriter를 도와서 더 쉬운 작업을 할 수 있게 해주는 BufferedWriter를 생성.
			BufferedWriter bw = new BufferedWriter(fw);
			
//			bw 변수를 이용해서 내용을 기록.
//			write : 기존의 내용을 전부 삭제하고 덮어쓰
			bw.write("이름, 연락처");
			
//			append는 바로 옆에 이어붙여주니까 다음줄로 내림.
			bw.newLine();
			
//			append : 이어붙이다. 기존의 내용 뒤에 이어붙임.
			bw.append("조경진, 010-5112-3237");
			bw.newLine();
			bw.append("윤소윤, 010-1234-5678");

			
//			파일에 필요한 접근을 마치고 나면, 반드시 연결을 종료해야함.
//			제일 최근에 연결한 bw부터 연결 종료, fw도 연결 종료.
			
			bw.close();
			fw.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
//	2. 텍스트 파일 읽어오기
	
	public void textFileReadScenario() {
		
//		1. 어디에 있는 파일을 읽어올건지, 경로 설정.
		
		File readFile = new File("phonebook.txt");
		
//		2. 파일을 실제로 읽어주는 FileReader 클래스를 객체화.
		
		try {
			FileReader fr = new FileReader(readFile);
			
			
//			FileReader는 한글자씩 파일을 읽어들여옴 => 매우 불편.
//			버퍼를 활용해서 한 문장씩 뭉텅이로 읽어오기 위해 BufferedReader를 사용.
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				
				if (line == null)
//					파일에 더이상 읽어올 내용이 없다! => 끝까지 읽었다!
					break;
				System.out.println(line);
				
			}
			
			br.close();
			fr.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일이 없습니다!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 읽는 중에 문제가 생겼습니다.");
		}
		
		
	}
	
}






















