package ordenacao;

import java.util.List;
import model.ValorFinal;

public class SelectionSort implements IMetodoOrdenacao {

    @Override
    public ValorFinal ordenarValoresCrescente (List<Double> valores) {
        long tempoInicial = System.currentTimeMillis();
        int posicao_menor;
        double aux;
        for (int i = 0; i < valores.size(); i++) {
            posicao_menor = i;
            for (int j = i + 1; j < valores.size(); j++) {
                if (valores.get(j) < valores.get(posicao_menor)) {
                    posicao_menor = j;
                }
            }
            aux = valores.get(posicao_menor);
            valores.set(posicao_menor, valores.get(i));
            valores.set(i, aux);
        }
        long tempoFinal = System.currentTimeMillis();
        long tempoExecucao = (tempoFinal - tempoInicial);
        
        return new ValorFinal(valores, tempoExecucao);
    }

    @Override
    public ValorFinal ordenarValoresDecrescente(List<Double> valores) {
        long tempoInicial = System.currentTimeMillis();
        int posicao_menor;
        double aux;
        for (int i = valores.size(); i > 0; i--) {
            posicao_menor = i;
            for (int j = i - 1; j >= 0; j--) {
                if (valores.get(j) < valores.get(posicao_menor)) {
                    posicao_menor = j;
                }
            }
            aux = valores.get(posicao_menor);
            valores.set(posicao_menor, valores.get(i));
            valores.set(i, aux);
        }
        long tempoFinal = System.currentTimeMillis();
        long tempoExecucao = (tempoFinal - tempoInicial);
        
        return new ValorFinal(valores, tempoExecucao);
    }

}