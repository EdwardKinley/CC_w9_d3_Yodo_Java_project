package models;

import models.enums.Category;
import models.enums.Format;
import models.enums.Genre;

public class Book extends Advert {

    private Genre genre;
    private Format format;

    public Book() {}

    public Book(String title, String description, int price, String imageUrl, User user, Genre genre, Format format) {
        super(title, description, price, Category.BOOK, imageUrl, user);
        this.genre = genre;
        this.format = format;
    }


}
