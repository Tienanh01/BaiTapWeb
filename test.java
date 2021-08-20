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
public class test {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        do {            
            a = sc.nextInt();
        } while (a < 0 && a>1000);
        if(a%2 == 0){
            System.out.println(a+" la so chan");
        }
        else{
            System.out.println(a+" la so le");
        }
    }
}
