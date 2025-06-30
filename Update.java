public class Update implements DataSource {
    public void execute() {
        Admin admin1= new Admin("Azhar", 1, "admin123");
        if(admin1.password.equals("admin123")) {
            System.out.println("Data has been updated");
        } else {
            System.out.println("You are not authorized to update data");
        }
        
    }
    
}
