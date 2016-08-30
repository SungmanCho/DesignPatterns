import abst.Connector;
import concrete.MSSQLConnector;

public class Application {

	public static void main(String[] args) {
		
		Connector connector = new MSSQLConnector("localhost", "root", "password");
		int count = connector.insert("인서트 쿼리");
		System.out.println(count + "건 인서트 완료");
		
		String result = connector.select("셀렉트 쿼리");
		System.out.println(result);
	}
	
}
