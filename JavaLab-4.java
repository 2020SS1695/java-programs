import java.util.*;
class Book
{
    String title;
    String author;
    double price;
    int numPages;
Book()
{
    title="default";
    author="default";
    price=0.0;
    numPages=0;
}
void SetTitle(String t)
{
    title=t;
}
void SetAuthor(String a)
{
    author=a;
    
}
void SetPrice(double p)
{
    price=p;
}
void SetPages(int np)
{
    numPages=np;
}
public String toString()
{
    return title+"\t"+author+"\t"+price+"\t"+numPages+"\n";

}
}
class BookDetails
{
    public static void main(String args[])
    {
        String t,a;
        double p;
        int np,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of books");
        n=sc.nextInt();
        Book b[]=new Book[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the title of the book");
            t=sc.next();
            System.out.println("enter the author of the book");
            a=sc.next();
             System.out.println("enter the price of the book");
            p=sc.nextDouble();
             System.out.println("enter the number of pages of book");
            np=sc.nextInt();
    b[i]=new Book();
    b[i].SetTitle(t);
    b[i].SetAuthor(a);
    b[i].SetPrice(p);
    b[i].SetPages(np);
        }
        System.out.println("Title\tAuthor\tPrice\tPages");
        for(int i=0;i<n;i++)
        {
            System.out.println(""+b[i]);
        }
    }
}