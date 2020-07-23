package leetcode984;

public class GetStringWithoutThree {
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder(A + B);
        
        // Just stating a = 'a' and b = 'b'
        char a = 'a';
        char b = 'b';
    
        int first = A;
        int second = B;
        
        // Smart way to make first as B without more code
        if(B > A){
            a = 'b';
            b = 'a';
            first = B;
            second = A;
        }
        
        // first will decease after checking first > 0
        while(first-- > 0){
            sb.append(a);
            
            if(first > second){
                sb.append(a);
                first--;
            }
            
            if(second-- > 0){
                sb.append(b);
            }
        }
        
        return sb.toString();
    }
}
