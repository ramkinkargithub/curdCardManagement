package com.cardManagement.repository;

import com.cardManagement.model.Card;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICardRepository {
    public List<Card> findAll();
    public int save(Card card);
    public int update(Card card);
    public int deleteById(int id);

}

