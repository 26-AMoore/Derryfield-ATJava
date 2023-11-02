public class WeirdComparisons {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hell";
        String s3 = s1.substring(0, s2.length());

        if (s1 == s1){
            System.out.println("s1 = s1");
        }

        if (s2 == s3){
            System.out.println("They the same");
        }
        
        if (s2.equals(s3)){
            System.out.println("They are the same but whacko");
        }
    }
}