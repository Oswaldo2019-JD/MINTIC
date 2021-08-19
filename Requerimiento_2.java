package Modelo.vo;

public class Requerimiento_2 {
// Su código    

    public String Nombre;
    public String Primer_Apellido;
    public String Ciudad_Residencia;
    public String Cargo;
    public Integer Salario;


    public Requerimiento_2() {
    }


    public Requerimiento_2(String nombre, String primer_Apellido, String ciudad_Residencia, String cargo, Integer salario) {
        Nombre = nombre;
        Primer_Apellido = primer_Apellido;
        Ciudad_Residencia = ciudad_Residencia;
        Cargo = cargo;
        Salario = salario;
    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }
    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }
    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }
    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public Integer getSalario() {
        return Salario;
    }
    public void setSalario(Integer salario) {
        Salario = salario;
    }

}





