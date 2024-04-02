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
import java.util.Scanner;
/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @author Willian Junior<willianjunior.c.f@gmail.com
 * @date 01/04/2024
 * @brief Class JOGODONUMEROSECRETO
 */
public class JOGODONUMEROSECRETO {

    public static void main (String[] args){
    
        Scanner sc = new Scanner(System.in);
        NUMEROSECRETO numerosecreto = new NUMEROSECRETO();
       
        numerosecreto.SORTEAR(Math.random(0 < random < 100));
        System.out.println("Tente adivnihar o numero sorteiado");
        for(int menu = 0; menu != numerosecreto.getALEATORIO();){
            numerosecreto.ADIVINHAR(sc.nextInt());
            numerosecreto.toString();
        }
       
    }
}
