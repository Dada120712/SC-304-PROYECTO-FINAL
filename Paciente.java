/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author danig
 */
public class Paciente {
    
    private String NumeroDeCedula;
    private String NombredelPaciente;

    public Paciente(String NumeroDeCedula, String NombredelPaciente) {
        this.NumeroDeCedula = NumeroDeCedula;
        this.NombredelPaciente = NombredelPaciente;
    }

    public String getNumeroDeCedula() {
        return NumeroDeCedula;
    }

    public void setNumeroDeCedula(String NumeroDeCedula) {
        this.NumeroDeCedula = NumeroDeCedula;
    }

    public String getNombredelPaciente() {
        return NombredelPaciente;
    }

    public void setNombredelPaciente(String NombredelPaciente) {
        this.NombredelPaciente = NombredelPaciente;
    }
    
    
    
    
}
