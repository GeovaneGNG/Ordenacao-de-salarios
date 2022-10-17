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
public interface IMetodoOrdenacao {
    public ValorFinal ordenarValoresCrescente (List<Double> valores);
    public ValorFinal ordenarValoresDecrescente (List<Double> valores);
}
