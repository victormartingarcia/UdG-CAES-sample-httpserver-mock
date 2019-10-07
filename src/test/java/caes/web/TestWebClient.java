package caes.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWebClient {
    @Test
    public void testGetContentOk() throws Exception {
        MockInputStream mockStream = new MockInputStream();
        mockStream.setBuffer("It works");

        MockConnectionFactory mcf = new MockConnectionFactory();
        mcf.setData(mockStream);

        WebClient client = new WebClient();
        String result = client.getContent(mcf);
        assertEquals("It works", result);
        mockStream.verify();
    }
}
