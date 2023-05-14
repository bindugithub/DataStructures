import java.util.HashMap;

public class InterviewQues {
    public static void main(String[] args){
        // InterviewQues i = new InterviewQues();
       // InterviewQues.countChar("aaaabbbccd");
        System.out.println(countCharTwo("aaaabbbccdaaccddd"));


    }

    public static String countChar(String s){
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
          map.put(c, map.getOrDefault(c,0)+1);

           }
        System.out.println(map);
        for(char c: map.keySet()){
            result.append(c).append(map.get(c));

        }
        System.out.println(result);
        return result.toString();

    }
    public static String countCharTwo(String s) {
        char temp = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        //sb.append(temp);

        int count = 1 ;
        for(int i = 1; i<s.length(); i++) {
            if(s.charAt(i) == temp) {
                count ++;
            } else {
                sb.append(temp);
                sb.append(count);
                temp = s.charAt(i);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        sb.append(count);
        return  sb.toString();

    }


}
