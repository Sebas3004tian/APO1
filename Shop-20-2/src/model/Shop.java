package model;
import java.util.Arraylist;
public class Shop {
	
	private Product saleShelf[][];
	private Literature literatureShelf[][];
	private Movie movieShelf[][];

	
	
  private String name;
  private int id;

  public Shop(String name, int id) {
    this.name = name;
    this.id = id;
	saleShelf=new Product[5][8];
	literatureShelf=new Literature[10][15];
	movieShelf=new Movie[15][15];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void addProduct(Product product) {

  }

  public String infoProducts() {
	  return "";
  }
  
}
