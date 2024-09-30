package com.real_estate.backend.repository;

import com.real_estate.backend.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
//  todo 10: нужна ли имплементация
}