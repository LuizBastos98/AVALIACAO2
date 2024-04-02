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

package ex2;
/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @author Willian Junior<willianjunior.c.f@gmail.com
 * @date 01/04/2024
 * @brief Class NUMEROSECRETO
 */

public class NUMEROSECRETO {

     //Variável de armazenar número aleatório
    private double ALEATORIO = -1;
   //variável de armazenar tentativas do usuário
    private int ADIVINHAR;
    //Método de definir o número aleatório
    public void setALEATORIO(int ALEATORIO) {
        this.ALEATORIO = ALEATORIO;
    }
    //Método de obter número aleatório
    public double getALEATORIO() {
        return ALEATORIO;
    }
    //Método de definir tentativa do usuário
    public void setADIVINHAR(int ADIVINHAR) {
        this.ADIVINHAR = ADIVINHAR;
    }
    //Método para obter a tentativa do usuário
    public int getADIVINHAR() {
        return ADIVINHAR;
    }
   //Métado para sortear um número aleatório
    public void SORTEAR(double ALEATORIO){
        this.ALEATORIO = ALEATORIO;
    }
   //Método para verificar a tentativa do usuário
    public int ADIVINHAR(int ADIVINHAR){
        this.ADIVINHAR = ADIVINHAR;
        if (ALEATORIO == 0){
            return -2;
        } else if(ADIVINHAR < ALEATORIO) {
            return -1;
        } else if(ADIVINHAR == ALEATORIO) {
            return 0;
        } else if (ADIVINHAR > ALEATORIO) {
            return 1;
        } else {
            return -2;
        }
        }
   //M[etodo para gerar uma representação em String do Objeto
    public String toString(){
        if (ALEATORIO == 0){
            return "Pedimos desculpa mas o numero sorteado ainda não foi lancado";
        } else if(ADIVINHAR < ALEATORIO) {
            return "Esta abaixo das expectativas";
        } else if(ADIVINHAR == ALEATORIO) {
            return "Parabens, você ganhou o sorteio!!!";
        } else if (ADIVINHAR > ALEATORIO) {
            return "Você esta se superando";
        } else {
                return "Invalido";
        }
    }
}
