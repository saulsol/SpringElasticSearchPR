package com.example.springelasticsearch_pr.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "member")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Member {

    @Id
    private String id;
    private String name;
    private String phone;
    private int age;
    private String pass;
    private String email;



}
