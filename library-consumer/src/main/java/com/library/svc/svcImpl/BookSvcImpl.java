package com.library.svc.svcImpl;

import com.library.dao.model.Book;
import com.library.svc.contracts.BookSvc;

import java.util.List;

public class BookSvcImpl implements BookSvc {

    @Override
    public List<Book> findAllByGenre(String genre) {
        return null;
    }
}
