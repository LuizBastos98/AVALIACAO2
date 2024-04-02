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
import java.util.Scanner;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @author Willian Junior<willianjunior.c.f@gmail.com
 * @date 01/04/2024
 * @brief Class Teste
 */
public class Teste {
public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        Produto menu = new Produto();
        
        menu.setValor_expresso(0.75);
        menu.setValor_capuccino(menu.qtd_capuccino);
        menu.setValor_leite_com_cafe(1.25);
        menu.setValor_pao_de_queijo(menu.qtd_pao_de_queijo);
        menu.setValor_pao_com_mortandela(2.0);
        menu.setValor_bolo(1.5);
        
        for(int m = 0; m != 10;){
            menu.Menu();
            menu.Contabilizar(sc.nextInt());
            if(menu.opcao < 7){
                for(;menu.opcao != 9;)
                menu.MenuEx();
                menu.Exclusao(sc.nextInt());
            }
            if(menu.opcao == 8){
                menu.MenuPag();
                menu.MenuPag2();
                menu.Pagamento(sc.nextDouble());
            }
        }
        
    }
}