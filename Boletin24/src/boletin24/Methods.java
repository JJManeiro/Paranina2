/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin24;
import com.yo.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author dam1
 */
public class Methods {
    public ArrayList Alist (ArrayList<Library>list)throws NullTextException{
        Library L = new Library (PedirDatos.pedirString("title?"),PedirDatos.pedirString("author?"),PedirDatos.pedirString("isbn?"),PedirDatos.pedirFloat("prize?"),PedirDatos.pedirInt("units?"));
        list.add(L);
        return list;
    }
    public void show (ArrayList<Library>list){
        Collections.sort(list);
        for(Library book:list){
            System.out.println(book);
        }
        System.out.print("\n");
    }
    public void consult (ArrayList<Library>list) throws NullTextException{
        String name=PedirDatos.pedirString("what book are you looking for?");
        if (name.isEmpty()==true){
            throw new NullTextException ("Can't have null text");
        }
        Library book = look (list,name);
        System.out.println(book);
    }
    private Library look (ArrayList<Library>list,String title) throws NullTextException{
        for (Library book:list){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
            else if (title.isEmpty()==true){
                throw new NullTextException ("Can't have null text");
            }
        }
        return null;
    }
    public void sell (ArrayList<Library>list) throws Exception{
        String name=PedirDatos.pedirString("what book is being sold?");
        if (name.isEmpty()==true){
            throw new NullTextException ("Can't have null text");
        }
        Library book = look (list,name);
        book.setUnits(book.getUnits()-1);
        if (book.getUnits()==0){
            list.remove(book);
        }
    }
    public void delete (ArrayList<Library>list) throws Exception{
       String name=PedirDatos.pedirString("what book you're deleting?");
       if (name.isEmpty()==true){
            throw new NullTextException ("Can't have null text");
       }
       Library book = look (list,name);
       list.remove(book);
    }
    public void check (ArrayList<Library>list){
        Iterator it = list.iterator();
        while (it.hasNext()){
            Library oos=(Library)it.next();
            if (oos.getUnits()==0)
                it.remove();
        }
    }
}
