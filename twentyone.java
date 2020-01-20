import java.util.Scanner;
public class Twentyoesticks
{
	public static void main(String args[])
	{
		  Scanner input=new Scanner(System.in);
	    int choice=0;
	    while(choice!=5)
	    {
	        System.out.println("\n 1.PLAY\n2.HELP\n3.ABOUT US\n4.REFERENCE\n.EXIT \n\n ENTER YOUR CHOICE");
	        choice=input.nextInt();
	    	  switch(choice)
	   	    {
		      		case 1:
		        		int no_of_sticks=21;
		       			System.out.println("\n\n Do you want to play first?(Y/N)");
					      Scanner sc=new Scanner(System.in);
				        String first_attempt=sc.nextLine();
				        Scanner read_next=new Scanner(System.in);
				        int input_num=0;
				        while(no_of_sticks>0)
	        			{
		        			if(first_attempt.equals("Y")||first_attempt.equals("y"))
		        			{
			         			System.out.println("currently "+no_of_sticks+" sticks are available");
			        			System.out.println("\n Pick your sticks (1 or 2)");
			         			input_num=read_next.nextInt();
			        			if(input_num>2)
			         			{
			         				input_num=2;
			        			}
			        			else if(input_num<1)
			         			{
				        			input_num=1;
				       			}                                   //no else required as it will look like this else \n { \n }
			           			no_of_sticks=no_of_sticks-input_num;
				        		if(no_of_sticks<=0)
				        		{
					    			System.out.println("\n\n\n YOU HAVE LOST THE GAME\n");
				        		}
			          			else
			         			{
				        			if((no_of_sticks-2)%3==0||(no_of_sticks-2)==0)
				           			{
				        				input_num=1;
				            		}
				           			 else
				            		{
					           			input_num=2;
	                        		}
				         			System.out.println("\n Your opponent picks "+input_num+" sticks");
				        			no_of_sticks=no_of_sticks-input_num;
				        			if(no_of_sticks<=0)
					        		{
						        		System.out.println("\n\n\n YOU HAVE WON THE GAME\n");
					        		}
				        		}
			        		}      
		        			else
		        			{
				        		if((no_of_sticks-2)%3==0||(no_of_sticks-2)==0)
			        			{
					        		input_num=1;
				        		}       
						        else
						        {
							        input_num=2;
						        }
						        System.out.println("\n your opponent picks "+input_num+" sticks");
						        no_of_sticks=no_of_sticks-input_num;
						        if(no_of_sticks<=0)
						        {
							        System.out.println("\n\n\n YOU HAVE WON THE GAME\n");
						        }
						        else
						        {
						        	System.out.println("\n currently "+no_of_sticks+" sticks are available");
							        System.out.println("\n Pick your sticks (1 or 2)");
							        input_num=read_next.nextInt();
					       	        if(input_num>2)
					                {
						                input_num=2;
					                }
						            else if(input_num<1)
						            {
							            input_num=1;
							          }
						            no_of_sticks=no_of_sticks-input_num;
						            if(no_of_sticks<=0)
						            {
						       	        System.out.println("\n\n\n YOU HAVE LOST THE GAME\n");
					              }
			            		}    
			        		}
		        		}
		        		break;
		        
			        case 2:
			             System.out.println("\n\n 1.YOU HAVE 21 STICKS");
			             System.out.println("2.THE ONE WHO CHOOSES LAST LOOSES");
			             System.out.println("3.IF YOU ENTER MORE THEN 2 STICKS IT WILL BE TAKEN AS 2");
			             System.out.println("4.IF YOU CHOOSE LESS THAN 1 STICKS IT WILL BE TAKEN AS 1");
			             System.out.println("5.IF YOU ENTER ANY OTHER ALPHABET EXCEPT Y AND N IT WILL BE TAKEN AS N");
			             System.out.println("6.ALL THE BEST\n");
			             break;
		             
			        case 3:
			             System.out.println("\n\n THIS IS A SIMPLE CONSOLE BASED GAME MADE BY A GROUP OF STUDENTS FROM COMPUTER DEPARTMENT OF ST.JOHN COLLEGE OF ENGINEERING AND MANAGEMENT");
			             System.out.println("VEVOOR ROAD");
			             System.out.println("PALGHAR(EAST).\n");
			             break;
			            
			        case 4:
			             System.out.println("\n\n www.ideas_for_mp.com\n www.stackoverflow.com \n");
			             break;
			            
			        case 5:
			             System.out.println("\n SEE YA\n");
			             break;
		           
		      		default:
		          		 System.out.println("invalid choice");
       		}       //end of switch
       }			//end of while
   }				//end of pvsm
}					//end of class
