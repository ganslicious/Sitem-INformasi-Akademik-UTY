/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdpl;

/**
 *
 * @author ASUS
 */
public class MDPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Register rg = new Register();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
    }
    
}
