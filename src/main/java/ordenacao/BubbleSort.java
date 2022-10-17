/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

import java.util.List;
import model.ValorFinal;

/**
 *
 * @author Geovane
 */
public class BubbleSort implements IMetodoOrdenacao{

    @Override
    public ValorFinal ordenarValoresCrescente (List<Double> valores) {
        long tempoInicial = System.currentTimeMillis();
        double aux;
        for (int i = 0; i < valores.size(); i++) {
            for (int j = i + 1; j < valores.size(); j++) {
                if (valores.get(i) > valores.get(j)) {
                    aux = valores.get(j);
                    valores.set(j, valores.get(i));
                    valores.set(i, aux);
                }
            }
        }
        long tempoFinal = System.currentTimeMillis();
        long tempoExecucao = (tempoFinal - tempoInicial);
        
        return new ValorFinal(valores, tempoExecucao);
    }

    @Override
    public ValorFinal ordenarValoresDecrescente (List<Double> valores) {
        long tempoInicial = System.currentTimeMillis();
        double aux;
        for (int i = 1; i < valores.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (valores.get(i) > valores.get(j)) {
                    aux = valores.get(i);
                    valores.set(i, valores.get(j));
                    valores.set(j, aux);
                }
            }
        }
        long tempoFinal = System.currentTimeMillis();
        long tempoExecucao = (tempoFinal - tempoInicial);
        
        
        return new ValorFinal(valores, tempoExecucao);
    }

    
}
