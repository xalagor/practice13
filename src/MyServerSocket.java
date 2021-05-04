
// передача клиенту строки : MyServerSocket.java
import java.io.*;
import java.net.*;

public class MyServerSocket {
    public static void main(String[] args) throws Exception {
        Socket s = null;
        try { // посылка строки клиенту
            ServerSocket server = newServerSocket(8030);
            s = server.accept();
            PrintStream ps = newPrintStream(s.getOutputStream());
            ps.println("привет!");
            ps.flush();
            s.close(); // разрыв соединения
        } catch (IOException e) {
            System.out.println("ошибка: " + e);
        }
    }
}