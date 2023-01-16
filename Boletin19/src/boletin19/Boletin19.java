/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin19;

/**
 *
 * @author dam1
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa P = new Persoa();
        P.Cantar();
        System.out.println("O canario e o galo:");
        CanarioYGalo CG = new CanarioYGalo();
        CG.CyG();
        System.out.println("O canario e o tenor:");
        CanarioYTenor CT = new CanarioYTenor();
        CT.CyT();
    }
    
}
