package com.ecom.utilities;

public class UrlResolver {
	
	//View resolver
	public static String resolveView(String urlPath, String urlExtension, String viewExtension) {
		String viewName = urlWithoutExtension(urlPath, urlExtension);
		String viewPage = viewName + "." + viewExtension;
		return viewPage;
	}
	
	public static String resolveView(String urlPath, String urlExtension) {
		return resolveView(urlPath, urlExtension, "jsp");
	}	
	
	
	//Controller Resolver
	public static String[] resolveController(String urlPath, String urlExtension) {
		String controller = urlWithoutExtension(urlPath, urlExtension);
		return capitalize(controller).split("/");
	}
	
	
	//Util methods
	
	//get the url without extension ex: /exemple.do ---> [exemple].
	public static String urlWithoutExtension(String urlPath, String urlExtension) {
		return urlPath.substring(1, urlPath.indexOf("." + urlExtension));
	}	
	
	
	//to capitalize string	
	private static String capitalize(String str) {
		if(str == null || str.isEmpty()) {
	        return str;
	    }
		
	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	public static void main(String[] args) {
		System.out.println(UrlResolver.resolveController("/client/execute.do", "do")[0]);
		System.out.println(UrlResolver.resolveController("/client/execute.do", "do")[1]);

	}
}
