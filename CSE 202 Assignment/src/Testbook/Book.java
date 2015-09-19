package Testbook;

/**
 * Created by Lavin on 9/19/2015.
 */
public class Book {
    private String name;
    private Author author;
    private double price;
    private int stock;

    public Book(String name,Author author){
        this.name=name;
        this.author=author;
    }
    public Book(String name,Author author, double price, int stock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.stock=stock;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public void borrowBook(int amount){
        if(amount>stock){
            System.out.println("Borrowing amount exceeds the current stock!");
        }
        else stock=stock-amount;
    }
    public void returnBook(int amount){ stock=stock+amount; }
    public Author getAuthor(){
        return this.author;
    }
    public String getAuthorName(){
        return this.author.getName();
    }
    public String getName(){
        return this.name;
    }
    public int getStock(){
        return this.stock;
    }
    public double getPrice(){ return this.price; }
    public void print(){
        System.out.println("Author: "+author.getName()+" Name: "+name+" Price: "+price+" Stock: "+stock);
    }



}