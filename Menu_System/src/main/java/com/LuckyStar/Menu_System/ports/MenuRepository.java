package com.LuckyStar.Menu_System.ports;

import com.LuckyStar.Menu_System.business.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, String> {
    //List<Menu> findByRes_Id(String res_id);
}
