package com.example.crudmysql.crudmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudmysql.crudmysql.library.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
	