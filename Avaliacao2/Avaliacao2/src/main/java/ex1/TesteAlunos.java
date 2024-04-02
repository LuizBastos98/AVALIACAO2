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

import java.util.Scanner;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @author Willian Junior<willianjunior.c.f@gmail.com
 * @date 01/04/2024
 * @brief Class TesteAlunos
 */
public class TesteAlunos {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        
    //Atribuição de notas para cada aluno.
    
        System.out.println("Informe as notas do primeiro aluno: ");
        //Atribuição das 4 notas ao aluno 1
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();
        Aluno aluno1 = new Aluno(n1, n2, n3, n4);
        
        System.out.println("Informe as notas do segundo aluno: ");
        
        //Atribuição das 4 notas ao aluno 2
        
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        n3 = scanner.nextDouble();
        n4 = scanner.nextDouble();
        Aluno aluno2 = new Aluno(n1, n2, n3, n4);
        
        System.out.println("Informe as notas do terceiro aluno: ");
        
        //Atribuição das 4 notas ao aluno
        
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        n3 = scanner.nextDouble();
        n4 = scanner.nextDouble();
        Aluno aluno3 = new Aluno(n1, n2, n3, n4);
        
        //Cálculo da média dos 3 alunos.
        
        System.out.println("Média geral dos 3 alunos: " + Aluno.mediaTotal());
        
        scanner.close();
    }
}