package controllers;

import play.mvc.Controller;

public class MapController extends Controller{
	public static void index(){
		String greeting = "Hello Map!";
		render(greeting);
	}
}
