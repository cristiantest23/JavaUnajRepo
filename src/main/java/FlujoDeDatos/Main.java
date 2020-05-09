package FlujoDeDatos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
            Scanner reader = new Scanner(System.in);
            String texto = reader.nextLine();
            FlujoDeDatos.MyThread thread1 = new FlujoDeDatos.MyThread(texto);
            thread1.start();
            System.out.println("Ingreso Texto: "+ texto);
    }

    public static void FlujoPunto1y2(String textoIngresado) throws IOException {
        synchronized (textoIngresado) {
            try {
                FileWriter fwf = new FileWriter("D:\\ficheroFlujo.txt");
                FileReader fwfr = new FileReader("D:\\ficheroFlujo1.txt");//Si sacamos el 1 del nombre del archivo corre bien

                fwf.write(textoIngresado);
                fwf.flush();

                int valor = fwfr.read();

                while (valor != -1) {
                    System.out.print((char) valor);
                    valor = fwfr.read();
                }
                Thread.sleep(400);
                fwf.close();
                fwfr.close();
            } catch (IOException | InterruptedException e) {
                System.out.println("Error E/S: " + e);
                FileWriter log = new FileWriter("D:\\log.xml");
                log.write("<header>\n" +
                        "<line> " + "["+GetDateTime()+"]"+" - " + e.toString() + "</line>\n" +
                        "...\n" +
                        "</header>");
                log.flush();
            } finally {
                System.out.println("Ejecuto en Finally");
            }

        }
    }

    public static String GetDateTime() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
