package Paisaje;


import javax.swing.*;
import java.awt.*;

//paso 3:Convertir la clase en un panel
public class PanelPaisaje extends JPanel {

    //paso 4:Metodo que se ejecuta cada vez que la pantalla necesita dibujar o redibujar
    @Override
    protected void paintComponent(Graphics grafica) {
        super.paintComponent(grafica);
//ponerle color al fondo
        grafica.setColor(Color.white);

// PRIMER EDIFICIO LADO IZQUIERDO---------------------------------------------------


        //circulos del techo
        Color micolor0 = new Color(246, 153, 15);
        grafica.setColor(micolor0);
        grafica.fillOval(13, 110, 40, 40);
        grafica.fillOval(20, 70, 40, 40);
        grafica.fillOval(37, 36, 40, 40);
        grafica.fillOval(37, 34, 40, 40);
        grafica.fillOval(72, 18, 40, 40);
        grafica.fillOval(110, 10, 40, 40);
        grafica.fillOval(148, 17, 40, 40);
        grafica.fillOval(184, 36, 40, 40);
        grafica.fillOval(209, 65, 40, 40);
        grafica.fillOval(226, 101, 40, 40);


        grafica.setColor(Color.BLACK);
        grafica.drawOval(13, 110, 40, 40);
        grafica.drawOval(20, 70, 40, 40);
        grafica.drawOval(37, 34, 40, 40);
        grafica.drawOval(72, 18, 40, 40);
        grafica.drawOval(110, 10, 40, 40);
        grafica.drawOval(148, 17, 40, 40);
        grafica.drawOval(184, 36, 40, 40);
        grafica.drawOval(209, 65, 40, 40);
        grafica.drawOval(226, 101, 40, 40);


//rectangulo primer edificio lado izquierdo
        Color micolor = new Color(140, 119, 9);
        grafica.setColor(micolor);

        // rectángulo relleno
        grafica.fillRect(32, 143, 208, 346);

        //techo del primer edificio lado izquierdo
        grafica.fillOval(32, 38, 208, 210);

        //primera ventana arriba del edificio izquierdo
        Color micolor1 = new Color(113, 77, 39);
        grafica.setColor(micolor1);

        //semicirculo principal ventana
        grafica.fillArc(50, 51, 172, 170, 0, 180);

        grafica.setColor(Color.BLACK);
        grafica.drawArc(50, 51, 172, 170, 0, 180);
        Color micolor2 = new Color(218, 149, 206);

        //semicirculo interior
        grafica.setColor(micolor2);
        grafica.fillArc(64, 63, 144, 120, 0, 180);

        //ventanas de adentro
        grafica.setColor(micolor1);
        grafica.fillRect(129, 63, 11, 70);

        grafica.fillRoundRect(60, 91, 150, 11, 5, 5);
        grafica.fillOval(120, 80, 30, 30);

        //ventana debajo de la ventana principal
        Color micolor3 = new Color(226, 151, 210);
        grafica.setColor(micolor3);

        grafica.fillRoundRect(65, 150, 143, 77, 10, 10);
        grafica.setColor(Color.BLACK);
        grafica.drawRoundRect(65, 150, 143, 77, 10, 10);
        //interior de la segunda ventana
        Color micolor4 = new Color(165, 156, 216);
        grafica.setColor(micolor4);
        grafica.fillRoundRect(72, 157, 130, 64, 10, 10);

        grafica.setColor(micolor3);
        grafica.fillRect(131, 150, 9, 78);
        grafica.fillRect(70, 185, 135, 9);
//ventanas grandes

        Color micolor5 = new Color(122, 88, 50);
        grafica.setColor(micolor5);
        //ventana 1
        grafica.fillRoundRect(70, 240, 65, 85, 10, 10);
        //ventana 2
        grafica.fillRoundRect(140, 240, 65, 85, 10, 10);

        grafica.setColor(micolor0);
        grafica.fillRoundRect(78, 245, 50, 75, 10, 10);
        grafica.fillRoundRect(148, 245, 50, 75, 10, 10);


//        //rectangulo
//        grafica.setColor(Color.BLUE);
//        grafica.drawRect(50, 100, 150, 160);
//
//        //rectangulo rfelleno
//        grafica.setColor(Color.ORANGE);
//        grafica.fillRect(100, 300, 100, 100);
//
//
//        //circulo
//        grafica.setColor(Color.black);
//        grafica.drawOval(100, 450, 150, 90);
//
//        //circulo relleno
//        grafica.setColor(Color.CYAN);
//        grafica.fillOval(250, 450, 150, 90);
//
//        //FUENTE
//        Font fuente = new Font("Arial", Font.BOLD, 30);
//
//        grafica.setFont(fuente);
//
//        //texto y color
//
//        grafica.setColor(Color.RED);
//        grafica.drawString("Maria Antonia", 250, 250);
//
//        //RGB
//
//        Color micolor = new Color(110, 84, 89);
//        grafica.setColor(micolor);
//
//        grafica.fillRect(350, 330, 150, 60);
//        grafica.setColor(micolor);
//        grafica.setColor(Color.lightGray);
//        grafica.drawString("ejemplo ", 370, 360);
//
//
//        grafica.setColor(Color.black);
//        grafica.drawString("0,0", 0, 50);
//        grafica.drawString("0,0", 935, 650);

        grafica.setColor(micolor5);
        //ventana 1
        grafica.fillRect(98, 240, 9, 85);
        grafica.fillRect(75, 280, 60, 9);
        //ventana 2
        grafica.fillRect(168, 240, 9, 85);
        grafica.fillRect(148, 280, 55, 9);


        grafica.setColor(micolor3);
        grafica.fillRoundRect(95, 340, 90, 35, 10, 10);

        //GRAFICO CASA DEL LADO DERECHO-----------------------------------

        Color micolor6 = new Color(236, 86, 18);
        grafica.setColor(micolor6);

        grafica.setColor(micolor0);
        // rectángulo relleno casa
        grafica.fillRect(607, 51, 196, 438);

        grafica.setColor(Color.BLACK);
        grafica.drawRect(607, 51, 196, 438);

        //Techo (un cuadrado y 2 triangulos)
        grafica.setColor(micolor);
        grafica.fillRect(600, 51, 199, 100);
        int[] xPuntos = {801, 722, 872};
        int[] yPuntos = {51, 151, 151};
        grafica.fillPolygon(xPuntos, yPuntos, 3);
        int[] xPunto = {600, 525, 675};
        int[] yPunto = {50, 150, 150};
        grafica.fillPolygon(xPunto, yPunto, 3);

        // Ventana 1 techo
        grafica.setColor(micolor6);
        grafica.fillRect(620, 93, 47, 29);
        grafica.setColor(Color.BLACK);
        grafica.drawRect(620, 93, 47, 29);
        grafica.setColor(Color.BLACK);
        grafica.drawLine(620, 108, 667, 108);//linea de la mitad

        // ventana 2 techo
        grafica.setColor(micolor6);
        grafica.fillRect(733, 93, 47, 29);
        grafica.setColor(Color.BLACK);
        grafica.drawRect(733, 93, 47, 29);
        grafica.drawLine(733, 108, 780, 108);//linea de la mitad

        // ventana circular

        grafica.setColor(Color.WHITE);
        grafica.fillOval(657, 174, 89, 61);//circulo blanco
        grafica.setColor(micolor4);
        grafica.fillOval(665, 178, 72, 52);//circulo lila

        grafica.setColor(Color.WHITE);
        grafica.fillRect(699, 174, 5, 61); //marco blanco

        grafica.setColor(Color.WHITE);
        grafica.fillRect(658, 203, 87, 3);



    }
}
