public class MergeTwoStrings {
    public static void main(String[] args){
        MergeTwoStrings m = new MergeTwoStrings();
        System.out.println(m.mergeString("Bindu", "RaviThutari"));


    }
    public String mergeString(String s1, String s2){
        StringBuilder result = new StringBuilder();
        int i =0; int j =0;
        while(i<s1.length() && j<s2.length() ){
            result.append(s1.charAt(i)).append(s2.charAt(j));
            i++;
            j++;
        }
        while(i<s1.length()){
            result.append(s1.charAt(i));
            i++;
        }
        while(j<s2.length()){
            result.append(s2.charAt(j));
            j++;
        }
        return result.toString();

        }

}
