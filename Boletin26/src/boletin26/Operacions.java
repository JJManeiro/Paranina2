/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin26;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dam1
 */
public class Operacions {
     public <T> void engadir (T ele,ArrayList<T>lista){
        lista.add(ele);
    }
    public <T> void amosar (ArrayList<T>lista){
        for(T ele: lista){
            System.out.print(ele+",");
        }
    }
    public <T> void min (ArrayList<T>lista){
        System.out.println("min: "+Collections.min(lista,null));
    }
    public <T> void max (ArrayList<T>lista){
        System.out.println("max: "+Collections.max (lista,null));
    }
    public <T> void look (T ele,ArrayList<T>lista){
        if (lista.indexOf(ele)>=0){
            System.out.println(ele+" está en la lista en la posicion "+(lista.indexOf(ele)+1));
        }
        else System.out.println(ele+" no está en la lista");
    }
    public <T> void delete (T ele,ArrayList<T>lista){
        if (lista.indexOf(ele)>=0){
            lista.remove(ele);
            System.out.println("sacamos o "+ele);
        }
        else System.out.println(ele+" no está en la lista");
    }
}
