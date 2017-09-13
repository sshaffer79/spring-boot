package com.shaffer.controller;

import com.shaffer.dto.CharacterDTO;
import com.shaffer.postgres.dao.CharacterPostgresDAO;
import com.shaffer.postgres.model.CharacterPostgres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class CharacterAPIController {
    @Autowired
    private CharacterPostgresDAO characterPostgresDAO;

    @RequestMapping(value="/{id}/", method= RequestMethod.GET)
    @ResponseBody
    public CharacterDTO getWithId(@PathVariable("id") int id) {
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setId(id);
        return characterDTO;
    }

    @RequestMapping(value = "/", method = { RequestMethod.PUT, RequestMethod.POST })
    @ResponseBody
    public String update(@ModelAttribute CharacterDTO characterDTO) {
        try {
            CharacterPostgres characterPostgres = new CharacterPostgres(characterDTO);
            characterPostgresDAO.save(characterPostgres);
        } catch (Exception ex) {
            return "failure due to " + ex.getMessage();
        }
        return "success";
    }

    @RequestMapping(value = "/{id}/", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") int id) {
        try {
            characterPostgresDAO.delete(id);
        } catch (Exception ex) {
            return "failure due to " + ex.getMessage();
        }
        return "success";
    }
}
