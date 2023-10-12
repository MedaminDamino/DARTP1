package Client;

//import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.net.InetAddress;
import java.net.InetSocketAddress;
public class Client {

public static void main(String[] args) {
	
try {
/*InetAddress inetAdd = InetAddress.getByName("198.200.122.12");
InetSocketAddress isa = new InetSocketAddress(inetAdd,500);
Socket s = new Socket ();
s.connect(isa);*/
System.out.println("je suis un client pas encore connecté");
Socket s =new Socket("localhost",500); //Connexion d'un client

System.out.println("je suis connecté au serveur");
int nb;
Scanner scanner = new Scanner(System.in);//1
System.out.println("ecrire un nombre");
nb = scanner.nextInt();
OutputStream os = s.getOutputStream();
InputStream is = s.getInputStream();
os.write(nb);//2
int rep = is.read();
System.out.println("Le produit de"+nb+"*5="+rep);//6
System.out.println("déconnexion client");
s.close();//Déconnexion d'un client
} catch (Exception e) {

e.printStackTrace();
}

}}
