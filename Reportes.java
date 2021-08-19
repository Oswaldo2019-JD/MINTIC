package Vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Image;


public class Reportes extends Requerimientos {
    JFrame frame;
    JTable tabla1, tabla2, tabla3 = new JTable();
    JButton send1, send2, send3;
    Image imagen;

public Reportes() throws SQLException{

    initReportes();

}
   
private void initReportes() throws SQLException{
    frame = new JFrame("INFORMES DE GESTIÓN DE LA EMPRESA");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 700);
    frame.setResizable(false);

    // Creación de MenuBar

    JMenuBar mb = new JMenuBar();
    mb.setAlignmentY(Component.LEFT_ALIGNMENT);
    JMenu m1 = new JMenu("REPORTES");
    JMenu m2 = new JMenu("ACERCA DE");
    JMenu m3 = new JMenu("AYUDA");

    // Adición de JMenu a JMenuBar
    mb.add(m1);
    mb.add(m2);
    mb.add(m3);

    // Creación de los JMenu Items
    JMenuItem Mit1 = new JMenuItem("Reporte 1");
    JMenuItem Mit2 = new JMenuItem("Reporte 2");
    JMenuItem Mit3 = new JMenuItem("Reporte 3");
    JMenuItem Mit4 = new JMenuItem("Reportes realizados por OQM");
    JMenuItem Mit5 = new JMenuItem("Salir");

    // Adición de JMenuItem a JMenu
    m1.add(Mit1);
    m1.add(Mit2);
    m1.add(Mit3);
    m2.add(Mit4);
    m3.add(Mit5);

    // Construir el objeto JPanel para albergar la botonera
    JPanel Botonera = new JPanel();

    // Este JPanel va a tener un Layout FlowLayout y sus componntes están centrados
    Botonera.setLayout(new FlowLayout(FlowLayout.CENTER));

    // Se crean etiquetas para dar espacios entre los botones
    JLabel espacio1 = new JLabel("          ");
    JLabel espacio2 = new JLabel("          ");

    // Construir botones
    JButton send1 = new JButton("REPORTE 1");
    JButton send2 = new JButton("REPORTE 2");
    JButton send3 = new JButton("REPORTE 3");

    // Adicionar botones al Panel
    Botonera.add(send1);
    Botonera.add(espacio1);
    Botonera.add(send2);
    Botonera.add(espacio2);
    Botonera.add(send3);

    // Se crean las tablas y las cabeceras

    // Primer Reporte
    String[] nombres1 = {"Ciudad", "Acabados", "Clasificación", "Banco_Vinculado", "Constructora"} ;
    tabla1 = new JTable(mostrar1(), nombres1);

    // Segundo Reporte
    String[] nombres2 = {"Nombre", "Primer_Apellido", "Ciudad_Residencia", "Cargo", "Salario"} ;
    tabla2 = new JTable(mostrar2(), nombres2);

    // Tercer Reporte
    String[] nombres3 = {"Proveedor", "Pagado", "Constructora"} ;
    tabla3 = new JTable(mostrar3(), nombres3);

    //Crear el JScrollpane que es el que alberga las tablas
    JScrollPane Panel = new JScrollPane();

    // Agregar los paneles al panel BorderLayout que será el principal

    frame.getContentPane().add(BorderLayout.SOUTH, Botonera);
    frame.getContentPane().add(Panel, BorderLayout.CENTER);
    frame.getContentPane().add(BorderLayout.NORTH, mb);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);

    // Crear los eventos actionListener y adicionarlos al boton y a los MenuItem
    ActionListener reporte1 = new ActionListener(){
        // @Override
        public void actionPerformed(ActionEvent ae){
            JScrollPane Panel = new JScrollPane();
            Panel.add(tabla1);
            Panel.setViewportView(tabla1);
            
        }
    };

    send1.addActionListener(reporte1);
    Mit1.addActionListener(reporte1);

    
    ActionListener reporte2 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            JScrollPane Panel = new JScrollPane();
            Panel.add(tabla2);
            Panel.setViewportView(tabla2);
        }

    };

    send2.addActionListener(reporte2);
    Mit2.addActionListener(reporte2);


    ActionListener reporte3 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            JScrollPane Panel = new JScrollPane();
            Panel.add(tabla3);
            Panel.setViewportView(tabla3);
        }
        
    };
    
    send3.addActionListener(reporte3);
    Mit3.addActionListener(reporte3);

    // Evento ActionListener para Salir

    ActionListener salir = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            // Con esta linea de codigo se cierra la aplicación
            System.exit(0);

        }
    };

    Mit5.addActionListener(salir);

    }
}


