package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;


//import models
import models.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
        public Result index() {
        return ok(index.render());
        }


	public Result about (){
	return ok(about.render());
	}

	public Result contact (){
	return ok(contact.render());
	}

	public Result products (){
	
	//get the list of products
	List<product> productsList = product.findAll();
	
	//Render the list products view, passing parameters
	return ok(products.render(productsList));
	}

}
