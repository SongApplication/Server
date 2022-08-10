package com.songproject.component.songs;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
public interface SongsRepository extends MongoRepository<SongsModel, String> {

  public List<SongsModel> findByArtist(String art);

}
