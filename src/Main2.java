import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main2 {
    public static int resultado_s;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Usar BoxLayout en el JFrame para ordenar los paneles uno encima del otro que esto me dio el chat
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Panel de resultados
        JPanel panelResultados = new JPanel();
        panelResultados.setBorder(new LineBorder(Color.BLACK));
        panelResultados.setMaximumSize(new Dimension(400, 200));

        // Supongamos que este es el resultado que quieres mostrar
        int resultado = resultado_s;

        JLabel label = new JLabel(String.valueOf(resultado));
        panelResultados.add(label);

        //números
        JPanel panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 2));
        panelNumeros.setBorder(new LineBorder(Color.BLACK));
        panelNumeros.setMaximumSize(new Dimension(400, 200));

        // Agregar botones numerados del 0 al 9
        for (int i = 0; i <= 9; i++) {
            JButton boton = new JButton(String.valueOf(i));
            panelNumeros.add(boton);
        }
        JButton botonSumar = new JButton("+");
        panelNumeros.add(botonSumar);

        // Botón para mostrar el resultado
        JButton botonMostrar = new JButton("=");
        panelNumeros.add(botonMostrar);

        // Botón para limpiar el panel de resultados
        JButton botonLimpiar = new JButton("AC");
        panelNumeros.add(botonLimpiar);





        // Agregar los paneles al JFrame
        frame.getContentPane().add(panelResultados);
        frame.getContentPane().add(Box.createVerticalGlue()); // esto me dio en chat para centrar los paneles
        frame.getContentPane().add(panelNumeros);

        frame.setVisible(true);
    }
}