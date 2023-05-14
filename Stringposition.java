public class Stringposition {
        public static void main(String[] args){
            Stringposition p = new Stringposition();
            System.out.println(p.interChangeString("This is a string", 5));

        }

        public String interChangeString(String s, int n){
            return s.substring(n) + " " + s.substring(0,n);
        }

        public String interChangeStringTwo(String sen, int n ){
            StringBuilder result = new StringBuilder();
            for(int i =n; i<sen.length(); i++){
                result.append(sen.charAt(i));
            }
            result.append(" ");
            for(int i=0; i<n;i++){
                result.append(sen.charAt(i));
            }
            return result.toString();

        }
    }
