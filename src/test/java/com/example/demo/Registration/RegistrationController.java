package com.example.demo.Registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
    private RegistrationService registerationService;

    public String register(@RequestBody RegistrationRequest request)
    {
        return registerationService.register(request);
    }
}
