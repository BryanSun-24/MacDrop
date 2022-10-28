package com.LuckyStar.Menu_System.ports;

import com.LuckyStar.Menu_System.business.entities.Menu;

import java.util.List;

public interface MenuFinder {
    List<Menu> findAll();

}
