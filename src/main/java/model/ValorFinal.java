/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Geovane
 */
public class ValorFinal {
    public List<Double> valores;
    public long tempoExecucao;    


    public ValorFinal(List<Double> valores, long tempoExecucao) {
        this.valores = valores;
        this.tempoExecucao = tempoExecucao;
    }

    public List<Double> getValores() {
        return valores;
    }

    public long getTempoExecucao() {
        return tempoExecucao;
    }
    
    @Override
    public String toString() {
        return ("%.3f ms%n" + tempoExecucao );
    }    
}
