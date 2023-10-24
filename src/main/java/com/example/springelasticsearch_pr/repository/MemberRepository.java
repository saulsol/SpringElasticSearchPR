package com.example.springelasticsearch_pr.repository;

import com.example.springelasticsearch_pr.entity.Member;
import org.elasticsearch.search.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MemberRepository extends ElasticsearchRepository<Member, Integer> {

    Member searchMemberByName(String name);
}
