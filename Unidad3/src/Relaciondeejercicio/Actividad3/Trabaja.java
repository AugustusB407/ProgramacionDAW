
public class Trabaja {
    //Atributos
    private Empleado empleado;
    private Sucursal sucursal;
    private String horario;
    private String dia;

    //Constructores
    public Trabaja(Empleado empleado, Sucursal sucursal, String horario, String dia) {
        this.empleado = empleado;
        this.sucursal = sucursal;
        this.horario = horario;
        this.dia = dia;
    }

    //Getters y Setters
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Trabaja [empleado=" + empleado + ", sucursal=" + sucursal + ", horario=" + horario + ", dia=" + dia + "]";
    }

}
