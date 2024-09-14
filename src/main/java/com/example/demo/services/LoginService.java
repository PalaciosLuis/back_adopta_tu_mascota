package com.example.demo.services;

import com.example.demo.request.LoginRequest;
import com.example.demo.response.LoginResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class LoginService {

  @PostMapping("/login")
  public LoginResponse Login(@RequestBody LoginRequest request){
    if (
      request.getTipo().equals("dni")
      & request.getValor().equals("12345678")
      & request.getPassword().equals("Password123")
    )
    {
      return new LoginResponse(200,"Login iniciado");
    }
    return new LoginResponse(404, "Autenticación fallida");
  }

  @PostMapping("/close")
  public LoginResponse CloseLogin(){
    return new LoginResponse(200,"Sesión cerrada");
  }

}
