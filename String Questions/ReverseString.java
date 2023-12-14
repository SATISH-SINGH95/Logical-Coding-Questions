class ReverseString {
    
    public static void main(String[] args) {
        String name = "Satish";
        String temp = "";
        char ch ;
        for(int i=0; i<name.length(); i++){
            ch = name.charAt(i); 
            temp = ch + temp;
        }
        System.out.println(temp);
    }
}