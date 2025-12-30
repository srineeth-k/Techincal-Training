public class Book {
    private String title;
    private int price;
    public Book(String title,int price){
        this.title=title;
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    public static void main(String args[]){
        Book book1=new Book("Java Programming",500);
        Book book2=new Book("Data Structures",700);
        Book book3=new Book("Apptitude",450);
        if(book1.getPrice()>book2.getPrice() && book1.getPrice()>book3.getPrice()){
            System.out.println(book1.title+" is the most expensive book with cost of "+book1.getPrice());
        }
        else if(book2.getPrice()>book1.getPrice() && book2.getPrice()>book3.getPrice()){
            System.out.println(book2.title+" is the most expensive book with cost of "+book2.getPrice());
        }
        else{
            System.out.println(book3.title+" is the most expensive book with cost of "+book3.getPrice());
        }
    }
}
