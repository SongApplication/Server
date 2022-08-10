package com.songproject.component.songs;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SongsService implements SongService {
    private final SongsRepository songsRepository;
    public SongsService(SongsRepository repository) {
        this.songsRepository = repository;
    }

    public List<SongsModel> getAllSongs() {
        System.out.println("get song");
        return songsRepository.findAll();
    }

    public SongsModel addSong(SongsModel s) {
        System.out.println("add song");
        songsRepository.save(s);
        return s;
    }

    public Optional<SongsModel> GetById(String id) {
        return songsRepository.findById(id);
    }

    public void DeleteSongs(String ids) {
        System.out.println("delete song");
        songsRepository.deleteById(ids);
    }

    public List<SongsModel> getByArtist(String art) {

        return songsRepository.findByArtist(art);
    }

    public SongsModel UpdateSongs(SongsModel sUpdate) {
        return songsRepository.findById(sUpdate.getId())
                .map(s -> {
                    s.setArtist(sUpdate.getArtist());
                    s.setGenre(sUpdate.getGenre());
                    s.setLength(sUpdate.getLength());
                    s.setPrice(sUpdate.getPrice());
                    s.setTitle(sUpdate.getTitle());
                    return songsRepository.save(s);
                }).orElseGet(()->{
                    sUpdate.setId(sUpdate.getId());
                            return songsRepository.save(sUpdate);
                        }
                );
    }


    
}
