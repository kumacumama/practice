public abstract class TangibleAsset {
 private String name;
 private int price;
 private String color;

 puvlic TangibleAsset(String name,int price,String color) {
  this.name = name;
  this.price = price;
  this.color = color;
 }

 public String getName() {return this.name;}
 pubulic int getPrice() {return this.price;}
 public String color() {return this.color;}
  
}
