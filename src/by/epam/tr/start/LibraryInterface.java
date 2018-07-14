package by.epam.tr.start;

import java.util.ArrayList;
import java.util.Scanner;

public interface LibraryInterface {

    public final static ArrayList<Printing> printingsList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public default void searchForPrintingByPublisherSortedByPrice() {
    }

    public default void searchForPrintingByPublisherSortedByReleaseDate() {
    }

    public default void sortByPrice(ArrayList<Printing> printingsList) {
    }

    public default void sortByReleaseDate(ArrayList<Printing> printingsList) {
    }
}



