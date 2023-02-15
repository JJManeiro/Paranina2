/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin26;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Boletin26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacions o = new Operacions();
        ArrayList<Integer>lista = new ArrayList<>();
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces?"));
        for (int i=0;i<cant;i++){
            int n = Integer.parseInt(JOptionPane.showInputDialog("numero?"));
            o.engadir(n, lista);
        }
        o.amosar(lista);
        System.out.println("\nmin e max:");
        o.min(lista);
        o.max(lista);
        int c2 = Integer.parseInt(JOptionPane.showInputDialog("intentos?"));
        for (int i=0;i<c2;i++){
        int l = Integer.parseInt(JOptionPane.showInputDialog("que numero buscas?"));
        o.look(l, lista);
        }
        int c3 = Integer.parseInt(JOptionPane.showInputDialog("cantos queres sacar?"));
        for (int i=0;i<c3;i++){
        int d = Integer.parseInt(JOptionPane.showInputDialog("que numero?"));
        o.delete(d, lista);
        o.amosar(lista);
        System.out.print("\n");
        }
    }
    
}
