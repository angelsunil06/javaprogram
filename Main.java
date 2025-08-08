package inheritancedemo;
class Book{
	String title;
	String author;
	double price;

Book(String title,String author,double price){
	this.title=title;
	this.author=author;
	this.price=price;
}


public void displaydetails() {

	System.out.println("Title:\t" +title);
	System.out.println("Author:\t" +author);
	System.out.println("Price:\t" +price);

	
}
}
class Ebook extends Book{
	double filesizemb;
	Ebook(String title,String author,double price,double filesizemb){
	super(title,author,price);
	this.filesizemb=filesizemb;
	}
	public void displaydetails() {
		super.displaydetails();
		System.out.println("filesizemb:"+filesizemb);
	}
	
	
}
class Printedbook extends Book{
	int numberofpages;
	Printedbook(String title,String author,double price,int numberofpages){
	super(title,author,price);
	this.numberofpages=numberofpages;
	}
	public void displaydetails() {
		super.displaydetails();
		System.out.println("numberofpages:"+numberofpages);
	
	
	
	
	}}
	


public class Main {
	public static void main(String[] args) {
		Ebook ebook=new Ebook("java","unknown",325.55,300);
		ebook.displaydetails();
		System.out.println();
		Printedbook printedbook=new Printedbook("javademo","win",340.99,200);
		printedbook.displaydetails();
		
		
	}
	
}
	


