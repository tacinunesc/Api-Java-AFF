package com.ame.cartApi.Repository;



import com.ame.cartApi.model.Card;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {}