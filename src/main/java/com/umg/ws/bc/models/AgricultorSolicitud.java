/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.ws.bc.models;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Elio Raymundo
 */

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "solicitud", schema = "db_agricultor_ws")
public class AgricultorSolicitud {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_solicitud")
    private UUID idSolicitud;
    
    @Column(name = "placa")
    private String placa;
    
    @Column(name = "licencia_piloto")
    private String licenciaPiloto;
    
    @Column(name = "parcialidad")
    private String parcialidad;
    
    @Column(name = "descripcion_pedido")
    private String descripcionPedido;
    
    @Column(name = "estado")
    private int estado;
    
    @Column(name = "usuario_adiciono")
    private String usuarioAdiciono;
    
    @Column(name = "fecha_adiciono")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaAdiciono;
    
    @Column(name = "usuario_modifico")
    private String usuarioModifico;
    
    @Column(name = "fecha_modifico")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaModifico;

    public AgricultorSolicitud(String placa, String licenciaPiloto, String parcialidad, String descripcionPedido, int estado, String usuarioAdiciono, Date fechaAdiciono, String usuarioModifico, Date fechaModifico) {
        this.placa = placa;
        this.licenciaPiloto = licenciaPiloto;
        this.parcialidad = parcialidad;
        this.descripcionPedido = descripcionPedido;
        this.estado = estado;
        this.usuarioAdiciono = usuarioAdiciono;
        this.fechaAdiciono = fechaAdiciono;
        this.usuarioModifico = usuarioModifico;
        this.fechaModifico = fechaModifico;
    }
    
    
}
