package DataStructures;

public class QueueTest {
  public static void testQueue1(){
        Queue q1 = new Queue(5);

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);

        int x1 = q1.dequeue();
        int x2 = q1.dequeue();

        q1.enqueue(50);
        q1.enqueue(60);

        int peekValue = q1.peek();
        int size = q1.getLength();

        int x3 = q1.dequeue();
        int x4 = q1.dequeue();
        int x5 = q1.dequeue();
   
        assert(x5 == 50);
        assert(q1.peek()==60);
    }

    public static void testQueue2(){
        Queue q2 = new Queue(6);
        q2.enqueue(1);
        q2.enqueue(2);
        q2.enqueue(3);
        q2.enqueue(4);
        q2.enqueue(5);
        q2.enqueue(6);
        assert(q2.getLength()==6);
     
        int x1 = q2.dequeue();
        int x2 = q2.dequeue();
        int x3 = q2.dequeue();
        int x4 = q2.dequeue();
        int x5 = q2.dequeue();
        int x6 = q2.dequeue();
        assert(x1==1);
        assert(x6==6);
        assert(q2.getLength()==0);

    }


     public static void testQueue3()  {
         Queue q3 = new Queue(3);
         assert(q3.isEmpty());
         q3.enqueue(2);
         q3.enqueue(4);
         q3.enqueue(6);
         assert(q3.isFull());
         q3.dequeue();
         q3.dequeue();
         q3.dequeue();
         assert(q3.isEmpty());
    }
    
    
      public static void testQueue4()  {
        Queue q4 = new Queue(3);
        assert(q4.isEmpty());
    }

       public static void testQueue5() {
        Queue q = new Queue(2);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3); 
    }
    
    public static void testQueue6() {
        Queue q = new Queue(2);
        q.enqueue(1);
        q.dequeue();
        q.dequeue(); 
    }
    
     public static void testQueue7() {
        Queue q = new Queue(2);
        q.peek(); 
    }
    
      public static void testQueue8() {
        Queue q = new Queue(0);
        assert(q.isEmpty());
        assert(q.getLength()==0);
    }
    
    
      public static void testQueue9(){
        int size = 100;
        Queue q = new Queue(size);
        for (int i = 0; i < size; i++) {
            q.enqueue(i);
        }
        assert(q.getLength() == size);
        for (int i = 0; i < size; i++) {
            assert(q.dequeue() == i);
        }
        assert(q.isEmpty());
    }
    
    
    
        public static void main(String[] args)  {
        testQueue1();
        testQueue2();
        testQueue3();
        testQueue4();
        testQueue5();
        testQueue6();
        testQueue7();
        testQueue8();
        testQueue9();
  
    }
}


