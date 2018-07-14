package by.epam.tr.start;


import by.epam.tr.start.Book.GENRE;
import by.epam.tr.start.Periodical.SUBJECTS;
import by.epam.tr.start.Printing.COVER;

import java.util.Date;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Periodical periodical = new Periodical("Cosmopolitan", "NYC", COVER.soft, 100, new Date(2018, 7, 1), true, SUBJECTS.celebrity);
        Book book_A = new Book("The Green Mile", "Eksmo", COVER.hard, 200, new Date(2010, 01, 01), true, GENRE.mystery, "Stephen King");
        Book book_B = new Book("The Hunger Games", "Eksmo", COVER.hard, 300, new Date(2003, 01, 01), false, GENRE.fantasy, "Suzanne Collins");
        Book book_C = new Book("The Witcher", "Eksmo", COVER.hard, 400, new Date(2006, 01, 01), false, GENRE.fantasy, "Andjei Sapkovsky");
        Book book_D = new Book("Harry Potter", "Eksmo", COVER.hard, 500, new Date(2001, 01, 01), true, GENRE.fantasy, "Joanne Rowling");

        Library library = new Library();
        library.addPrintingToList(periodical);
        library.addPrintingToList(book_A);
        library.addPrintingToList(book_B);
        library.addPrintingToList(book_C);
        library.addPrintingToList(book_D);

        library.printPrintingsAsList();

        library.searchForPrintingByName();
        library.searchForPrintingByPublisherSortedByPrice();
        library.searchForPrintingByPublisherSortedByReleaseDate();
        library.removePrintingFromList();

        library.printPrintingsAsTable();
    }
}