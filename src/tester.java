public class tester {
    public static void main(String[] args){
        AddressList list = new AddressList();
        list.addToBack("1","n","n","n","n");
        list.addToBack("2","n","n","n","n");
        list.addToFrount("3","n","n","n","n");
        list.addToBack("4","n","w","n","n");
     //  System.out.println(list.toString());
        list.revers();
        System.out.println(list.reversToString());
    }
}
