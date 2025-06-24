package com.example.mgnt_sys.repository;

import com.example.mgnt_sys.model.Electronics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicsRepository extends JpaRepository<Electronics, Long> {
    Electronics findByElectronicsname(String Electronicsname);
}
