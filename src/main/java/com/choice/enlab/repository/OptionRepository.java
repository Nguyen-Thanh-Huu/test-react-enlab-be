package com.choice.enlab.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.choice.enlab.entity.Optionstbl;

@Repository
public interface OptionRepository extends JpaRepository<Optionstbl, Integer> {
   public  Optional<List<Optionstbl>> findByidquestion(Integer id);
   public  Optional<List<Optionstbl>> findAllByIdquestion(Integer id);
}
