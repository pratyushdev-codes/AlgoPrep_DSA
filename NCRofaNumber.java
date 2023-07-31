//NCR and NPR using function 


import java.util.*;

public class NCRofaNumber{
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();

        int nfact = fact(n);
        int rfact = fact(r);
        int nmrfact = fact(n-r);
		
		int npr=nfact/nmrfact;
		int ncr=nfact/(rfact*nmrfact);

		System.out.println(nfact);
		System.out.println(npr);
        System.out.println(ncr);
        }
    public static int fact(int n){
        int ans = 1;
        
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
}


