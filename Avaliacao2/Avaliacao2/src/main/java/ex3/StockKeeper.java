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

package ex3;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @author Willian Junior <willianjunior.c.f@gmail.com>
 * @date 01/04/2024
 * @brief Class StockKeeper
 */
public class StockKeeper {
    
    private String name;

    public StockKeeper(){
        
    }
    public StockKeeper(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void manageMovie(Movie movie, String name, String director, double price, int numberOfCopies){
    }
    
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
    }
    
}