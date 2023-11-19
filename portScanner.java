import java.io.IOException;
import java.net.Socket;

public class PortScanner {

    public static void scanPorts(String targetIp, int startPort, int endPort) {
        System.out.println("Starting port scanning on " + targetIp + "...");
        for (int port = startPort; port <= endPort; port++) {
            try {
                Socket socket = new Socket(targetIp, port);
                System.out.println("Port " + port + " is open.");
                socket.close();
            } catch (IOException e) {
                System.out.println("Port " + port + " is closed. Reason: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java PortScanner <target_ip> <start_port> <end_port>");
            System.exit(1);
        }

        String targetIp = args[0];
        int startPort = Integer.parseInt(args[1]);
        int endPort = Integer.parseInt(args[2]);

        if (startPort > endPort || startPort <= 0 || endPort > 65535) {
            System.out.println("Invalid port range.");
            System.exit(1);
        }

        scanPorts(targetIp, startPort, endPort);
    }
}
