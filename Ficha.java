/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author danig
 */
public class Ficha {
    
    private String NumerodeFicha;
    private String TipodePaciente;
    private Paciente paciente;

    public Ficha(String NumerodeFicha, String TipodePaciente, Paciente paciente) {
        this.NumerodeFicha = NumerodeFicha;
        this.TipodePaciente = TipodePaciente;
        this.paciente = paciente;
    }

    public String getNumerodeFicha() {
        return NumerodeFicha;
    }

    public void setNumerodeFicha(String NumerodeFicha) {
        this.NumerodeFicha = NumerodeFicha;
    }

    public String getTipodePaciente() {
        return TipodePaciente;
    }

    public void setTipodePaciente(String TipodePaciente) {
        this.TipodePaciente = TipodePaciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
