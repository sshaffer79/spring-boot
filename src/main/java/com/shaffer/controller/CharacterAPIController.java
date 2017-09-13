package com.shaffer.controller;

import com.shaffer.dto.CharacterDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class CharacterAPIController {

    @RequestMapping(value="/{id}/", method= RequestMethod.GET)
    @ResponseBody
    public CharacterDTO getWithId(@PathVariable("id") String id) {
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setId(id);
        return characterDTO;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseBody
    public CharacterDTO insert(@ModelAttribute CharacterDTO characterDTO) {
        return characterDTO;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public CharacterDTO update(@ModelAttribute CharacterDTO characterDTO) {
        return characterDTO;
    }

    @RequestMapping(value = "/{id}/", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") String id) {
        return id;
    }
}
