package com.directi.training.dip.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataReader implements NetworkReader {

    @Override
    public String readFromNetwork() throws IOException {
        URL url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        return content.toString();
    }
}
