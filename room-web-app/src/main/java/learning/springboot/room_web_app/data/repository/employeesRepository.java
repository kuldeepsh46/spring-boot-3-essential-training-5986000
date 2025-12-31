package learning.springboot.room_web_app.data.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import learning.springboot.room_web_app.data.entity.employeesEntity;

public interface employeesRepository extends JpaRepository<employeesEntity, UUID> {

}
