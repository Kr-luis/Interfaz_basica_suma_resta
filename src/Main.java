import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*public class Main {
    public static void main(String[] args) {
        //BOTONES
        JButton boton0 = new JButton("CLICK");
        JButton boton1 = new JButton("SALUDA");
        JButton botonnotas = new JButton("VER NOTAS");
        //ETIQUETAS
        JLabel texto = new JLabel("LA POLI");
        JLabel texto1 = new JLabel("HOLA QUE TAL");
        JLabel textonotas = new JLabel("VER NOTAS");
        //PANELES
        JPanel panelNORTE = new JPanel();
        JPanel panelSUR = new JPanel();
        JPanel panelCENTRO = new JPanel();
        //VENTANA
        JFrame ventana = new JFrame("REGISTRO");
                ventana.setSize(500,500);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setVisible(true);
                panelNORTE.add(texto);
                panelNORTE.add(boton0);
                panelSUR.add(texto1);
                panelSUR.add(boton1);
                panelCENTRO.add(textonotas);
                panelCENTRO.add(botonnotas);
                ventana.add(panelNORTE, BorderLayout.EAST);
                ventana.add(panelSUR, BorderLayout.CENTER);
                ventana.add(panelCENTRO, BorderLayout.WEST);



    }
}*/
public class Main {
    private static int resultado = 0;
    public static void main(String[] args){
        //Botones
        JButton botonSUMA = new JButton("SUMA");
        JButton botonRESTA = new JButton("RESTA");
        JButton botonSALIR = new JButton("SALIR");
        //Textos
        JLabel TextoOpmas = new JLabel("Operacion 6+5");
        JLabel TextoOpmenos = new JLabel("Operacion 6-5");
        JLabel TextoSuma = new JLabel("suma");
        JLabel TextoResta = new JLabel("resta");
        JLabel TextoSalir = new JLabel("Salir");
        //Paneles
        JPanel panelsuma = new JPanel();
        JPanel panelresta = new JPanel();
        JPanel panelsalir = new JPanel();
        //Ventanas
        JFrame ventana = new JFrame("CALCULADORA BASICA");
        // Añadir ActionListener a los botones
        botonSUMA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado = sumar(6, 5);
                JOptionPane.showMessageDialog(null, "Resultado de la suma: " + resultado);
            }
        });

        botonRESTA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado = restar(6, 5);
                JOptionPane.showMessageDialog(null, "Resultado de la resta: " + resultado);
            }
        });

        botonSALIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Añadir a paneles
        panelsuma.setLayout(new GridLayout(3, 2));
        panelsuma.add(TextoOpmas);
        panelsuma.add(TextoSuma);
        panelsuma.add(botonSUMA);

        panelresta.setLayout(new GridLayout(3, 2));
        panelresta.add(TextoOpmenos);
        panelresta.add(TextoResta);
        panelresta.add(botonRESTA);

        panelsalir.add(TextoSalir);
        panelsalir.add(botonSALIR);

        // Ventanas
        ventana.setSize(500, 500);
        ventana.add(panelsuma, BorderLayout.NORTH);
        ventana.add(panelresta, BorderLayout.CENTER);
        ventana.add(panelsalir, BorderLayout.SOUTH);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Función para sumar dos números
    private static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    // Función para restar dos números
    private static int restar(int num1, int num2) {
        return num1 - num2;
    }
}