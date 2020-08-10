import java.io.*;
class Hide
{

	//Hides message in image
	public static void  Hide(int a1[] ,int h1)
	{
          	for(int i=0;i<8;i++)
	{
		int d=h1%2;
		if(d==1)
			a1[i]=a1[i]|1;
		else
			a1[i]=a1[i]&254;
			h1=h1/2;				
	}
	} 
	public static void HideLength(int a[],int len,int pos)
	{
		for(int i=0;i<=31;i++)
		{
			int d=len%2;
			len=len/2;
			if(d==1)
			a[pos+i]=a[pos+i]|1;
			else
			a[pos+i]=a[pos+i]&254;
		}
		
	}
	public static void Stegano( String source,String target,String password,String msg)throws Exception
	{
		
        	String s1=password;
	String s2=msg;	//message
	int len=s2.length();	//lenth of message
	System.out.println("Initial Length="+len);
	
         	FileInputStream f1=new FileInputStream(source);
           	FileOutputStream f2=new FileOutputStream(target);
	
	//Copy 54 Bytes of Data
          	byte b[]=new byte[54];
           	f1.read(b);
         	f2.write(b);
	
	//Append Spaces to Password 		           
          	int r=32-s1.length();
	for(int i=1;i<=r;i++)
	s1=s1+" ";
	
	//Hides password in image
       	for(int i=0;i<32;i++)
     	{
		int a2[]=new int[8]; 
		int h2=(int)s1.charAt(i); 
            		for(int k=0;k<8;k++)
        		 a2[k]=f1.read();              
	
		 Hide(a2,h2);
             		 for(int m=0;m<8;m++)
	 	 f2.write(a2[m]);
	   			
          	}

	//Hides 4 bytes of length 
	int a[]=new int[32];
              	for(int i=0;i<32;i++)
	a[i]=f1.read();						
	
	HideLength(a,len,0);
	for(int i=0;i<32;i++)
	f2.write(a[i]);	

	//Hides message in image
	for(int i=0;i<s2.length();i++)
	{
		int a1[]=new int[8];
             		int h1=(int)s2.charAt(i); 
            		for(int k=0;k<8;k++)
        			a1[k]=f1.read();              
	
		Hide(a1,h1);
             		for(int m=0;m<8;m++)
			f2.write(a1[m]);
         	}

	int ch;
	while((ch=f1.read())!=-1)
	f2.write(ch);
	f1.close(); 
	f2.close();              
	}
	
}