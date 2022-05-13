
package com.portfolio.Gonzalo.Repository;

import com.portfolio.Gonzalo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
