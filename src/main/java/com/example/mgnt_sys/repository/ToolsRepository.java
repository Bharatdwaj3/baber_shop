package com.example.mgnt_sys.repository;

import com.example.mgnt_sys.model.Tools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolsRepository extends JpaRepository<Tools, Long> {
    Tools findByToolsname(String Toolsname);
}
