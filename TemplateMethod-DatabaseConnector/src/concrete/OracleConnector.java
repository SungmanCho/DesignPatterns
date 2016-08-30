package concrete;

import abst.Connector;

public class OracleConnector extends Connector {

	public OracleConnector(String url, String userName, String password) {
		super(url, userName, password);
	}

	@Override
	protected void loadDriver() {
		System.out.println("...Oracle Driver Load...");
	}

	@Override
	protected String createConnection() {
		return "connection을 생성합니다.";
	}

	@Override
	protected String createdStatement(String query) {
		return query + " 셋팅...";
	}

}
