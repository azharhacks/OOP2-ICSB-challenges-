public class DemoApplication {
    public static void main(String[] args){
    Admin admin1 = new Admin("Azhar", 1, "admin123");
    User user1 = new User("Ali", 2);

    admin1.Operate(new Update());
    user1.Operate(new Update());
    }
}

