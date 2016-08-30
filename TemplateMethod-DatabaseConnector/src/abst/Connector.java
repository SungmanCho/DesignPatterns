package abst;

public abstract class Connector {

	protected String url;
	protected String userName;
	protected String password;
	
	public Connector(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	protected abstract void loadDriver();
	protected abstract String createConnection();
	protected abstract String createdStatement(String query);
	
	public String select(String query) {
		loadDriver();
		
		String connection = createConnection();
		System.out.println(connection + " 생성");
		
		String preparedStatement = createdStatement(query);
		System.out.println(preparedStatement + " 생성");
		
		String resultSet = query + "를 실행한 결과를 돌려줍니다.";
		
		return resultSet;
	}
	
	public int insert(String query) {
		loadDriver();
		
		String connection = createConnection();
		System.out.println(connection + " 생성");
		
		String preparedStatement = createdStatement(query);
		System.out.println(preparedStatement + " 생성");
		
		System.out.println(query + " 실행 했습니다.");
		
		return 1;
	}
	
	
	
}
