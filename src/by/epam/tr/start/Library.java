package by.epam.tr.start;

import java.util.ArrayList;
import java.util.Scanner;

public class Library implements LibraryInterface {

    private ArrayList<Printing> printingsList;
    Scanner sc;

    public Library() {
        printingsList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public ArrayList<Printing> getPrintingsList() {
        return printingsList;
    }

    public void setPrintingsList(ArrayList<Printing> printingsList) {
        this.printingsList = printingsList;
    }

    public void addPrintingToList(Printing printing) {
        this.printingsList.add(printing);
    }

    public void removePrintingFromList() {
        System.out.println();
        System.out.print("Enter the name of printing to be removed: ");
        String nameToRemove = sc.nextLine();
        for (Printing printing : printingsList) {
            if (printing.getName().equalsIgnoreCase(nameToRemove)) {
                printingsList.remove(printing);
                System.out.println("The printing is removed!");
                return;
            }
        }
        System.out.println("No such printing!");
    }

    public void searchForPrintingByName() {
        System.out.println();
        System.out.print("Enter the name of printing to be searched: ");
        String nameToSearch = sc.nextLine();
        for (Printing printing : printingsList) {
            if (printing.getName().equalsIgnoreCase(nameToSearch)) {
                printing.printAsList();
                return;
            }
        }
        System.out.println("No such printing!");
    }

    public void printPrintingsAsList() {
        System.out.println("The list of printings: ");
        for (Printing printing : printingsList) {
            printing.printAsList();
        }
    }

    public void printPrintingsAsTable() {
        System.out.println();
        System.out.println("The table of printings: ");
        System.out.println("|Name|Publisher|Cover|Price|ReleaseDate|Is Bought|Genre/Subjects|Author|");
        System.out.println("------------------------------------------------------------------------------");
        for (Printing printing : printingsList) {
            printing.printAsRow();
        }
    }

    @Override
    public void searchForPrintingByPublisherSortedByPrice() {
        System.out.print("Enter the publisher: ");
        String publisherToSearch = sc.nextLine();
        ArrayList<Printing> printingsListByPublisher = new ArrayList<>();
        for (Printing printing : printingsList) {
            if (printing.getPublisher().equalsIgnoreCase(publisherToSearch)) {
                printingsListByPublisher.add(printing);
            }
        }
        if (printingsListByPublisher.size() != 0) {
            sortByPrice(printingsListByPublisher);
            for (Printing printing : printingsListByPublisher) {
                System.out.println(printing.getName() + "(price: " + printing.getPrice() + ")");
            }
        } else
            System.out.println("No such publisher!");
    }

    @Override
    public void sortByPrice(ArrayList<Printing> printingsList) {
        for (int i = 0; i < printingsList.size() - 1; i++) {
            if (printingsList.get(i).getPrice() > printingsList.get(i + 1).getPrice()) {
                Printing temp = printingsList.get(i);
                printingsList.set(i, printingsList.get(i + 1));
                printingsList.set(i + 1, temp);
            }
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public void searchForPrintingByPublisherSortedByReleaseDate() {
        System.out.print("Enter the publisher: ");
        String publisherToSearch = sc.nextLine();
        ArrayList<Printing> printingsListByPublisher = new ArrayList<>();
        for (Printing printing : printingsList) {
            if (printing.getPublisher().equalsIgnoreCase(publisherToSearch)) {
                printingsListByPublisher.add(printing);

            }
        }
        if (printingsListByPublisher.size() != 0) {
            sortByReleaseDate(printingsListByPublisher);
            for (Printing printing : printingsListByPublisher) {
                System.out.println(printing.getName() + "(Release Date: " + printing.getReleaseDate().getYear() + "." + printing.getReleaseDate().getMonth() + "." + printing.getReleaseDate().getDate() + ")");
            }
        } else
            System.out.println("No such publisher!");
    }

    @Override
    public void sortByReleaseDate(ArrayList<Printing> printingsList) {
        for (int j = 0; j < printingsList.size() - 1; j++) {
            for (int i = 0; i < printingsList.size() - 1; i++) {
                if (printingsList.get(i).getReleaseDate().compareTo(printingsList.get(i + 1).getReleaseDate()) > 0) {
                    Printing temp = printingsList.get(i);
                    printingsList.set(i, printingsList.get(i + 1));
                    printingsList.set(i + 1, temp);
                }
            }
        }
    }
}



