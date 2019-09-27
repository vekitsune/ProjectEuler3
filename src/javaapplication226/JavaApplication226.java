/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication226;

import javax.swing.JOptionPane;

/**
 *
 * @author Verosffy
 */
public class JavaApplication226 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long szorzat = (Long.parseLong(JOptionPane.showInputDialog("Add meg azt számot, aminek a legnagyobb primtényezőjét keresed!")));
        long maxoszto = szorzat;
        long largest = 1;
        for (long i = 1; i <= maxoszto; i++) {
            if (szorzat % i == 0) {
                largest = i;
                maxoszto = maxoszto / i;
            };

        }
        JOptionPane.showMessageDialog(null, "A "+szorzat+" legnagyobb osztoja a "+largest);

    }

}
