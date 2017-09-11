package com.shaffer.postgres.dao;

import com.shaffer.dao.CharacterDAO;
import com.shaffer.dto.CharacterDTO;
import org.springframework.stereotype.Repository;

@Repository
public class CharacterPostgresImpl implements CharacterDAO{

    @Override
    public CharacterDTO get(String id) {
        return null;
    }

    @Override
    public void insert(CharacterDTO characterDTO) {

    }

    @Override
    public void update(CharacterDTO characterDTO) {

    }

    @Override
    public void delete(String id) {

    }
}
