package com.LuckyStar.Menu_System.business;

import com.LuckyStar.Menu_System.ports.MenuManagement;
import com.LuckyStar.Menu_System.ports.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuManager implements MenuManagement {
    private MenuRepository menuRepository;

    @Autowired
    public MenuManager(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }



}
