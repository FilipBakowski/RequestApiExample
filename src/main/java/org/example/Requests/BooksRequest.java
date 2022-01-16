package org.example.Requests;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.Data.Book;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BooksRequest extends ApiRequest{
    public BooksRequest(){
        super("https://wolnelektury.pl/api/books/?format=json");
    }
    public List<Book> execute(){
        Gson g = new Gson();
        String json = sendRequest();
        if(!isReady()) return new ArrayList<>();
        Type type = new TypeToken<ArrayList<Book>>(){}.getType();
        List<Book> books = g.fromJson(json, type);
        return books;
    }
}
