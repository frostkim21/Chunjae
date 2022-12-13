package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    // http://localhost:8080/userRegForm
    // classpath:/templates/userRegForm.html
    @GetMapping("/userRegForm")
    public String userTegFrom() {
        return "userRegForm";
    }

    @PostMapping("/userReg")
    public String userReg(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ){
        System.out.println("name : " + name);
        System.out.println("email : " + email);
        System.out.println("password : " + password);
        return "redirect:/welcome"; // 브라우저에게 자동으로 http://localhost:8080/welcome 으로 이동
  }

  @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
  }

  @GetMapping("/loginform")
    public String loginform() {
        return "loginform";
  }

  @PostMapping("/login")
    public String loing(
            @RequestParam("email") String email,
            @RequestParam("password") String password
  ) {
        //email에 해당하는 회원 정보를 읽어온 후
        //아이디 암호가 맞다면 세션에 회원정보를 저장한다.
        System.out.println("email : " + email);
      System.out.println("email : " + password);
        return "redirect:/";
  }

  @GetMapping("/logout")
    public String logout() {
      //세션에서 회원 정보를 삭제한다
      return "redirect:/";
  }
  }
