package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.Note;
import com.example.easynotes.model.User;
import com.example.easynotes.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("批量删除角色")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@RequestParam("ids") Long id) {
        int count = userService.delete(id);
        if (count > 0) {
            return "Success";
        }
        return "Failed";
    }
    @GetMapping("/all")
    public List<User> findAll(){
        return userService.findAll();
    }
}
