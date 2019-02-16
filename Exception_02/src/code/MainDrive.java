package code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainDrive {

	public static void main(String[] args) {
		
//		저장하고자 하는 파일의 경로 설정
		File f = new File("memo.txt");
				
		try {
//			해당 경로에 실제로 데이터 작성을 담당하는 클래스
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요");
			System.out.println("파일을 확인해주세요.");
			
			bw.close();
			fw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
