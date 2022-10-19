package com.kevin.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Kevin Lee on 10/19/22
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {this.chuckNorrisQuotes = new ChuckNorrisQuotes();}

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
