package com.company;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + "Book has been added!");
    }
    void showavailablebooks(){
        System.out.println("Available Books are");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issuebook(String book){
            for(int i = 0; i<this.books.length; i++){
                if(this.books[i].equals(book)){
                    System.out.println("This book has been issued");
                    this.books[i] = null;
                    return;
                }
            }
        System.out.println("This book doesn't exist");
    }
    void returnbook(String book){
        addBook(book);
    }
}
public class LibraryMaking {
    public static void main(String[] args) {
        Library centerallibrary = new Library();
        centerallibrary.addBook("Think and Rich");
        centerallibrary.addBook("C++");
        centerallibrary.addBook("Algorithums");
        centerallibrary.showavailablebooks();
        centerallibrary.issuebook("C++");
        centerallibrary.showavailablebooks();
        centerallibrary.returnbook("C++");
        centerallibrary.showavailablebooks();
    }
}
