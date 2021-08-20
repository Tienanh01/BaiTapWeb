/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoteelement;

import java.util.Scanner;

/**
 *
 * @author ProTech
 */
public class gio {
    public static void main(String[] args) {
        Long hours ;
        Long minutes;
      
            Long seconds;
        Scanner sc = new Scanner(System.in);
        do {            
             seconds = sc.nextLong();
        } while (seconds <= 0L || seconds >= 4200000000L);
        if(seconds > 3600L){                 
            hours = (seconds/3600);
            minutes = (seconds - hours*3600)/60;
            System.out.println(hours*3600);
                 seconds = seconds - hours*3600 - minutes *60; 
                   

        }
        else if (seconds < 3600L && seconds >= 60L ) {
            hours = 0L;
            minutes = (seconds/60);
            seconds = seconds - minutes*60;
                  

        }
        else{
            hours = 0L;
            minutes = 0L;
            seconds = (long)seconds;
                   
        }
          System.out.println(hours +" gio "+minutes+" phut "+seconds+" giay");
    }
}
