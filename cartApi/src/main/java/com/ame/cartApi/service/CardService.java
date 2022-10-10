package com.ame.cartApi.service;


import com.ame.cartApi.Repository.CardRepository;
import com.ame.cartApi.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Optional<Card> findById(int id) {
        return cardRepository.findById(id);
    }
}