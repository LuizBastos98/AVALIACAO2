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

package ex1;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @author Willian Junior<willianjunior.c.f@gmail.com
 * @date 01/04/2024
 * @brief Class Aluno
 */
public class Aluno {
    //Definição de variáveis e seus valores.
    private static int numeroDeAlunos = 0;
    
    private static double somaDeMedias = 0;
    
    private double n1, n2, n3, n4;
    
    private double media;
    
    public Aluno(double n1, double n2, double n3, double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        calcularMedia();
        numeroDeAlunos++;
    }
    
    // Funções relacionadas ao cálculo da Média/Média total:
    
    private void calcularMedia() {
        this.media = (this.n1 + 2*this.n2 + 3*this.n3 + 4*this.n4) / 10;
        somaDeMedias += this.media;
    }
    
    public static double mediaTotal() {
        if (numeroDeAlunos == 0) {
            return 0;
        }
        return somaDeMedias / numeroDeAlunos;
    }
    
    public static int compararMedia(Aluno aluno1, Aluno aluno2) {
        if (aluno1.media < aluno2.media) {
            return -1;
        } else if (aluno1.media == aluno2.media) {
            return 0;
        } else {
            return 1;
        }
    }
    
}