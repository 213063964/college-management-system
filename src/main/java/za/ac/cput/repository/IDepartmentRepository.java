package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
}
