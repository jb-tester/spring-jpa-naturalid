package com.mytests.spring.data.springjpacustomrepos;

import org.hibernate.annotations.NaturalId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Map;
import java.util.Optional;

@NoRepositoryBean
public interface NaturalRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

    @NaturalId
    Optional<T> findBySimpleNaturalId(ID naturalId);

    @NaturalId
    Optional<T> findByNaturalId(Map<String, Object> naturalIds);
}