package FlujoDeDatos;

import java.io.IOException;

public class MyThread extends Thread {


    String texto;

    public MyThread(String Texto)
    {
        this.texto=Texto;
    }

    public void run()
    {
        try {
            Main.FlujoPunto1y2(texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Se ingreso Texto");
    }





}
