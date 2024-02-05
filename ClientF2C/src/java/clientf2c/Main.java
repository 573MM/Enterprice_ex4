/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientf2c;

import java.util.Scanner;
import javax.ejb.EJB;
import mybean.f2cBeanRemote;

/**
 *
 * @author LENOVO
 */
public class Main {

    @EJB
    private static f2cBeanRemote f2cBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("Enter degree in Fahrenheit:");
        Scanner sc = new Scanner(System.in);
        double far = sc.nextDouble();
        System.out.print("Fahrenheit = " + f2cBean.f2c(30) + " Celsius");
        
    }
    
}
