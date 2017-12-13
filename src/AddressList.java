import java.util.Stack;

public class AddressList
{
    /**
     This nested, private class represents a node of a singly linked list.
     */
    private class ListNode
    {
        private String name;
        private String tel; // Telephone number
        private String email;
        private String addr; // Address
        private String dob; // Date of birth
        private ListNode next; // Pointer to the next node

        private ListNode(String name, String tel, String email, String addr, String dob)
        {
            this.name = name;
            this.tel = tel;
            this.email = email;
            this.addr = addr;
            this.dob = dob;
        } // end of the constructor

        public String getName() { return name; }
        public String getTel() { return tel; }
        public String getEmail() { return email; }
        public String getAddr() { return addr; }
        public String getDob() {return dob; }

        public void setName(String name) { this.name = name; }
        public void setTel(String tel) { this.tel = tel; }
        public void setEmail(String email) { this.email = email; }
        public void setAddr(String addr) { this.addr = addr; }
        public void setDob(String dob) { this.dob = dob; }

        public boolean hasNext(){return !(next==null)?true:false;}
        public ListNode getNext() { return next; }
        public void setNext(ListNode link) { next = link; }
    } // end of class ListNode
// =====================================
    public ListNode front=null;

    private ListNode current = front;
    private Stack<String> set = new Stack<String>();
    private String cat="";
    private int size=0;
    private ListNode temp = null;
    private ListNode newcurent=temp;


    public AddressList (){
    }
    public Boolean isEmpty(){
        return (front==null)?true:false;
    }
    public void addToFrount(String name, String tel, String email, String address, String dob){
        ListNode temp = new ListNode(name, tel, email, address, dob);
        if(front==null){
            front= temp;
            current=front;
        }else {
            temp.setNext(front);
            front = temp;
            current=front;
        }
    }
    public void addToBack(String name, String tel, String email, String address, String dob){
        if(front==null){
            front= (new ListNode(name,tel,email,address,dob));
            current=front;
        }else {
        if(current.getNext()==null){
            current.setNext(new ListNode(name,tel,email,address,dob));
            current=front;
        }else {
            current= current.getNext();
            addToBack(name, tel, email, address, dob);
        }
        }
    }

    public String toString() {
        if (front==null) {
            if (current.getNext() == null) {
                cat += current.getName() + current.getAddr() + current.getTel() + current.getEmail() + current.getDob() + "\n";
                current = front;
                String temp = cat;
                cat = "";
                return temp;
            } else {
                cat += current.getName() + current.getAddr() + current.getTel() + current.getEmail() + current.getDob() + "\n";
                current = current.getNext();
                return toString();
            }
        }else {
            return null;
        }

    }

    public int sizeOf(){
        if (front==null){
            return 0;
        }
        if (current.getNext()==null){
            size++;
            current= front;
            int temp = size;
            size=0;
            return temp;
        }else {
            size++;
            current=current.getNext();
            return sizeOf();
        }

    }

    public String reversToString() {
        if (!current.hasNext())
        {
            set.push(cat + current.getName() + current.getAddr() + current.getTel() + current.getEmail() + current.getDob() + "\n");
            current = front;
            while (!set.empty()){
                cat+=set.pop();
            }
            String temp = cat;
            cat = "";
            return temp;
        } else {
            set.push(cat + current.getName() + current.getAddr() + current.getTel() + current.getEmail() + current.getDob() + "\n");
            current = current.getNext();
            return reversToString();
        }

    }

    public String phoneNumberByName(String _name){
        if(!current.hasNext()||current.getName()==_name){
            String temp=current.getTel();
            current=front;
            return (!current.hasNext())?null:temp;
        }else{
            return phoneNumberByName(_name);
        }
    }

    public String emailByName(String _name){
        if(!current.hasNext()||current.getName()==_name){
            String temp=current.getEmail();
            current=front;
            return (!current.hasNext())?null:temp;
        }else{
            current=current.getNext();
            return emailByName(_name);
        }
    }

    public String dobByName(String _name){
        if(!current.hasNext()||current.getName()==_name){
            String temp=current.getDob();
            current=front;
            return (!current.hasNext())?null:temp;

        }else{
            current=current.getNext();
            return dobByName(_name);
        }
    }

    public String nameByPhoneNumber(String _Tel){
    if(!current.hasNext()||current.getTel()==_Tel){
        String temp=current.getName();
        current=front;
        return (!current.hasNext())?null:temp;
    }else{
        current=current.getNext();
        return nameByPhoneNumber(_Tel);
    }
}
public void revers(){
        if (front!=null) {
            ListNode temp2 = null;
            if (current.getNext() != null) {
                temp2 = new ListNode(current.name, current.tel, current.email, current.addr, current.dob);
                current = current.getNext();
                revers();
            } else {
                temp2 = new ListNode(current.name, current.tel, current.email, current.addr, current.dob);
            }
            if (temp == null) {
                temp = temp2;
                newcurent = temp;
            } else {
                while (newcurent.getNext() != null) {
                    newcurent = newcurent.getNext();
                }
                newcurent.setNext(temp2);
                newcurent = temp;
            }
            front = temp;
            current = front;
        }
}

//======================================
} // end of class AddressList