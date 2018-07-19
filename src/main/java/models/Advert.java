package models;

import models.enums.Category;

import javax.persistence.*;

@Entity
@Table(name = "adverts")
public class Advert {

    private int id;
    private String title;
    private String description;
    private int price;
    private Category category;
    private String imageUrl;
    private User user;

    public Advert() {}

    public Advert(String title, String description, int price, Category category, String imageUrl, User user) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
        this.user = user;
    }

    @Column(name="id")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="name")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="price")
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Enumerated(value=EnumType.STRING)
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }


}
