package com.songproject.component.songs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("songs")
@CrossOrigin


public class SongsController {

  @Autowired
  private SongsService songsService;

  @GetMapping("/GetAllSongs")
  public List<SongsModel> all() {
    return songsService.getAllSongs();
  }

  @GetMapping("/GetSongById/{id}")
  public Optional<SongsModel> byId(@PathVariable String id){
        return songsService.GetById(id);
    }

  @PostMapping("/AddSongs")
  public SongsModel add(@RequestBody SongsModel song) {
   return songsService.addSong(song);}

  @DeleteMapping("/DeleteSong/{id}")
  public void delete(@PathVariable String id) {
     songsService.DeleteSongs(id);
  }

 @GetMapping("/GetByArtist/{artist}")
 public List<SongsModel> byArtist(@PathVariable String artist){
  return songsService.getByArtist(artist);
 }

  @PutMapping("/UpdateSongs")
  void update(@RequestBody SongsModel song) {
     songsService.UpdateSongs(song);
  }
}