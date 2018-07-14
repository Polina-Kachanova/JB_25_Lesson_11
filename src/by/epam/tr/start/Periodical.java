package by.epam.tr.start;

import java.util.Date;

public class Periodical extends Printing {
    public enum SUBJECTS {travelling, fashion, business, children, news, celebrity}

    private SUBJECTS subjects;

    public Periodical(String name, String publisher, COVER cover, double price, Date releaseDate, boolean isBought, SUBJECTS subjects) {
        super(name, publisher, cover, price, releaseDate, isBought);
        this.setSubjects(subjects);
    }

    public SUBJECTS getThematics() {
        return subjects;
    }

    public void setSubjects(SUBJECTS subjects) {
        this.subjects = subjects;
    }

    public void printAsList() {
        System.out.println("Periodical: ");
        super.printAsList();
        System.out.println("Subjects :" + subjects);
        System.out.println();
    }

    public void printAsRow() {
        super.printAsRow();
        System.out.print(subjects + "|	|\n");
    }
}