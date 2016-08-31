package builder.concrete;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		// HTTP 요청 준비 작업
		Builder http = new Builder("POST", "http://www.naver.com");

		// 파라미터를 전송한다.
		// 개별 파라미터 전송
		// http.addOrReplace("test", "한글한글...");
		Map<String, String> result = new HashMap<String, String>();
		result.put("data1", "메모에요~");
		result.put("data2", "메모입니다~~~");
		http.addAllParameters(result );

		// HTTP 요청 전송
		HttpClient post = http.create();
		post.request();

		// 응답 상태코드 가져오기
		int statusCode = post.getHttpStatusCode();

		// 응답 본문 가져오기
		String body = post.getBody();
		
		System.out.println(body);
	}
	
}
