package override;

public class a{
	int i,j;
	a(int x,int y)
	{
		i=x;
		j=y;
	}

	void show()
	{
		System.out.println("i"+i+ "and j"+j);
	}
	
}
	class b extends a
	{
		int k;
		b(int x, int y,int z) {
			super(x, y);
			k=z;
			// TODO Auto-generated constructor stub
		}
		void show()
		{
			super.show();
			System.out.println("k"+k);
		}
		
	}

	class override1
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b sub1=new b(1,2,3);
		sub1.show();
	}

}


