package com.example.springelasticsearch_pr.controller;

import com.example.springelasticsearch_pr.entity.Member;
import com.example.springelasticsearch_pr.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/search")
    public Member searchMember(@RequestParam String name){
        return memberService.findMember(name);
    }

    @GetMapping("/list")
    public Iterable<Member> searchAllMember(){
        return memberService.findAll();
    }

}
