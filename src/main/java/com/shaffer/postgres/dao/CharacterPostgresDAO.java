package com.shaffer.postgres.dao;

import com.shaffer.dto.CharacterDTO;
import com.shaffer.postgres.model.CharacterPostgres;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CharacterPostgresDAO extends CrudRepository<CharacterPostgres, Integer>{

    public CharacterDTO findById(int id);
}
