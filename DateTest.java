/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author mk_no
 */
public class DateTest {
    public static void main(String[] args){
        Date d1 = new Date(9,9,2019);
        
        System.out.println(d1);
        d1.setDay(20);
        System.out.println(d1);
    }
    
}
