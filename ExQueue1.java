
class Queue {
    private static int front, rear, size;
    private static int queue[];
 
    Queue(int s)
    {
        front = rear = 0;
        size = s;
        queue = new int[size];
    }
 
    //to add element
    void queueEnqueue(int data)
    {
        // check queue is full
        if (size == rear) {
            System.out.println("Queue is full");
            return;
        }

        else {
            queue[rear] = data;
            rear++;
        }
        
    }
 
    //remove an element
    void queueDequeue()
    {
        // check queue is empty
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
 
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            
            rear--;
        }
        
    }
 
    // print queue elements
    void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
 
        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.println(queue[i]+" ");
        }
        
    }
 
    // print front of queue
    void queueFront()
    {
        if (front == rear) {
            System.out.printf("Queue is Empty");
            return;
        }
        System.out.printf("Front Element is: %d", queue[front]);
        
    }
}


public class ExQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a queue of capacity 4
        Queue q = new Queue(4);
 
        
        q.queueDisplay();
 
        // inserting elements in the queue
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);
 
        // print Queue elements
        q.queueDisplay();
 
        // insert element in the queue
        q.queueEnqueue(60);
 
        // print Queue elements
        q.queueDisplay();
 
        q.queueDequeue();
        q.queueDequeue();
        System.out.println();
        System.out.println("after two node deletion");
 
        // print Queue elements
        q.queueDisplay();
 
        // print front of the queue
        q.queueFront();
	}

}
