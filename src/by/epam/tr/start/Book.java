package by.epam.tr.start;


import java.util.Date;

public class Book extends Printing {
    public enum GENRE {scifi, drama, mystery, horror, children, history, biography, fantasy}

    private GENRE genre;
    private String author;

    public Book(String name, String publisher, COVER cover, double price, Date releaseDate, boolean isBought, GENRE genre, String author) {
        super(name, publisher, cover, price, releaseDate, isBought);
        this.setGenre(genre);
        this.setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public GENRE getGenre() {
        return genre;
    }

    public void setGenre(GENRE genre) {
        this.genre = genre;
    }

    @SuppressWarnings("deprecation")
    public void printAsList() {
        System.out.println("Book: ");
        System.out.println("Name: " + super.getName());
        System.out.println("Publisher: " + super.getPublisher());
        System.out.println("Cover: " + super.getCover());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Release Date: " + super.getReleaseDate().getYear());
        System.out.println("Is bought: " + super.isBought());
        System.out.println("Genre: " + genre);
        System.out.println("Author: " + author);
        System.out.println();
    }

    @SuppressWarnings("deprecation")
    public void printAsRow() {
        System.out.print("|" + super.getName() + "|" + super.getPublisher() + "|" + super.getCover() + "|" + super.getPrice() + "|" + super.getReleaseDate().getYear() + "|" + super.isBought() + "|" + genre + "|" + author + "|\n");
    }
}