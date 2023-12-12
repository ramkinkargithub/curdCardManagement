package com.cardManagement.service;

import com.cardManagement.model.Card;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ICardService {
    public List<Card> findAll();
    public int save(Card card);
    public int update(Card card);
    public  int deleteById(int id);
}
