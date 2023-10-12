package Server;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
	
public class Server {
	public static void main(String[] args) {
	try {
	System.out.println("je suis un serveur");

	ServerSocket ssk = new ServerSocket(700);//Création d'une nv socket
	System.out.println("j'attend un client..");
	Socket sk = ssk.accept();//Acceptation de la demande du client
	System.out.println("un client est connecté");
	OutputStream os = sk.getOutputStream();
	InputStream is = sk.getInputStream();
	int nb = is.read();//3
	System.out.println("j'ai reçu la valeur"+nb);
	int rep = nb*5;//4
	os.write(rep);//5
	System.out.println("déconnexion serveur");
	sk.close();//couper le liaison entre le client et le serveur
	ssk.close();//libérer le port
	}catch(Exception e) {
	e.printStackTrace();
	}

	}}


