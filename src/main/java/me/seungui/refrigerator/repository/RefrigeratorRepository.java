package me.seungui.refrigerator.repository;

import me.seungui.refrigerator.domain.Refrigerator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefrigeratorRepository extends JpaRepository<Refrigerator, Long> {

}
