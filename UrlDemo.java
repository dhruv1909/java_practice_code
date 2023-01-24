package org.practice;

import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://medium.com/@theiotacademy/17-interesting-java-project-ideas-topics-for-beginners-2023-74fc8cbb123a");
            System.out.println("Protocol:"+ url.getProtocol());
            System.out.println("Host Name"+url.getHost());
            System.out.println("PortNumber"+url.getPort());
            System.out.println("FileName"+url.getFile());

        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
