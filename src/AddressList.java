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
    public ListNode front =null;
    private ListNode current = front;
    private String cat="";
    private int vale;
    public AddressList (String name, String tel, String email, String address, String dob){

    }
    public void addToBack(String name, String tel, String email, String address, String dob){
        if(!current.hasNext()){
            current.setNext(new ListNode(name,tel,email,address,dob));
            current=front;
        }else {
            current= current.getNext();
        }
    }

    /**
     *
     * @return String of data in list.
     */
    public String toString() {
        if (!current.hasNext()) {
            current = front;
            String temp = cat;
            cat = "";
            return temp;
        } else {
            cat += cat + current.getName() + current.getAddr() + current.getTel() + current.getEmail() + current.getDob() + "\n";
            current = current.getNext();
            toString();
        }
        return null;
    }
    public int sizeOf(){
        if (current.hasNext())

    }

//======================================
} // end of class AddressList