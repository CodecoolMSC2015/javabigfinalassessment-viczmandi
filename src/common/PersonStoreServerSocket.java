package common;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonStoreServerSocket {
	private DataReader store;
	final static int PORT = 1234;

	public static void start() throws IOException {
		System.out.println("Server running on port: " + PORT);
		ServerSocket ss = new ServerSocket(PORT);
		Socket socket = ss.accept();
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

		PersonStoreServerSocket psss = new PersonStoreServerSocket();
		while (true) {
			if (ois.read() > -1) {
			}
		}
	}

	public static void main(String[] args) throws IOException {
		PersonStoreServerSocket.start();
	}
}
