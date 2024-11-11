class K 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("vijay  kumar");
		System.out.println(sb);
		sb.deleteCharAt(5);
		System.out.println(sb);
		sb.replace(6, 11, "excelr");
		System.out.println(sb);
	}
}
