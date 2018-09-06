import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		System.out.println("enter 1st row size");
		int n=o.nextInt();
		System.out.println("enter 1sd column size");
		int m=o.nextInt();
		int [][]a=new int[n][m];
		System.out.println("enter 2nt row size");
		int p=o.nextInt();
		System.out.println("enter 2nd column size");
		int q=o.nextInt();
		int [][]b=new int[p][q];
		int [][]c=new int[p][q];
		System.out.println("enter 1st matrix elements");
		if(n==q)
		{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=o.nextInt();
			}
			System.out.println();
		}
		System.out.println("enter 2nd matrix element");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				b[i][j]=o.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int i = 0; i <a.length; i++) {
            for (int j = 0; j <b.length; j++) {
                for (int k = 0; k <a.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		}
		else
		{
			System.out.println("invalid matrix");
		}
			}

}
