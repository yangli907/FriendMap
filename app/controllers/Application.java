package controllers;

import play.mvc.Controller;

import com.restfb.types.User;

import controllers.connector.FacebookConnector;

public class Application extends Controller {

    public static void index() {
    	String greeting = new String("Hello World!");
        render(greeting);
    }

    public static void show(String token){
    	System.out.println(token);
    	FacebookConnector facebookConnector = new FacebookConnector(token);
    	User user = facebookConnector.getFacebookClient().fetchObject("me", User.class);
    	render(user);
    }
}