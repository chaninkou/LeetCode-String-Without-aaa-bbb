package stringWithout;

public class Main {
	public static void main(String[] args){
		int A = 4;
		int B = 1;
		
		System.out.println("A: " + A + " B: " + B);
		
		System.out.println("Solution: " + strWithout3a3b(A,B));
	}
	
	
    public static String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder(A + B);
        
        // Just stating a = 'a' and b = 'b'
        char a = 'a';
        char b = 'b';
    
        int first = A;
        int second = B;
        
        if(B > A){
            a = 'b';
            b = 'a';
            first = B;
            second = A;
        }
        
        // first-- will run after checking first > 0
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
