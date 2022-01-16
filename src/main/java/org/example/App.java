package org.example;

import org.example.Data.Book;
import org.example.Requests.BooksRequest;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Book> books = new BooksRequest().execute();
        for(Book book : books){
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
}
