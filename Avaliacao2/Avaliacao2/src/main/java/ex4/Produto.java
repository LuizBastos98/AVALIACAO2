/*
 * Copyright (C) 2024 Luiz Bastos <luizfelipebastossantana@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ex4;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @author Willian Junior<willianjunior.c.f@gmail.com
 * @date 01/04/2024
 * @brief Class Produto
 */
public class Produto {
public int opcao;
    
    public int qtd_expresso;
    public int qtd_capuccino;
    public int qtd_leite_com_cafe;
    public int qtd_pao_de_queijo;
    public int qtd_pao_com_mortandela;
    public int qtd_bolo;
    
    private double valor_expresso;
    private double valor_capuccino;
    private double valor_leite_com_cafe;
    private double valor_pao_de_queijo;
    private double valor_pao_com_mortandela;
    private double valor_bolo;
    private double Conta;

    public void setValor_expresso(double valor_expresso) {
        this.valor_expresso = valor_expresso;
    }

    public void setValor_capuccino(double valor_capuccino) {
        this.valor_capuccino = valor_capuccino;
    }

    public void setValor_leite_com_cafe(double valor_leite_com_cafe) {
        this.valor_leite_com_cafe = valor_leite_com_cafe;
    }

    public void setValor_pao_de_queijo(double valor_pao_de_queijo) {
        this.valor_pao_de_queijo = valor_pao_de_queijo;
    }

    public void setValor_pao_com_mortandela(double valor_pao_com_mortandela) {
        this.valor_pao_com_mortandela = valor_pao_com_mortandela;
    }

    public void setValor_bolo(double valor_bolo) {
        this.valor_bolo = valor_bolo;
    }
    
    public double getValor_expresso() {
        return valor_expresso;
    }

    public double getValor_capuccino() {
        return valor_capuccino;
    }

    public double getValor_leite_com_cafe() {
        return valor_leite_com_cafe;
    }

    public double getValor_pao_de_queijo() {
        return valor_pao_de_queijo;
    }

    public double getValor_pao_com_mortandela() {
        return valor_pao_com_mortandela;
    }

    public double getValor_bolo() {
        return valor_bolo;
    }
    
    public void Contabilizar(int opcao){
        if(opcao == 1){
        this.qtd_expresso += 1;
        } else if(opcao == 2){
        this.qtd_capuccino += 1;
        } else if(opcao == 3){
        this.qtd_leite_com_cafe += 1;
        } else if(opcao == 4){
        this.qtd_pao_de_queijo += 1;
        } else if(opcao == 5){
        this.qtd_pao_com_mortandela += 1;
        } else if(opcao == 6){
        this.qtd_bolo += 1;
        } else if(opcao >= 7){
            this.opcao = opcao;
        }
    }
    
    public void Exclusao(int opcao){
        if(opcao == 1){
        this.qtd_expresso -= 1;
        } else if(opcao == 2){
        this.qtd_capuccino -= 1;
        } else if(opcao == 3){
        this.qtd_leite_com_cafe -= 1;
        } else if(opcao == 4){
        this.qtd_pao_de_queijo -= 1;
        } else if(opcao == 5){
        this.qtd_pao_com_mortandela -= 1;
        } else if(opcao == 6){
        this.qtd_bolo -= 1;
        } else if(opcao >= 7){
            this.opcao = opcao;
        }
    }

    public void setConta() {
        this.Conta = (qtd_expresso * getValor_expresso() + (qtd_capuccino * getValor_capuccino())
                + (qtd_leite_com_cafe * getValor_leite_com_cafe()) + (qtd_pao_de_queijo * getValor_pao_de_queijo()) 
                + (qtd_pao_com_mortandela * getValor_pao_com_mortandela()) + (qtd_bolo * getValor_bolo()));
    }

    public double getConta() {
        return Conta;
    }
    
    
    
    public boolean Pagamento(int Pag){
        if(Pag == getConta()){
            return true;
        } else if(Pag < getConta()){
            return false;
        } else {
            return false;
        }
    }
   
    
    public String Menu(){
        return "Forneca uma opcao: \n" 
                + "1 - Cafe expresso \n"
                + "2 - Capuccino \n"
                + "3 - Leite com cafe \n"
                + "4 - Pao de queijo \n"
                + "5 - Pao com mortandela \n"
                + "6 - Bolo \n"
                + "7 - Excluir compra \n"
                + "8 - Pagamento \n";
    }
    
    public String MenuEx(){
        return "Qual deseja excluir: \n" 
                + "1 - Cafe expresso \n"
                + "2 - Capuccino \n"
                + "3 - Leite com cafe \n"
                + "4 - Pao de queijo \n"
                + "5 - Pao com mortandela \n"
                + "6 - Bolo \n"
                + "8 - Pagamento \n"
                + "9 - Voltar \n";
    }
    
    public String MenuPag(){
        return "Como você deseja proseguir com o pagamento: \n" 
                + "1 - Pagamento Total \n"
                + "2 - Pagamento Parcial \n";
    }
    
    public String MenuPag2(){
        return "Conta: " 
                + getConta()
                + "\n Por favor digite o valor a ser pago: ";
    }
    
}