package controllers;

import db.Seeds;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.SparkBase.staticFileLocation;

public class YodoController {


    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        Seeds.seedData();

        AdvertsController advertsController = new AdvertsController;
//        ComputerGamesController computerGamesController = new ComputerGamesController;
//        BooksController BooksController = new BooksController;
//        BicyclesController bicyclesController = new BicyclesController;
//        BoardGamesController boardGamesController = new BoardGamesController;
        UsersController usersController = new UsersController;

    }
}