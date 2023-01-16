/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin20;

/**
 *
 * @author dam1
 */
public class Felino extends Mamifero implements IPodeNadar {
    @Override
    public void Caminar (){
        System.out.println("Camina a 4 patas.");
    }
    @Override
    public void Nadar(){
        System.out.println("Nada a pesar de que odia o auga");
    }
}
