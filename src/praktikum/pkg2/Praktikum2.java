/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg2;

/**
 *
 * @author GAMES
 */
public class Praktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i<=n; i ++){
            for (int j =0; j<=n;j++){
                System.out.print("@ ");
                if (i ==j ){
                    break; 
                    
                }
            }
            System.out.println();
        }
                
    }
    
}
