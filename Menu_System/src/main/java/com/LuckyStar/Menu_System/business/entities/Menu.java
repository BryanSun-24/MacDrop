package com.LuckyStar.Menu_System.business.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor @RequiredArgsConstructor
@Getter @Setter
@ToString
public class Menu {
    @Id
    private String id;
    @NonNull
    private String res_id;
    @NonNull
    private String name;
    private String description;
    private String picture_url;

}
