package tHaleyadhu;

public class ChocolateFactory {
	
	 private int barcode;
	 private String name;
	 private int weight;
	 private int cost;
	
	public ChocolateFactory(){
		barcode = 1234;
		name= "chocolate coffe";
		weight=500;
		cost = 250;
	}
	public  int   getbarcode() {
		return barcode;
	}
	public void setbarcode(int barcode) {
		this.barcode=barcode;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getweight() {
		return weight;
	}
	public void setweight(int weight) {
		this.weight=weight;
	}
	public int getcost() {
		return cost;
	}
	public void setcost(int cost) {
		this.cost=cost;
	}void display()
	{
		System.out.println("barcode is :"+barcode);
		System.out.println("name is :"+name);
		System.out.println("weight is :"+weight);
		System.out.println("cost is :"+cost);

		}
	public static void main(String[] args) {
		ChocolateFactory c1 =new ChocolateFactory();
		
		c1.display();
		c1.getbarcode();
	}
}
