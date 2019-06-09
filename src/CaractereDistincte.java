import java.util.Scanner;

public class CaractereDistincte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        noDuplicates1(s);
        noDuplicates2(s);
    }

    private static boolean noDuplicates1(String s){
        for(int i=0;i<s.length()-1;i++){
            for(int j=1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)) return false;
            }
        }

    }
    private static boolean noDuplicates2(String s){
        while (s.length()!=0){
            String s1=s;
            s=s.replaceAll(s.charAt(0)+"", "");
            if(s1.length()-s.length()!=1) return false;
        }
        return true;

    }

}
