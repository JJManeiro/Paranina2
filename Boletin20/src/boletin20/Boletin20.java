/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin20;

/**
 *
 * @author dam1
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Gato:");
        Gato G = new Gato();
        G.Caminar();
        G.Nadar();
        System.out.println("Papagaio:");
        Papagaio P = new Papagaio();
        P.Caminar();
        P.Voar();
        System.out.println("Avestruz:");
        Avestruz A = new Avestruz();
        A.Caminar();
        System.out.println("Morcego:");
        Morcego M = new Morcego();
        M.Caminar();
        M.Voar();
        System.out.println("Tigre:");
        Tigre T = new Tigre();
        T.Caminar();
        T.Nadar();
    }
    
}
