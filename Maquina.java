/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina_norma;

import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class Maquina {

    public ArrayList<Integer> regs;
    public ArrayList<Integer> sinais;
    public ArrayList<Integer> divs;

    public Maquina() {
        this.regs = new ArrayList();
        this.sinais = new ArrayList();
        this.divs = new ArrayList();

        addReg();
        addReg();
        addReg();
        addReg();
    }

    public void addReg() {
        this.regs.add(0);
        this.sinais.add(0);
        this.divs.add(1);
    }
    private int zera(int aux){
        while (aux != 0) {
            aux = aux - 1;
        }
        return aux;
    }
    
    public void zerar(int reg) {
        int aux = this.regs.get(reg); // Pega o valor do registrador do conjunto de registadores
        // Processamento no registrador
        aux = zera(aux);
        this.regs.set(reg, aux); 
        
        // Normaliza o divisor
        aux = this.divs.get(reg);
        aux = zera(aux);
        aux = aux +1;
        this.divs.set(reg, aux);
        
        //Verifica o sinal.
        if (this.sinais.get(reg) == 1) {
            this.sinais.set(reg, this.sinais.get(reg) - 1);
        }
        
    }
    
    public void atribuir(int reg, int valor, int div){
        this.zerar(reg);
        
    }
}
