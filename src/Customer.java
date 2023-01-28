import java.util.ArrayList;

public class Customer {
    //age,List<Books>, name,email,telephone,adress,penalties//

    private int age;
    private ArrayList<Books>books;
    private String name;
    private String email;
    private String telephone;
    private String adress;
    private int penalities;

    public Customer(int age, ArrayList<Books>books, String name,String email,
                    String telephone, String adress, int penalities) {
        this.age = age;
        this.books = books;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.adress = adress;
        this.penalities = penalities;
    }

}

