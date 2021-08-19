package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_2;

public class Requerimiento2 extends JFrame {
    public Requerimiento2() throws SQLException {
        initUI();
    }
    private void initUI() throws SQLException {

        setLayout(new BorderLayout());
        String[]nombres = {"Nombre", "Primer_Apellido", "Ciudad_Residencia", "Cargo", "Salario"};
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane panel = new JScrollPane(tabla);
        add (panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public String[][] mostrar() throws SQLException{
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        ArrayList<Requerimiento_2> lista2 = new ArrayList<Requerimiento_2>();
        lista2 = controlador.consultarRequerimiento2();
        String matriz[][] = new String [lista2.size()][5];
        for (int i = 0; i < lista2.size(); i++){
            matriz[i][0] = String.valueOf(lista2.get(i).getNombre());
            matriz[i][1] = String.valueOf(lista2.get(i).getPrimer_Apellido());
            matriz[i][2] = String.valueOf(lista2.get(i).getCiudad_Residencia());
            matriz[i][3] = String.valueOf(lista2.get(i).getCargo());
            matriz[i][4] = String.valueOf(lista2.get(i).getSalario());
        }
        return matriz;
    }
}

    
