public class ArrayChallenge {
    public static void main (String args[]){
        String[] StringArray={"B123", "A123","A222" ,"C123", "D123", "E123"};//Declaring and initializing an array of strings
    //loop through the array and print each item that starts with "A"
    for (String item: StringArray){
if(item.startsWith("A")){
    System.out.println(item);
}
    }
}
}
