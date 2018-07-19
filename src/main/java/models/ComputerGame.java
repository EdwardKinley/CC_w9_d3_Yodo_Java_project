package models;

import models.enums.AgeClassification;
import models.enums.Category;
import models.enums.Console;
import models.enums.GameType;

public class ComputerGame extends Advert {

    private Console console;
    private AgeClassification ageClassification;
    private GameType gameType;

    public ComputerGame() {}

    public ComputerGame(String title, String description, int price, String imageUrl, User user, Console console, AgeClassification ageClassification, GameType gameType) {
        super(title, description, price, Category.COMPUTER_GAME, imageUrl, user);
        this.console = console;
        this.ageClassification = ageClassification;
        this.gameType = gameType;
    }



}
