import java.io.*;
import java.net.*;

public class Main {

    public static void main(String arg[]) {

        try {
            URL url = new URL("http://www.google.com:80/index.html");

            URLConnection con = url.openConnection();

            System.out.println("Content Type = " + con.getContentType());

            long d = con.getDate();
            System.out.println("Date = " + d);

            System.out.println("Content length = " + con.getContentLength());

            InputStream is = con.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String data = br.readLine();

            FileOutputStream fos = new FileOutputStream("F:/hello.html");

            while (data != null) {
                fos.write((data + "\n").getBytes());
                data = br.readLine();
            }

            br.close();
            fos.close();

            System.out.println("File downloaded successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
