package Testbook;

/**
 * Created by Lavin on 9/19/2015.
 */
public class Author {
    private String name;
    private String email;

    public Author(){ }
    public Author(String name){
        this.name=name;
    }
    public Author(String name, String email){
        this.name=name;
        this.email=email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){ return this.email; }
    public void print(){
        System.out.println(name + " at "+ email);
    }
}
