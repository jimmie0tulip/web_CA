package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

public class product extends Model(
@Entity

@Id
private long id;

@Constraint.Required
private String name;

@Constraint.Required
private String description;

@Constraint.Required
private int stock;

@Constraint.Required
private double price;

public product (){}

public product (long id, String name, String description, int stock, double price){
this.id = id;
this.name = name;
this.description = description;
this.stock = stock;
this.price = price;
}

//Generic query helper for entity computer with id long
public static Finder<long, product> find = new Finder<long, product>(product.class);

//find all Products in the database
//Filter product name
public static list<product> findAll() {
	return product.find.all();
}

public static findAll();

public long getId (){
return id;
}

public void setId (){
this.id = id;
}

public getName (){
return name;
}

public setName(){
this.name = name;
}

public getDescription(){
return description;
}

public getStock () {
return stock;
}

public setStock (){
this.stock = stock;
}

public getPrice (){
return price;
}

public setPrice
(){
this.price = price;
}
)
