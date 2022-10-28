package com.LuckyStar.Menu_System.adapters;

import com.LuckyStar.Menu_System.business.entities.Menu;
import com.LuckyStar.Menu_System.ports.MenuFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(produces = "application/json")
public class MenuController {

    private static final String ENDPOINT = "/menu";
    private final MenuFinder registry;

    @Autowired
    public MenuController(MenuFinder registry) {
        this.registry = registry;
    }

    @GetMapping(ENDPOINT)
    public List<Menu> findAll(){
        return registry.findAll();
    }
}
