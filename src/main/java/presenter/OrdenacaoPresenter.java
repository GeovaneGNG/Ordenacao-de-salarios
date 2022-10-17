/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import business.LeitorArquivoTxt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.ValorFinal;
import ordenacao.BubbleSort;
import ordenacao.IMetodoOrdenacao;
import ordenacao.SelectionSort;
import view.OrdenacaoView;

/**
 *
 * @author Geovane
 */
public class OrdenacaoPresenter {
    OrdenacaoView view;
    //ValorFinal list = new ValorFinal(); CRIA UMA RRAY DISSO
    
    public OrdenacaoPresenter(){
        view = new OrdenacaoView();
        
         this.view.getBtnCarregarArquivo().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    abrir();
                } catch (InterruptedException ex) {
                    Logger.getLogger(OrdenacaoPresenter.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(OrdenacaoPresenter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        this.view.getBtnOrdenar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Object selecionado = view.getjComboBox1().getSelectedItem();
                if(selecionado.toString().equals("item1")){
                    if(view.getRbntCrescente().isSelected()){
                        ordenaBolha(0);
                    } else {
                        ordenaBolha(1);
                    }                   
                } else {
                    if(view.getRbntCrescente().isSelected()){
                        ordenaSelect(0);
                    } else {
                        ordenaSelect(1);
                    }  
                }
                //JlistOrdenado.setListData(ARRAYLIST.getValores);
                //view.getLblTempoRotulo().setText(ARRAYLIST.getTempoExecucao);
            }
        });    
               
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
    
    public void abrir() throws IOException, InterruptedException{
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas arquivos .txt", "txt");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(filtro);
        
        int resposta = fileChooser.showOpenDialog(null);
        if (resposta == JFileChooser.APPROVE_OPTION) {

            File arquivoSelecionado = fileChooser.getSelectedFile();
            LeitorArquivoTxt leitor = new LeitorArquivoTxt();
            //recebe o arraylist
            // this.ARRAYLIST = leitor.readFile(arquivoSelecionado.getAbsolutePath());
            leitor.readFile(arquivoSelecionado.getAbsolutePath());
            JList listaSemOrdem = view.getLstSemOrdem();
            //JListSemOrdem.setListData(ARRAYLIST.getValores);

        } else {
            System.out.println("Nenhum arquivo selecionado");
        }
    }
    
    public void ordenaBolha(int opt){
        IMetodoOrdenacao ordena = new BubbleSort();
        if(opt == 1){
            //this.arraylist = ordena.ordenarValoresCrescente(arraylist.getValores);
        } else {
            //this.arraylist = ordena.ordenarValoresDecrescente(arraylist.getValores);
        }
        
    }
    
    public void ordenaSelect(int opt){
        IMetodoOrdenacao ordena = new SelectionSort();
        if(opt == 1){
            //this.arraylist = ordena.ordenarValoresCrescente(arraylist.getValores);
        } else {
            //this.arraylist = ordena.ordenarValoresDecrescente(arraylist.getValores);
        }        
    }

}

