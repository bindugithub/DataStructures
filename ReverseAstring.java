public class ReverseAstring {
    public static void main(String[] args){
        ReverseAstring rs = new ReverseAstring();
        System.out.println("The reverse of a string is : " +rs.ReverseString("DORA is BIRA's baby"));
    }
    public String ReverseString(String s){
        StringBuilder r = new StringBuilder();
        for(int i = s.length()-1; i >=0; i-- ){
            r.append(s.charAt(i));
        }
        return r.toString();
    }
}
