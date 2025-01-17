
import java.util.*;

class Book {

    public List<String> title;
    public List<String> author;
    private List<Boolean> isAvailable;

    Book(List<String> title, List<String> author,
            List<Boolean> isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void getAvailability(String bookName) {
        System.out.println(isAvailable.get(title.indexOf(bookName)));
    }

    public void returnBook(String bookName) {
        isAvailable.set(title.indexOf(bookName), true);
    }

    public void borrowBook(String bookName) {
        if (!isAvailable.get(title.indexOf(bookName))) {
            System.out.println("Book is not available.");
        } else {
            isAvailable.set(title.indexOf(bookName), false);
        }
    }
}

class encapsulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<String> title = new ArrayList<>();
        List<String> author = new ArrayList<>();
        List<Boolean> isAvailable = new ArrayList<>();
        String temp;
        boolean temp1;
        String temp2;
        for(int i=0;i<n;i++) {
            temp = scanner.next();
            title.add(temp);
        }
        for(int i=0;i<n;i++) {
            temp = scanner.next();
            author.add(temp);
        }
        for(int i=0;i<n;i++) {
            temp1 = scanner.nextBoolean();
            isAvailable.add(temp1);
        }


        Book book = new Book(title, author, isAvailable);

        int m = scanner.nextInt();
        List<List<String>> calls = new ArrayList<>();
        for(int i=0;i<m;i++) {
            temp = scanner.next();
            temp2 = scanner.next();
            List<String> temp3 = new ArrayList<>();
            temp3.add(temp);
            temp3.add(temp2);
            calls.add(temp3);
        }

        for (List<String> methodCall : calls) {
            String operation = methodCall.get(0);
            String bookName = methodCall.get(1);

            if (operation.equals("1")) {
                book.borrowBook(bookName);
            } else if (operation.equals("2")) {
                book.returnBook(bookName);
            } else if (operation.equals("3")) {
                book.getAvailability(bookName);
            }
        }
    }

}
