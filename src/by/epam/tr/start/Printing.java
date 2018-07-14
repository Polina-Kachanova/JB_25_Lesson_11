package by.epam.tr.start;

import java.util.Date;

public class Printing {
    public enum COVER {hard, soft}

    ;

    private String name;
    private String publisher;
    private COVER cover;
    private double price;
    private Date releaseDate;
    private boolean isBought;

    public Printing(String name, String publisher, COVER cover, double price, Date releaseDate, boolean isBought) {
        this.setName(name);
        this.setPublisher(publisher);
        this.setCover(cover);
        this.setPrice(price);
        this.setReleaseDate(releaseDate);
        this.setTaken(isBought);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public COVER getCover() {
        return cover;
    }

    public void setCover(COVER cover) {
        this.cover = cover;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setTaken(boolean isBought) {
        this.isBought = isBought;
    }

    @SuppressWarnings("deprecation")
    public void printAsList() {
        System.out.println("Name: " + name);
        System.out.println("Publisher: " + publisher);
        System.out.println("Cover: " + cover);
        System.out.println("Price: " + price);
        System.out.println("Release Date: " + releaseDate.getYear() + "." + releaseDate.getMonth() + "." + releaseDate.getDate());
        System.out.println("Is bought: " + isBought);
    }

    @SuppressWarnings("deprecation")
    public void printAsRow() {
        System.out.print("|" + name + "|" + publisher + "|" + cover + "|" + price + "|" + releaseDate.getYear() + "." + releaseDate.getMonth() + "." + releaseDate.getDate() + "|" + isBought + "|");
    }
}