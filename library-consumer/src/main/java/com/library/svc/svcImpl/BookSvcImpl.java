package com.library.svc.svcImpl;

import com.library.dao.model.Book;
import com.library.svc.contracts.BookSvc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookSvcImpl implements BookSvc {

    @Override
    public List<Book> findAllByGenre(String genre) {
        return null;
    }
}
