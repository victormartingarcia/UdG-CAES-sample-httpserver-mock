package caes.web;

import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;

public class HttpURLConnectionFactory implements ConnectionFactory {
    private URL url;

    public HttpURLConnectionFactory(URL url) {
        this.url = url;
    }

    public InputStream getData() throws Exception {
        HttpURLConnection connection = (HttpURLConnection) this.url.openConnection();
        return connection.getInputStream();
    }
}
