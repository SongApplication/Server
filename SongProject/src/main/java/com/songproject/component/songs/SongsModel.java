package com.songproject.component.songs;

// import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Songs")

public class SongsModel {

  //private @Id @GeneratedValue int id;
  @Id
  private String id;
  private String title;
  private String artist;
  private int length;
  private float price;
  private Genre genre;




//  SongsModel(int id,String title, String artist, int length, float price, Genre genre) {

  //  this.id=id;
   // this.title = title;
    //this.artist = artist;
    //this.length = length;
    //this.price = price;
    //this.genre = genre;
  //}

//  public int getId() {
//    return this.id;
//  }
//
//  public String getTitle() {
//    return this.title;
//  }
//
//  public String getArtist() {
//    return this.artist;
//  }

//  public int getLength() {
//    return this.length;
//  }
//
//  public float getPrice() {
//    return this.price;
//  }
//
//  public Genre getGenre() {
//    return this.genre;
//  }
//
//  public void setTitlt(String title) {
//    this.title = title;
//  }
//
//  public void setArtist(String artist) {
//    this.artist = artist;
//  }
//
//  public void setGenre(Genre genre) {
//    this.genre = genre;
//  }
//
//  public void setLength(int length) {
//    this.length = length;
//  }
//
//  public void setPrice(float price) {
//    this.price = price;
//  }

//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//    SongsModel that = (SongsModel) o;
//    return id == that.id && length == that.length && Float.compare(that.price, price) == 0 && title.equals(that.title) && artist.equals(that.artist) && genre == that.genre;
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(id, title, artist, length, price, genre);
//  }
//  @Override
//  public String toString() {
//    return "song{" + "id=" + this.id + ", artist='" + this.artist + '\'' + ", genre='" + this.genre + '\''
//        + ", length='" + this.length + '\'' + ", price='" + this.price + '}';
//  }

}