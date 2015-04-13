/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

/**
 *
 * @author ltcn
 */
public class CD {
    private String title;
    private String artist;
    private String country;
    private String company;
    private String  price;
    private int year;
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String a){
        title = a;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public void setArtist(String a){
        artist = a;
    }
    
    public String getCountry(){
        return country;
    }
    
    public void setCountry(String a){
        country = a;
    }
    
    public String getCompany(){
        return company;
    }
    public void setCompany(String a){
        company = a;
    }
    
    public String getPrice(){
        return price;
    }
    public void setPrice(String a){
        price = a;
    }
    
    public int getYear(){
        return year;
    }
    public void setYear(int a){
        year = a;
    }
    
    @Override
    public String toString(){
        return "Title: "+ this.title +" Artist: " + this.artist + " Country: " + 
                this.country + " Company: "+ this.company + " Price: " + 
                this.price;
    }
    
}
