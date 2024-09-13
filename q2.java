public class q2{
    static int prime[]=new int[20005];
    static boolean not_prime[]=new boolean[20005];
    static int cnt=0;
    void get_prime(int n){
        for(int i=2;i<=n;i++){
            if(!not_prime[i])prime[cnt++]=i;
            for(int j=0;prime[j]<=n/i;j++){
                not_prime[prime[j]*i]=true;
                if(i%prime[j]==0)break;
            }
        }
    }
    public static void main(String[] args){
        q2 q=new q2();
        q.get_prime(20000);
        for(int i=0;i<cnt;i++){
            System.out.print(prime[i]);
            if(i%5==4)System.out.println();
            else System.out.print(" ");
        }
    }
}
