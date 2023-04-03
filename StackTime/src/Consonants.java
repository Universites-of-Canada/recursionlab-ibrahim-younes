// Problem 1
public class Consonants {
    public static boolean isconsonant(char ch){
        ch = Character.toUpperCase(ch);

        return (ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O'|| ch == 'U')
                == false && ch >= 65 && ch <= 90;
    }
    int countConsonant(String s){
        int res = 0;
        for(int i =0;i<s.length();i++){
            if (isconsonant(s.charAt(i))){
                ++res;
            }
        }
        return res;
    }

    // Problem 2
    public static int totalConsonant(String str, int x){
        if (x == 1){
            if (isconsonant(str.charAt(0))) {
                return 1;
            }
            else
                return 0;
        }
        if (isconsonant(str.charAt(x - 1))) {
            return totalConsonant(str, x - 1) + 1;
        }
        else
            return totalConsonant(str, x - 1);
    }


    public static int countSubstring(String str){
        int count = 0;
        int n = str.length();

        for (int i =0; i<n ;i++ ){
            for (int j = i +1;j<=n;j++){
                if (str.charAt(i) == str.charAt(j-1)){
                    count++;
                }
            }
        }
        return count;
    }

    // Count.Problem 2
    public static int CountinueCountSubstring(String str, int i ,int j,int n){
        if(n == 1){
            return 1;
        }
        if(n <=0 ){
            return 0;
        }
        // Getting the count of the substring of the first , middle , last elements.
        int result = CountinueCountSubstring(str,i+1,j,n-1) + CountinueCountSubstring(str,i,j-1,n-1) -
                CountinueCountSubstring(str,i+1,j-1,n-2);

        // if the string at both index i,j are in the same increment.
        if (str.charAt(i) == str.charAt(j)){
            result++;
        }
        return result;
    }
//.................................................................................................................
    //Problem 3
    public class ReverseStack {
        public static void insertAtLast(Stack<Integer> stack, int value) {
            if (stack.isEmpty()) {
                stack.push(value);
            } else {
                int top = stack.pop();
                insertAtLast(stack, value);
                stack.push(top);
            }
        }
        public static void reverse(Stack<Integer> stack) {
            if (!stack.isEmpty()) {
                int top = stack.pop();
                reverse(stack);
                insertAtLast(stack, top);
            }
        }
    }
}
