package com.demo.entity;

public class Authority {

    private Long id;

    private AuthorityName name;

    public Authority() {
    }

    public Authority(Long id, AuthorityName name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuthorityName getName() {
        return name;
    }

    public void setName(AuthorityName name) {
        this.name = name;
    }
}
