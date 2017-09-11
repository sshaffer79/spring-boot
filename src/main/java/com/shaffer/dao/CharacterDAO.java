package com.shaffer.dao;

import com.shaffer.dto.CharacterDTO;

public interface CharacterDAO {
    public CharacterDTO get(String id);

    public void insert(CharacterDTO characterDTO);

    public void update(CharacterDTO characterDTO);

    public void delete(String id);
}
