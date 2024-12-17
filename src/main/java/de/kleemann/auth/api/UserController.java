package de.kleemann.auth.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class "UserController" is used for ...
 *
 * @author Matteo Kleemann
 * @version 1.0
 * @since 17.12.2024
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello, Admin!";
    }

    @GetMapping("/greensign")
    public String greensignEndpoint() {
        return "Hello, Greensign!";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Hello, User!";
    }

}
