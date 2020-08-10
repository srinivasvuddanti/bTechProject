import java.io.*;
class Recover
{
	public  String pass;
	public  String msg="";
	
	public  void Recover(String img)throws Exception
	{
		
		pass="";
     		FileInputStream f1=new FileInputStream(img);
           
          		f1.skip(54);
               		int len=0;       
     	
           		//Recover password
         		 for(int i=0;i<32;i++)
         		 {
            			int a1[]=new int[8];
              		    	for(int k=0;k<8;k++)
        			a1[k]=f1.read();              
	
	     		 int r=Recov(a1);
			pass+=(char)r;
		}
		pass=pass.trim();

		//Recover length of message
		len=0;
		int p=1;
		for(int i=0;i<32;i++)
		{
			int n=f1.read();
			int d=n%2;
			len=len+d*p;
			p=p*2;
		}
		
		System.out.println("Length="+len);

		//Recover message
		for(int i=0;i<len;i++)
       		{
          	   		int a1[]=new int[8];
                         	  	for(int k=0;k<8;k++)
        				a1[k]=f1.read();              
	
	    		int r=Recov(a1);
			msg+=(char)r;

     	  	}
		f1.close(); 
	}

	public int  Recov(int a1[])
	{
		 int e=0,p=1;
      		 for(int i=0;i<8;i++)
		{
			int d=a1[i]%2;
			e=e+d*p;				
			p=p*2;
		}
		
		return(e);
	} 
}