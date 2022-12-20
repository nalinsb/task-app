package lk.ijse.dep9.app.api;


import lk.ijse.dep9.app.dao.custom.UserDAO;
import lk.ijse.dep9.app.dto.UserDTO;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void createUserAccount(@RequestBody UserDTO user){

    }
    @PatchMapping("/me")
    public void updateUserAccountDetails(){

    }
    @GetMapping("/me")
    public void getAccountUserDetails(){

    }
    @DeleteMapping("/me")
    public void deleteUserAccount(){

    }
}
