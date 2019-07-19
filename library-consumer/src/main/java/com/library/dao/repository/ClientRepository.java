package com.library.dao.repository;

import com.library.dao.model.Book;
import com.library.dao.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Long> {
}
