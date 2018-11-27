/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingChallenges;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class HotelOccupancy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int floors, rooms, occupied, 
                totalRooms = 0, totalOccupied = 0;
        do
        {
            System.out.print("Enter the number of floors in the hotel: ");
            floors = keyboard.nextInt();
        } while (floors < 1);
        
        for(int floor = 1; floor <= floors; floor++)
        {
            do
            {
                System.out.print("Enter the number of rooms on floor " 
                        + floor + ": ");
                rooms = keyboard.nextInt();            
            } while(rooms < 10);
            
            totalRooms += rooms;
            do
            {
                System.out.print("Out of " + rooms + " on floor " + floor + ", "
                        + "how many rooms are occupied? ");
                occupied = keyboard.nextInt();
                
            } while(occupied > rooms);
            totalOccupied += occupied;
        }
        float occupancyRate = (float)totalOccupied/totalRooms;
        System.out.println("\nThe hotel has:\n"
                + totalRooms + " rooms total, \n"
                + totalOccupied + " occupied rooms,\n"
                + (totalRooms - totalOccupied) + " vacancies,\n"
                + "and a " + occupancyRate + " occupancy rate.");
        
    }
    
}
