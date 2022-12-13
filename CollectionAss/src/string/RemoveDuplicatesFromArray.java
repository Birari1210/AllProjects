package string;

public class RemoveDuplicatesFromArray 
{
	public static void main(String[] args) 
	{
		int a[]= {20,30,20,10,40,50,10,100,50};
//		List<String> name = new ArrayList<String>();
//		name.add("akash");
//		name.add("bb");
//		name.add("akhhhash");
//		name.add("ii");
//		name.add("kkk");
//		
//		System.out.println(name);
	
		
//		Set< Integer> set = new HashSet<Integer>();
		
//		for (int i = 0; i < a.length; i++)
//		{
//			set.add(a[i]);
//		}
//		for (Integer s : set) 
//		{
//			System.out.print(s+" ");
//		}

		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1;j<a.length; j++) 
			{
			   if(a[i]==a[j])
			   {
				   count++;
				   
			   }
			}
		}
		System.out.println(count);
		
			int b[] = new int[a.length-count];
			int index = 0;
			
			for(int i=0;i<a.length;i++)
			{
				int cnt=0;
				for(int j=0;j<i;j++)
				{
					if(a[i]==a[j])
					{
						cnt++;
					}
				}
				if(cnt==0)
				{
					b[index++]=a[i];
				}
			
			}
			for(int i=0;i<b.length;i++)
			{
			System.out.println(b[i]);
			}
	}
			
}
