package me.seungui.refrigerator.repository;

import me.seungui.refrigerator.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
