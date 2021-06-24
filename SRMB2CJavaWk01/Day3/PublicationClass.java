
    class Publications
    {
        private String title;
        private float price;

        Publications(String title,float price)
        {
            this.title=title;
            this.price=price;

        }
        void display()
        {
            System.out.println("Title:"+title);
            System.out.println("Price: Rs."+price);

        }
    }
    class Book extends Publications
    {
        private int pages;
        Book(String title,int pages,float price)
        {
            super(title,price);
            this.pages=pages;
        }
        void display()
        {
            super.display();
            System.out.println("No of Pages:"+pages);
        }

    }
    class CD extends Publications
    {
        private float playingtime;
        CD(String title,float playingtime,float price)
        {
            super(title,price);
            this.playingtime=playingtime;
        }
        void display()
        {
            super.display();
            System.out.println("Playing Time:"+playingtime);
        }
    }

    public class PublicationClass {

        public static void main(String a[])
        {
            Publications book1=new Book("Java Book",20,400);
            book1.display();
            Publications cd1=new CD("java tutorials",20.50f,100);
            cd1.display();
        }

    }

