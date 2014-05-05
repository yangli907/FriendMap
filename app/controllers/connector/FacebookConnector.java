package controllers.connector;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.types.Page;
import com.restfb.types.User;

public class FacebookConnector {
	private final static String APP_SECRET = "3561ea396915aa9791b16c0ad73e079a";
	private final static String APP_ID = "1417839001813162";
	//private final static String ACCESS_TOKEN = "CAACEdEose0cBAETFZAhqtiZCQhGuUjCXxNXGRdkYxGASpVaaWaeZBkmZBBqPocYZB4r56FCdGdt2zg9sxZAezk657CXzCcnQHskanZCc7ZBoqUzaXdjmCZC8NK8p96rIsxUuquW8p2jCqDNk7G4ll4Og9B0UTCvIilzYj1BnajIYkRtzk2dPcdCVO56dggj2kSVBvHHyRvgdbzgZDZD";
	private static FacebookClient facebookClient;
//	public FacebookConnector(){
//		facebookClient = new LoggedInFacebookClient(APP_ID,APP_SECRET);
//	}
	
	public FacebookConnector(String accessToken){
		facebookClient = new DefaultFacebookClient(accessToken);
	}
	
	public static FacebookClient getFacebookClient() {
		return facebookClient;
	}


	public void setFacebookClient(FacebookClient facebookClient) {
		this.facebookClient = facebookClient;
	}


	public static void main(String args[]){
		String testToken = "CAAUJhF4NQKoBAAfOj3F2RN3jL96MnFEt3K6qBAC0AI7XiuY7c0cUYSoIB6lcF1uPJoTp8wCpJY9jTe553aEki5fZCp7klaNqLITBCZAL7LwkaSXdyyUb1LZB60tupYN2ZCZAsOluQcKDcIfbaLmXRmiyRHyJY0Y0PFBGIv1nxmQnLrYUSt56j7axH3fzzK2tiN27vr0LIhwZDZD";
		FacebookConnector facebookConnector = new FacebookConnector(testToken);
		AccessToken accessToken =
				  new DefaultFacebookClient().obtainAppAccessToken(APP_ID, APP_SECRET);

		System.out.println("My application access token: " + accessToken);
		System.out.println(facebookConnector.getFacebookClient().fetchObject("cocacola", Page.class));
		System.out.println(facebookConnector.getFacebookClient().fetchObject("me", User.class));
	}
}
