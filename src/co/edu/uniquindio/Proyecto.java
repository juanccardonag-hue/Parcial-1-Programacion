package co.edu.uniquindio;

import java.time.LocalDate;

public class Proyecto {
    private String id;
    private LocalDate fechaSolicitud;
    private LocalDate fechaInicio;
    private LocalDate fechaEntrega;
    private  String estado;
    private  String metodoPago;
    private double valorTotal;
    private int diasDesarrollo;
    private double descuentoClienteFrecuente;

    public Proyecto(String id, LocalDate fechaSolicitud, LocalDate fechaInicio,
                    LocalDate fechaEntrega, String estado, String metodoPago, double valorTotal, int diasDesarrollo, double descuentoClienteFrecuente) {
        this.id = id;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;
        this.diasDesarrollo = diasDesarrollo;
        this.descuentoClienteFrecuente = descuentoClienteFrecuente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getDiasDesarrollo() {
        return diasDesarrollo;
    }

    public void setDiasDesarrollo(int diasDesarrollo) {
        this.diasDesarrollo = diasDesarrollo;
    }

    public double getDescuentoClienteFrecuente() {
        return descuentoClienteFrecuente;
    }

    public void setDescuentoClienteFrecuente(double descuentoClienteFrecuente) {
        this.descuentoClienteFrecuente = descuentoClienteFrecuente;
    }
}
