package Seguimiento.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_pedido")
public class EstadoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "estacion")
    private String estacion;

    @Column(name = "fecha_egreso")
    private java.sql.Timestamp fechaEgreso;

    @Column(name = "fecha_ingreso")
    private java.sql.Timestamp fechaIngreso;

    @Column(name = "nombre_estado", nullable = false)
    private String nombreEstado;

    @Column(name = "nro_pedido")
    private int nroPedido;

    @Column(name = "pc")
    private String pc;

    @Column(name = "tiempo_en_estacion")
    private String tiempoEnEstacion;

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public java.sql.Timestamp getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(java.sql.Timestamp fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public java.sql.Timestamp getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(java.sql.Timestamp fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getTiempoEnEstacion() {
        return tiempoEnEstacion;
    }

    public void setTiempoEnEstacion(String tiempoEnEstacion) {
        this.tiempoEnEstacion = tiempoEnEstacion;
    }
}
