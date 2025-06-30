package AuthenticationChallenge6;
public class Admin extends Account {
    protected String password;
    
    public Admin(String name,int id,String password) {
       this.name = name;
       this.id = id;
        this.password = password;

    }
    
}
