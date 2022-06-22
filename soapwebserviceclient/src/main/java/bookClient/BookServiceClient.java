package bookClient;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class BookServiceClient {

    public static void main(String[] args) {

        try{

            BookServiceImplementationService bookServiceImplementationService = new BookServiceImplementationService();
            BookServiceInterface bookServiceInterface = bookServiceImplementationService.getBookServiceImplementationPort();

            Book book = bookServiceInterface.getBookById("ISBIN102");
            System.out.println("..........................................");
            System.out.println("Retrieving Single book by Id: " +book.getBookId());
            System.out.println("Book Name: " + book.getBookTitle());
            System.out.println("Book Author: " + book.getBookAuthor());
            System.out.println("Book Price: " + book.getBookPrice());

            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            //update book
            book.setBookTitle("The Hunger Games: The Ballad of Songbird and Snakes");
            book.setBookPrice((float)25.0);

            String updateMsg = bookServiceInterface.updateBook(book);
            System.out.println("Update message: " +updateMsg);

            Book book2 = bookServiceInterface.getBookById("ISBIN102");
            System.out.println("..........................................");
            System.out.println("Retrieving Single book by Id: " +book2.getBookId());
            System.out.println("Book Name: " + book2.getBookTitle());
            System.out.println("Book Author: " + book2.getBookAuthor());
            System.out.println("Book Price: " + book2.getBookPrice());

            //Get All books before delete
//            System.out.println("\n....... List of Books before deleting a book..........");
//            List<Book> bookList = bookServiceInterface.getAllBooks();
//
//            for(Book b: bookList) {
//                System.out.println("Id: " +b.getBookId());
//                System.out.println("Book name: " + b.getBookTitle());
//                System.out.println("Book Author: " + b.getBookAuthor());
//                System.out.println("Price: " + b.getBookPrice());
//
//                System.out.println("======================================");
//            }

//            Book newBook = new Book();
//
//            newBook.setBookId("ISBIN111");
//            newBook.setBookTitle("The Hunger Games");
//            newBook.setBookAuthor("Suzanne Collins");
//            newBook.setBookPrice(10.00f);
//
//            bookServiceInterface.addBook(newBook);


            //Delete a book from the database
//            String deleteMessage = bookServiceInterface.removeBook("ISBIN103");
//            System.out.println("...............................");
//            System.out.println("Delete message: " + deleteMessage);
//            System.out.println("................................");

            //Get All books after deleting a new book
//            System.out.println("\n.............List of Books after deleting a book...........");
//            List<Book> updatedList = bookServiceInterface.getAllBooks();
//
//            for(Book b: updatedList) {
//                System.out.println("Id: " +b.getBookId());
//                System.out.println("Book name: " + b.getBookTitle());
//                System.out.println("Book Author: " + b.getBookAuthor());
//                System.out.println("Price: " + b.getBookPrice());
//
//                System.out.println("======================================");
//            }


        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
