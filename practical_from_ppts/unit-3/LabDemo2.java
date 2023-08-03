import java.util.Scanner;

class Book{
    String Title;
    String Name;

    Book(String Title,String Name){
        this.Title=Title;
        this.Name=Name;
    }
}

class BookDetails extends Book{
    double Price;
    int Stock;

    BookDetails(String Title,String Name,double Price,int Stock){
        super(Title,Name);
        this.Price=Price;
        this.Stock=Stock;
    }

    public Boolean search(String SearchWord){
        if(Title.indexOf(SearchWord)>-1 ||Name.indexOf(SearchWord)>-1){
            return true;
        }
        else{
            return false;
        }
    }

    public void updateStock(int NoOfBooks,String Choice){
        if(Choice=="purchase"||Choice=="Purchase"||Choice=="PURCHASE"){
            Stock+=NoOfBooks;
        }
        else if(Choice=="Sale"||Choice=="sale"||Choice=="SALE"){
            Stock-=NoOfBooks;
        }
    }
}

public class LabDemo2{
    public static void main(String[]args){
        Scanner scString=new Scanner(System.in);
        Scanner scNumber=new Scanner(System.in);
        System.out.print("Enter Number Of Books=");
        int n=scNumber.nextInt();

        BookDetails[] Books=new BookDetails[n];
        
        for(int i=0;i<n;i++){
            System.out.print("Enter A Title Of A Book=");
            String Title=scString.nextLine();
        
            System.out.print("Enter A Author Name Of Book=");
            String AuthorName = scString.nextLine();

            System.out.print("Enter A Price Of Book=");
            double Price=scNumber.nextDouble();

            System.out.print("Enter A Stock Of Book=");
            int Stock=scNumber.nextInt();

            Books[i]=new BookDetails(Title,AuthorName,Price,Stock);
        }
        while(true){
            System.out.println("Enter 1 for Search,2 for Update,3 for Display=");
            int c=scNumber.nextInt();

            if(c==1){
                System.out.print("Enter A Search Word=");
                String Search=scString.nextLine();
                for(int i=0;i<n;i++){
                    if(Books[i].search(Search)){
                        System.out.println("Book Title = "+Books[i].Title);
                    }
                }                
            }
            
            else if(c==2){
                System.out.print("Enter A Title Of The Book=");
                String SearchWord=scString.nextLine();
                System.out.println("Enter Text : Purchase or sale ");
                String Choose=scString.nextLine();
                System.out.print("Enter A Number Of Purchasing or Saling Book=");
                int noOfBooks=scNumber.nextInt();

                for(int i=0;i<n;i++){
                    if(Books[i].search(SearchWord)){
                        Books[i].updateStock(noOfBooks,Choose);    
                    }
                }
            }

            else if(c==3){
                for(int i=0;i<n;i++){
                System.out.println("Book-"+(i+1));
                System.out.println("Title="+Books[i].Title);
                System.out.println("Author Name="+Books[i].Name);
                System.out.println("Price="+Books[i].Price);
                System.out.println("Stock="+Books[i].Stock);
                }
            }
        }
    }
}