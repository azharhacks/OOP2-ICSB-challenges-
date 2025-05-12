public class Account {
    protected int id;
    protected String name;
    public DataSource myData;
    

    public void Operate(DataSource myData) {
        this.myData= myData;
        myData.execute();
    }
}
