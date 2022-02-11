08. Read about the Circular Queue and Deque and Implement One of Them

import java.util.*;

public class ExCircQue {
	
	//Declaring variables for front,size and rear of a circular queue
	private int size,front,rear;
	
	
	
	//Declaring array list
	private ArrayList<Integer> ar=new ArrayList<>();

	
	
	public ExCircQue(int size){
		this.size=size;
		this.front=this.rear=-1;
	}
	
	
	
	public void enqueue(int data) {
		
		//To check whether the queue is empty
		if(front==-1 && rear==-1){
			front=0;  
		    rear=0;  
		    ar.add(rear,data); 
		    }  
		
		// condition to check queue is full
		else if((rear+1)%size==front)    {
			System.out.println("Queue is overflow..");  
		    }  
		
		else {  
		    //Rear is incremented
		    rear=rear+1;        
			ar.add(rear,data); 
		}  
	
	}
	
	public void dequeue() {
		
		// condition to check queue is empty
		if((front==-1) && (rear==-1))   
			{  
			System.out.println("\nQueue is underflow..");  
	    }  
		
		else if(front==rear)  	{  
			System.out.println("The dequeued element  "+ ar.get(front));  
			front=-1;  
			rear=-1;  
		}   
		
		else  
		{  
			System.out.println("\nThe dequeued element is "+ ar.get(front));  
			front=(front+1)%size;  
		}  
	}
	
	
	
	public void displayQueue()
	{
	     
		int i=front;  
		System.out.println(rear);
	    if(front==-1 && rear==-1)  
	    {  
	        System.out.println("\n Queue is empty..");  
	    }  
	    else  
	    {  
	    	System.out.println("\nElements in a Queue are :");  
	        while(i<=rear)  
	        {  
	        	System.out.println(ar.get(i));  
	            i=i+1;  
	        }  
	    }  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initializing Scanner class object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of circular queue");
		int n = sc.nextInt();
		
		ExCircQue en = new ExCircQue(n);
		
		en.enqueue(1);
		en.enqueue(2);
		en.enqueue(3);
		en.displayQueue();
		en.enqueue(4);
		en.dequeue();
		en.enqueue(4);
		en.displayQueue();
		en.enqueue(4);
		
		
		sc.close();
	}

}
