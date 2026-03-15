package Paisaje;
//ventana principal

import javax.swing.*;

//1 paso:Crear ventana principal

//Jframe convierte la clase en una ventana gráfica
public class Main extends JFrame {
    //2 paso:Hacer constructor de Main
    //vamos a configurar la ventana

    public Main() {
        setTitle("Paisaje Yeymi x Maria A");
        //tamaño. Ancho, alto
        setSize(1000, 500);

        //centrar ventana en la pantalla
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelPaisaje panel = new PanelPaisaje();
        add(panel);
        //Mostrar ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        //crear ventana

        //paso 3.1:Agregar el panle al JFrame
        new Main();


    }

}


