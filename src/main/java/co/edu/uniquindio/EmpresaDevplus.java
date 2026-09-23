package co.edu.uniquindio;

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
        this.listClientes=new Cliente[10];
        this.listDesarrolladores= new Desarrollador[10];
        this.listProyectos= new Proyecto[10];
        this.listServicios= new ServiciosAdicionales[10];


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
    public Cliente[] getListClientes() {
        return listClientes;
    }

    public Desarrollador[] getListDesarrolladores() {
        return listDesarrolladores;
    }

    public Proyecto[] getListProyectos() {
        return listProyectos;
    }

    public ServiciosAdicionales[] getListServicios() {
        return listServicios;
    }
}
