package com.example.springelasticsearch_pr.service;

import com.example.springelasticsearch_pr.entity.Member;
import com.example.springelasticsearch_pr.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member findMember(String name){
        return memberRepository.searchMemberByName(name);
    }

    public Iterable<Member> findAll(){
        return memberRepository.findAll();
    }



}
