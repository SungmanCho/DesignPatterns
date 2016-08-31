package builder.concrete;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Builder {

    private Map<String, String> parameters;
    private String method;
    private String url;

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public Builder(String method, String url) {
        if(method == null) {
            method = "GET";
        }
        this.method = method;
        this.url = url;
        this.parameters = new HashMap<String, String>();
    }

    public void addOrReplaceParameter(String key, String value) {
        this.parameters.put(key, value);
    }

    public void addAllParameters(Map<String, String> param) {
        this.parameters.putAll(param);
    }

    public String getParameters() {
        return generateParameters();
    }

    public String getParameter(String key) {
        return this.parameters.get(key);
    }

    private String generateParameters() {
        StringBuffer parameters = new StringBuffer();

        Iterator<String> keys = getKeys();

        String key = "";
        while ( keys.hasNext() ) {
            key = keys.next();
            parameters.append(String.format("%s=%s", key, this.parameters.get(key)));
            parameters.append("&");
        }

        String params = parameters.toString();
        if ( params.length() > 0 ) {
            params = params.substring( 0, params.length() - 1 );
        }

        return params;
    }

    private Iterator<String> getKeys() {
        return this.parameters.keySet().iterator();
    }

    public HttpClient create() {
        HttpClient client = new HttpClient();
        client.setBuilder(this);
        return client;
    }

}