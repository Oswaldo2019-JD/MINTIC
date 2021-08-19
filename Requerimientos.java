package Vista;

import java.sql.SQLException;
import java.util.ArrayList;

import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class Requerimientos {

    public String[][] mostrar1() throws SQLException{
        ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento1();
        String matriz[][] = new String [lista.size()][5];
        for (int i = 0; i < lista.size(); i++){
            matriz[i][0] = String.valueOf(lista.get(i).getCiudad());
            matriz[i][1] = String.valueOf(lista.get(i).getAcabados());
            matriz[i][2] = String.valueOf(lista.get(i).getClasificacion());
            matriz[i][3] = String.valueOf(lista.get(i).getBanco_Vinculado());
            matriz[i][4] = String.valueOf(lista.get(i).getConstructora());
            }
            return matriz;
    }

    public String[][] mostrar2() throws SQLException{
        ArrayList<Requerimiento_2> lista = new ArrayList<Requerimiento_2>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento2();
        String matriz[][] = new String [lista.size()][5];
        for (int i = 0; i < lista.size(); i++){
            matriz[i][0] = String.valueOf(lista.get(i).getNombre());
            matriz[i][1] = String.valueOf(lista.get(i).getPrimer_Apellido());
            matriz[i][2] = String.valueOf(lista.get(i).getCiudad_Residencia());
            matriz[i][3] = String.valueOf(lista.get(i).getCargo());
            matriz[i][4] = String.valueOf(lista.get(i).getSalario());
        }
        return matriz;
    } 
    public String[][] mostrar3() throws SQLException{
        ArrayList<Requerimiento_3> lista = new ArrayList<Requerimiento_3>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento3();
        String matriz[][] = new String [lista.size()][3];
        for (int i = 0; i < lista.size(); i++){
            matriz[i][0] = String.valueOf(lista.get(i).getProveedor());
            matriz[i][1] = String.valueOf(lista.get(i).getPagado());
            matriz[i][2] = String.valueOf(lista.get(i).getConstructora());
            
        }
        return matriz;
    }
    
}
