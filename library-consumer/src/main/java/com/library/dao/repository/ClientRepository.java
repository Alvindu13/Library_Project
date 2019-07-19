package com.library.dao.repository;

import com.library.dao.model.Book;
import com.library.dao.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ClientRepository  extends JpaRepository<Client, Long> {
}
