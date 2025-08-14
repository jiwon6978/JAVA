package CH07;

import java.util.ArrayList;
import java.util.List;
public class C05기타반복처리 {

	public static void main(String[] args) {
		
		// Collection (자료구조 -List , Map)객체를 이용 -저장
		
		List<String> lists = new ArrayList();
		lists.add("JAVA");
		lists.add("JSP");
		lists.add("SERVLET");
		lists.add("SPRINGBOOT");
		lists.add("NODEJS");
		lists.add("REACT");
		lists.add("DOCKER_COMPOSE");
		
		//반복 : 기본 for 인덱스번호활용
//		for(int i=0; i<lists.size(); i++) {
//			System.out.println(lists.get(i));
//		}
		
		
		//반복 : 개량 for 객체
//		for(String subject : lists) {
//			System.out.println(subject);
//		}
//		
		//반복 : 스트림함수(ForEach)
		//()=>{} 와 유사한 람다함수
		lists.stream().forEach((item)->{System.out.println(item);});
		
		
	}

}
