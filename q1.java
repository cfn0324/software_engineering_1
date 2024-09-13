import java.util.Scanner;

public class q1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数组:");
        double sum=0.0;
        double ans=0.0;
		while(scan.hasNextDouble()){
			double x = scan.nextDouble();
			sum=sum+x;
            if(sum<0){
                sum=0.0;
            }
            ans=Math.max(sum,ans);
		}
        System.out.println(ans);
	}
}
