package com.ame.cartApi.Repository;

import com.ame.cartApi.model.Card;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository {

    Optional<Card> findById(int id);
}