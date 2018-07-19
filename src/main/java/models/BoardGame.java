package models;


import models.enums.Category;
import models.enums.GameType;

public class BoardGame extends Advert {

    private GameType gameType;

    public BoardGame() {}

    public BoardGame(String title, String description, int price, String imageUrl, User user, GameType GameType) {
        super(title, description, price, Category.BOARD_GAME, imageUrl, user);
        this.gameType = gameType;
    }


}
