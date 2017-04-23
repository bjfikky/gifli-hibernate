package com.teamtreehouse.giflib.dao;

import com.teamtreehouse.giflib.model.Gif;


import java.util.List;

/**
 * Created by FIKKY on 4/21/17.
 */
public interface GifDao {
    List<Gif> findAll();
    Gif findById(Long id);
    void save(Gif gif);
    void delete(Gif gif);
}
