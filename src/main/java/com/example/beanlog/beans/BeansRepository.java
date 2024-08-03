package com.example.beanlog.beans;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeansRepository extends JpaRepository<Beans, Long> {}