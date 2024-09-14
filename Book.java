package Lab5;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    int edition;

    Book(String t, String a, int e) {
        title = t;
        author = a;
        edition = e;
    }

    void Display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            String title = sc.next();
            String author = sc.next();
            int edition = sc.nextInt();
            books[i] = new Book(title, author, edition);
        }
        sc.nextLine();
        String name = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (books[i].author.equals(name)) {
                books[i].Display();
            }
        }
        sc.close();

    }
}
