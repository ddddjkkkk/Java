package GroupActivity;

import java.util.Arrays;

public class Library{
    private Book[] books = new Book[5];
    private int bookCount = 0;

    public void addBook(Book book){
        books[bookCount++] = book;
    }

    public void displayBooks(){
        for(int i = 0; i < bookCount; i++){
//            System.out.println("[" + books[i].getId() + "] "
//                + books[i].getTitle() + " by " + books[i].getAuthor());
            System.out.printf("[%1d] %s by %s\n",
                    books[i].getId(), books[i].getTitle(), books[i].getAuthor());
        }
    }

    public void displayAvailableBooks(){
        for(int i = 0; i < bookCount; i++){
            if(books[i].isInShelf()){
                System.out.println("[" + books[i].getId() + "] "
                        + books[i].getTitle() + " by " + books[i].getAuthor() + " [Available]");
            }

        }
    }
}
