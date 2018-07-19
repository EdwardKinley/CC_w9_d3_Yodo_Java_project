package db;

import models.*;
import models.enums.AgeClassification;
import models.enums.Console;

public class Seeds {

    public static void seedData() {

        DBHelper.deleteAll(Advert.class);

//        delete other class objects
//
//        add seed data

        User user1 = new User("Abigail", 10);
        DBHelper.save(user1);
        User user2 = new User("Benedict", 2);
        DBHelper.save(user2);
        User user3 = new User("Cecilia", 12);
        DBHelper.save(user3);
        User user4 = new User("Dylan", 15);
        DBHelper.save(user4);
        User user5 = new User("Emily", 8);
        DBHelper.save(user5);
        User user6 = new User("Ferdinand", 20);
        DBHelper.save(user6);
        User user7 = new User("Grace", 7);
        DBHelper.save(user7);
        User user8 = new User("Humphrey", 5);
        DBHelper.save(user8);

        ComputerGame computerGame1 = new ComputerGame("Sonic the Hedgehog", "1991 Sega game", 5, "url1", user1, Console.SEGA_GENESIS, AgeClassification.THREE);
        DBHelper.save(computerGame1);
        ComputerGame computerGame2 = new ComputerGame("Mario Bros.", "Mario and Luigi in the sewers!", 6, "url2", user2, Console.GAMEBOY, AgeClassification.THREE);
        DBHelper.save(computerGame2);
        ComputerGame computerGame3 = new ComputerGame("Men in Black", "Mr Smith and Mr Jones battle the aliens in this fun game.", 8, "url3", user2, Console.NINTENDO_64, AgeClassification.SEVEN);
        DBHelper.save(computerGame3);


    }

}
