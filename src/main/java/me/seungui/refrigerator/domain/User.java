package me.seungui.refrigerator.domain;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

  @Id @GeneratedValue
  private Long id;

  private String username;

  private String email;

  @OneToMany
  private Set<Refrigerator> refrigerator;
}
