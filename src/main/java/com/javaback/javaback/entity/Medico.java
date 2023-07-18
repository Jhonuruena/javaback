package com.javaback.javaback.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;



@Entity
public class Medico {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    //Atributos

    private Long id;
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    private String nombre;
    private String apellido;
    private String consultorio;
    private String correo;

    
    //Relaciones
    @OneToMany(mappedBy = "medico")
    private List<Paciente> pacientes;
    

    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad;
    
    
    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;    
    
    //Constructor vacio

    public Medico(){
    }

    //Constructor con parametros

    public Medico(Long id, String nombre, String apellido, String consultorio, String correo){
        this.id = id;
        this.nombre= nombre;
        this.apellido= apellido;
        this.consultorio = consultorio;
        this.correo = correo;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getConsultorio() {
        return consultorio;
    }
    public String getCorreo() {
        return correo;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
       
}
