package CH01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class c06SimpleDateFormatMain {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD 입력 : ");
		String ymd = sc.next();
		
		
		
		//formater 객체 생성(입력용)
		SimpleDateFormat fmtin = new SimpleDateFormat("YYYY/MM/DD");
		Date date = fmtin.parse(ymd);
		System.out.println(date);
		
		//formater 객체 생성(출력용)
		SimpleDateFormat fmtout = new SimpleDateFormat("YYYY/MM/DD");
		System.out.println(fmtout.format(date));
	}

}
