/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mybean;

import javax.ejb.Stateless;

/**
 *
 * @author LENOVO
 */
@Stateless
public class f2cBean implements f2cBeanRemote {

    @Override
    public double f2c(double far) {
        return (5.0/9)*(far-32);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
