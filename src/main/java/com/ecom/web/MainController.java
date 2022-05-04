package com.ecom.web;

import java.io.IOException;

import java.lang.reflect.*;

import com.ecom.controllers.Controller;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ecom.utilities.UrlResolver;

public class MainController extends HttpServlet {
	Controller controller;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get the path
		String path = request.getServletPath();

		//parse the url to get the controller and the method to call
		String[] controllerAndMethodShouldInvoked = UrlResolver.resolveController(path, "app");


		String controllerClassName = controllerAndMethodShouldInvoked[0] + "Controller";


		String operationName = controllerAndMethodShouldInvoked[1];
		try {
			//load class
			Class c = Class.forName("com.ecom.controllers." + controllerClassName);

			//instantiate the class
			controller = (Controller) c.newInstance();
			try {
				//prepare methode to invoke
				Method method = c.getMethod(operationName, HttpServletRequest.class, HttpServletResponse.class);

				//invoke the method
				String result = (String) method.invoke(controller, request, response);

				//forward to the jsp page
				request.getRequestDispatcher(result).forward(request, response);
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
}
