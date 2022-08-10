package com.songproject.component.songs;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface SongService {

    public List<SongsModel> getAllSongs();
    public SongsModel addSong(SongsModel s);
    public Optional<SongsModel> GetById(String id);
    public void DeleteSongs(String ids);
    public List<SongsModel> getByArtist(String art);
    public SongsModel UpdateSongs(SongsModel sm);

}
