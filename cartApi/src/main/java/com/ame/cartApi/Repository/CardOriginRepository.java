package com.ame.cartApi.Repository;


import com.ame.cartApi.model.CardOrigin;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardOriginRepository {
    Optional<CardOrigin> findById(int id);

    CardOrigin save(CardOrigin cardOrigin);
}