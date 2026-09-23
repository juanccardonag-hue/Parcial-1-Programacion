package co.edu.uniquindio;
import java.time.LocalDate;

public class EmpresaDevplus {
    private String nit;
    private String nombreComercial;
    private String direccion;
    private String telefono;
    private String paginaWeb;

    private Cliente[] listClientes;
    private Desarrollador[] listDesarrolladores;
    private Proyecto[] listProyectos;
    private ServiciosAdicionales[] listServicios;


    public EmpresaDevplus(String nit, String nombreComercial, String direccion, String telefono, String paginaWeb) {
        this.nit = nit;
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;

        this.listClientes = new Cliente[10];
        this.listDesarrolladores = new Desarrollador[10];
        this.listProyectos = new Proyecto[10];
        this.listServicios = new ServiciosAdicionales[10];
    }

    public boolean registarCliente(Cliente nuevoCliente){
        for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i] == null) {
                listClientes[i] = nuevoCliente;
                return true;
            }
        }
        return false;
    }

    public boolean registarDesarrollador(Desarrollador nuevoDesarrollador){
        for (int i = 0; i < listDesarrolladores.length; i++) {
            if (listDesarrolladores[i] == null) {
                listDesarrolladores[i] = nuevoDesarrollador;
                return true;
            }
        }
        return false;
    }

    public boolean registarProyecto(Proyecto nuevoProyecto){
        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] == null) {
                listProyectos[i] = nuevoProyecto;
                return true;
            }
        }
        return false;
    }

    public boolean registarServicioAdicional(ServiciosAdicionales nuevoServicioAdicional){
        for (int i = 0; i < listServicios.length; i++) {
            if (listServicios[i] == null) {
                listServicios[i] = nuevoServicioAdicional;
                return true;
            }
        }
        return false;
    }

    public Cliente consultarTelefonoCliente(String buscarTelefono){
        for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i] != null && listClientes[i].getTelefono().equals(buscarTelefono)) {
                return listClientes[i];
            }
        }
        return null;
    }

    public boolean esPerfecto(String telefono){
        int numero = Integer.parseInt(telefono);
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        if (suma == numero) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularIngresoFecha(LocalDate fechaConsulta){
        double ingresoTotal= 0;
        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] != null && listProyectos[i].getFechaSolicitud().equals(fechaConsulta)) {
                ingresoTotal += listProyectos[i].calcularTotal();
            }
        }
        return ingresoTotal;
    }

    public String mostrarProyecto(){
        String msj = "Lista de proyectos: " + "\n";
        boolean hayProyectos = false;

        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] != null) {
                hayProyectos=true;
                msj +=  "\n ✩Id: " +  listProyectos[i].getId() +
                        "\n ✩Estado: " + listProyectos[i].getEstado() +
                        "\n ✩Fecha solicitud: " +  listProyectos[i].getFechaSolicitud() +
                        "\n ✩Total: $" + listProyectos[i].calcularTotal();

            }
        }
        if (hayProyectos) {
            return msj;
        } else {
            return "Aun no hay proyectos registrados";
        }
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
}
