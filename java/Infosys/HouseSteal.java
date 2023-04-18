package Infosys;
class HouseSteal
{
	public static void main(String[] args) {
		int[] arr={4,7,1,9,10,35,62,34};
		int[] dp=new int[arr.length];
		
		int max=Integer.MIN_VALUE;
		dp[0]=arr[0];
		dp[1]=arr[1];
		for(int i=2;i<dp.length;i++)
		{
			dp[i]=Math.max(dp[i-2]+arr[i], dp[i-1]);
		}
		
		System.out.println(dp[dp.length-1]);
	}
}



