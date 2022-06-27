package main.java.web;

import static io.javalin.apibuilder.ApiBuilder.post;

import main.java.controller.CustomerController;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class CrmApp {

	public static void main(String[] args) {
		Javalin app = Javalin.create();

		app._conf.addStaticFiles("C:\\Users\\PC109\\IdeaProjects\\maven\\m154-maven-web\\resources\\public", Location.EXTERNAL);
		app.routes(() -> {
			post(Path.Web.CUSTOMER, CustomerController.selectCustomer);
			post(Path.Web.CREATE_CUSTOMER, CustomerController.createCustomer);
		});

		app.error(404, ViewUtil.notFound);

		app.start(7070);
	}
}