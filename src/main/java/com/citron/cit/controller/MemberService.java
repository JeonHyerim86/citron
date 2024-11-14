package com.citron.cit.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {

    @GetMapping("/members")
    @ApiOperation("회원조회")
    public void get(){

    }

    @GetMapping("/members/register")
    @ApiOperation("회원등록")
    public void register(){

    }

    @GetMapping("/members/delete")
    @ApiOperation("회원삭제")
    public void delete(){

    }

}
