package Infosys;
class Square{
	static int dp[][]=new int[300][300];
	public static int minimum(int m,int n)
	{
		int hm=Integer.MAX_VALUE;
		int vm=Integer.MAX_VALUE;
		if(m==n)
		{
			return 1;
		}
		if(dp[m][n]!=0)
		{
			return dp[m][n];
		}
		for(int i=1;i<=m/2;i++)
		{
			hm=Math.min(minimum(i,n)+minimum(m-i,n),hm);
		}
		for(int j=1;j<=n/2;j++)
		{
			vm=Math.min(minimum(m,j)+minimum(m,n-j), vm);
		}
		dp[m][n]=Math.min(vm, hm);
		return dp[m][n];
	}
	public static void main(String[] args) {
		int a=10;
		int b=19;
		System.out.println(minimum(a,b));
	}
}
