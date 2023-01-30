package me.seungui.refrigerator.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Refrigerator {

  @Id @GeneratedValue
  private Long id;

  @ManyToOne
  private User userId;
}
