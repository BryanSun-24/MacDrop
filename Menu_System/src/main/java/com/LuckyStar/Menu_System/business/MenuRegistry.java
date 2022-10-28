package com.LuckyStar.Menu_System.business;

import com.LuckyStar.Menu_System.business.entities.Menu;
import com.LuckyStar.Menu_System.ports.MenuRepository;
import com.LuckyStar.Menu_System.ports.MenuFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuRegistry implements MenuFinder {

    private final MenuRepository repository;

    @Autowired
    public MenuRegistry(MenuRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Menu> findAll() {
        return repository.findAll();
    }
}
