package com.clientui.web.controller;

import com.clientui.beans.BookBean;
import com.clientui.web.proxies.MicroserviceBookProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    MicroserviceBookProxy mBookProxy;


    @RequestMapping("/books")
    public String accueil(Model model){

        List<BookBean> books =  mBookProxy.findBooks();
        model.addAttribute("books", books);

        return "listBooks";
    }
}
