package bitmagic;

public class RightMostDifferentBit {
    public static int posOfRightMostDiffBit(int m, int n)
    {
    	System.out.println(m ^ n);
            
        // Your code here
        if( m == 0 && n == 0){
            return 0;
        }
        int to = 0;
        if( m == 0){
            to = n;
        }else if( n == 0){
            to = m;
        }else{
            to = m ^ n;
        }
        System.out.println(to);
        int count = 0;
        while( to > 0){
            if( ( to & 1) != 1){
                count++;
            }
            to >>= 1;
        }
        return count + 1;
            
    }

}
