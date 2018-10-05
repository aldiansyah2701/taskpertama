package paragraf;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class paragrafx
 */
@WebServlet("/paragrafx")
public class paragrafx extends HttpServlet {
	
	String dataA="";
	String dataB="";
	public static String dataparameter="";
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paragrafx() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 
		
		
		
		String test = request.getParameter("masukan");
		dataA = test;
		//response.getWriter().append(test);
		
		//response.getWriter().append("\n ---> \n");

		//response.getWriter().append(htmlFilter(test));
		
		//response(response, test);
		
		//
		
		//String helloString = "aldi";
		//char aChar = 's';
		//helloString +=aChar;
		//System.out.println(helloString);
		
		//String[] nama = new String[5];
		//nama[1] = helloString;
		
		//System.out.println(nama[1]);
		
			dataB = htmlFilter(test);
			
			System.out.println(dataparameter);
			
			request.setAttribute("test1", dataA);
			request.setAttribute("test2", dataB);
			request.setAttribute("test3", dataparameter);
			
			dataparameter="";
			//pisah(dataA);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/form.jsp");
			dispatcher.forward(request, response);

	}
	
	 
	private static String pisah (String katas){
		int xp=0;
		/*while(true){
			String cek = katas;
			String[] cek1 = cek.split(".");
			xp++;
			System.out.println(xp);
		}*/
		
		String str = "asdsadasdds-asdasdasdas";
        String split[] = str.split("-");
        System.out.println("The split parts of the String are");
        for(String s:split){
        	System.out.println(s);	
        }
        
		 return (katas);
	}
	
	   private static String htmlFilter(String message) {
		      if (message == null) return null;
		      int len = message.length();
		      StringBuffer result = new StringBuffer(len + 20);
		      char aChar;
		      String[] data1 = new String[100];
		      String data2="";
		      int x=0; int y=0; int z=0;
		      
		      String[] datbak = new String[100];
		      int bk=0;
		 
		      for (int i = 0; i < len; ++i) {
		         aChar = message.charAt(i);
		         System.out.println(aChar);

		         if(aChar!=' ' && aChar!='.'){
		           data2 +=aChar;
		       
		         }else{
		        	 System.out.print("data masuk :");
		        	 System.out.println(data2);
		             data1[x] = data2;
		             datbak[bk] = data2;
		             data2="";
		             x++;bk++;
		         }
		         
		         if(aChar=='.'){	 
		        	 data1[x] = ".";
		        	 datbak[bk]= "|";
		        	 x++;bk++;
		         }
		       
		      }
		      
		      String xx = "aldi";
		      String yy = "Aldi";
		      if(xx.equals(yy)==true){
		    	  System.out.print("yes");
		      }
		      
		      
		      
		      
		      int flag = 0;
		      int h=0,j=0;
		      String[] katasama = new String[100];
		      for (int i = 0; i<x; i++){
		    	  for(int u = flag; u<=i; u++){
		    		  if(i==0){
		    			  continue;
		    		  }else if(i==flag){
		    			  continue;
		    		  }
		    		  
		    		  
		    		  if(data1[u].equals(data1[i])==true){
		    			  y++;
		    			  
		    			  if(y>1 && data1[u]!="."){
		    				  
		    				  katasama[j]=data1[u];
		    				  j++;

		    				  System.out.print("sama :");
			    			  System.out.println(data1[u]);
			    			  data1[u]="|";

		    			  }else if(data1[u]=="."){
		    				  flag=u+1;
		    				  katasama[j]="|";
		    				  j++;
		    				  
		    			  }else if(y==1){
		    				  System.out.print("index pertama array ke:");
			    			  System.out.println(u);
			    			  
			    			  //
			    			  
		    			  }
		    			  
		    			  
		    		  }
		    		  
		    		  
		    		  //System.out.print(u);
		    		  
		    	  }
		    	  
		    	  if(y>1){
		    		  System.out.print("jumlah :");
	    			  System.out.println(y);
		    	  }
		    	  
		    	  y=0;
		    	 // System.out.println("x");
		      }
		      
		      //ambil keterangan kalimat
		      System.out.println("=================================");
		      String[] katasama1 = new String[100];
		      int q=0,w=0,flagx=0;
		      
		      
		      for(int i=flagx;i<j;i++){
		    	  System.out.print(katasama[i]);
		    	  System.out.println(" ");
		    	  for(int u=0;u<j;u++){
		    		 if(katasama[i]!="|" && katasama[i]!="-"){
		    			 if(katasama[u].equals(katasama[i])==true){
		    				 q++;
			    			  if(q>1 && katasama[u]!="|"){
			    				  katasama[u]="-";
			    			  }
			    			  
			    			  
			    		  }else if(katasama[u]=="|"){
		    				  katasama1[w]=katasama[i];
		    				  w++;
		    				  flagx=u+1;
		    				  }
	    				  
	    			  }
		    		  
		    		  
		    	  }
		    	  q=0;
		      }
		      
		      
		      System.out.println("=================================");
		      int ii=0;
		      int flagy=0;
		      int flagz=0,uu=0;
		      
		      int tt=0;
		      for(int i=0;i<j;i++){
		    	  
		    	  go:{
		    	  
		      
		    	  for(int u=flagy; u<bk; u++){
		    		  
		    		  
		    		  
		    		  if(katasama[i]!="-" && katasama[i]!="|"){
		    			  if(katasama[i].equals(datbak[u])==true){
		    				  //System.out.print(katasama[i]);
				    			ii++;
				    			
				    			if(flagz==0){
				    				uu=u;
				    				flagz=1;
				    				
				    				
				    				
				    			}
				    			 
				    		  }
		    			  if(datbak[u]=="|"){
			    				 System.out.print(katasama[i]);
			    				 System.out.print(" ~ ");
			    				 System.out.print(uu-tt);
			    				 System.out.print(" ~ ");
			    				 System.out.print(ii);
			    				 System.out.printf(" - %d %n", u);
			    				 String indek = Integer.toString(uu-tt);
			    				 String ulangkata = Integer.toString(ii);
			    				 
			    				 System.out.print("hayoooo : ");
			    				 System.out.print(uu-tt);
			    				 System.out.println(ulangkata);
			    				 
			    				 dataparameter = dataparameter.concat("[");
			    				 dataparameter = dataparameter.concat(katasama[i]);
			    				 dataparameter = dataparameter.concat(", ");
			    				 dataparameter = dataparameter.concat(ulangkata);
			    				 dataparameter = dataparameter.concat(", ");
			    				 dataparameter = dataparameter.concat(indek);
			    				 dataparameter = dataparameter.concat("] ");
			    				 
			    				 System.out.println(dataparameter);
			    				 
			    				 
			    				 
			    				 
			    				 flagz=0;
			    				  
			    			 }
		    		  }
		    		  
		    		  if(katasama[i]=="|" && datbak[u]=="|"){
		    				  flagy=u+1;
		    				  tt=u+2;
		    				  System.out.printf(" - %d - %d %n", i,u);
		    				  
		    				  break;
		    		  }
		    		  	if(datbak[u]=="|"){
		    			 break go; 
		    		  }
		    		  
		    	  }
		      } 
		    	  ii=0;
		    	  //System.out.print(katasama[i]);
		    	  //System.out.println(" ");
		      }
		      
		      for(int i=0; i<bk;i++){
		    	  System.out.print(datbak[i]);
		    	  System.out.print(" ");
		    	  if(datbak[i]=="|"){
		    		  System.out.println(i);
		    	  }
		      }
		      System.out.println(" ");
		      
		      System.out.println("=================================");
		      
		      
		      //
		      
		      for(int i=0; i<x; i++){
		    	  if(data1[i]=="|"){
		    		  System.out.print(i);
		    		  for(int u=i; u<x;u++){
		    			  
		    				data1[u]=data1[u+1];
		    		  }
		    		  x--;
		    	  }
		      }
		      for(int i=0; i<x; i++){
		    	  if(data1[i]=="|"){
		    		  System.out.print(i);
		    		  for(int u=i; u<x;u++){
		    			  
		    				data1[u]=data1[u+1];
		    		  }
		    		  x--;
		    	  }
		      }
		      //x=x-z;
		      
		      System.out.println("tes baru");
		      for (int i = 0; i<x; i++){
		    	  System.out.print(i);
		    	  System.out.println(data1[i]);
		      }
		      
		      System.out.println("tes barux");
		      
		      String resultx="";
		      String value ="";
		      for(int i=0; i<x; i++){
		    	  
		    	  if(data1[i] =="."){
		    		  data1[i-1] = data1[i-1].concat(data1[i]);
		    	  }
		    	  
		    	  //System.out.println(data1[i]);
	
		      }
		      
	      for(int i=0; i<x; i++){
		    	  
	    	  	  if(x==1){
	    	  		resultx = data1[i]; 
	    	  	  }
	    	  	  else if(data1[i] !="." && data1[i]!=""){
		    		  resultx = resultx.concat(data1[i]);
		    		  resultx = resultx.concat(" ");
		    	  }
		    	  
		    	  //System.out.println(data1[i]);
	
		      }
		      System.out.println(resultx);
		      return (resultx);
		   }
	   
		
	
	private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        
          
	}

}
