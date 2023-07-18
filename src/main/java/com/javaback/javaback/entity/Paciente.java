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
public class Paciente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    //Atributos
    private Long id;
    private String nombre;
    private int cedula;
    private String apellido;
    private int edad;
    private String telefono;

    
    //Relaciones
    @ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medico;

    @OneToMany(mappedBy = "paciente")
    private List<Cita> citas;
    

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    //Constructor vacio
    public Paciente(){
    }

    //Constructor con parametros
    public Paciente(Long id, String nombre, int cedula, String apellido, int edad, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCedula() {
        return cedula;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getTelefono() {
        return telefono;
    }



    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
