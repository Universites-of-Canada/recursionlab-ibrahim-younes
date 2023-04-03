public class Main {
    public static void main(String[] args) {
        Consonants c = new Consonants();
        String s = "Hello, World!";
        int count = c.countConsonant(s);
        System.out.println("Count of consonants: " + count);

        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrs(str, 0, n - 1, n));

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println("Original stack: " + stack);
//        reverse(stack);
//        System.out.println("Reversed stack: " + stack);
    }


    //helper function
    public static boolean isConsonant(char ch){
      return false;
    }
    public static int totalConsonants(String str){
       return 0;
    }

    public static int countSubstrs(String str, int i,int j, int n){
        // base cases
        return 0;
    }

}