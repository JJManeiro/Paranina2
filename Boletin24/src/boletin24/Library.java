/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin24;

/**
 *
 * @author dam1
 */
public class Library implements Comparable{
    private String title,author,isbn;
    private float prize;
    private int units;
    
    public Library(){
        
    }
    
    public Library(String title, String author, String isbn, float prize, int units) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.prize = prize;
        this.units = units;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(float prize) {
        this.prize = prize;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "title:"+title+",author:"+author+",isbn:"+ isbn + ",prize:" + prize + ",units:" + units;
    }
    

    @Override
    public int compareTo(Object o) {
        Library l = (Library)o;
        if (this.title.compareToIgnoreCase(l.title)>0){
            return 1;
        }
        else if (this.title.compareToIgnoreCase(l.title)<0){
            return -1;
        }
        else return 0;
    }
    
}
