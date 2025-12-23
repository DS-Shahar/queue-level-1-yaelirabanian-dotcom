public class Main {
	public static void main(String[] args) { 
    Queue<Integer> q = new Queue<Integer>();
    q.insert(2);
		q.insert(3);
		q.insert(5);
		q.insert(1);
		q.insert(1);
		q.insert(8);
    System.out.println(q);
        
		Queue<Integer> q1 = new Queue<Integer>();
		q1.insert(14);
		q1.insert(33);
		q1.insert(25);
		q1.insert(40);
		q1.insert(100);
    
    System.out.println(q1);
    System.out.println("q_1: "+q_1(q1));
    System.out.println("q_2: "+q_2(q1));
    System.out.println("q_3: "+q_3(q1, 200));
    System.out.println("q_4: "+q_4(q, q1));
    System.out.println("q_5: "+q_5(q, 1));
	}
	
	public static <T> Queue<T> q_1(Queue<T> q1) {
    Queue<T> q2 = new Queue<T>();
    Queue<T> q3 = new Queue<T>();
    while(!q1.isEmpty()) {
      q2.insert(q1.head());
      q3.insert(q1.remove());
    }
    while(!q3.isEmpty())
      q1.insert(q3.remove());
    return q2;
	}
	
	public static double q_2(Queue<Integer> q1) {
    Queue<Integer> q2 = q_1(q1);
    int i=0;
    double sum=0;
    while(!q2.isEmpty()) {
      sum=sum+q2.remove();
      i++;
    }
    return sum/i;
	}
	
	public static int q_3(Queue<Integer> q1, int x) {
    Queue<Integer> q2 = q_1(q1);
    int i=0;
    while(!q2.isEmpty()) {
      if((x%q2.remove())==0)
        i++;
    }
    return i;
	}
	
	public static boolean q_4(Queue<Integer> q1, Queue<Integer> q2) {
    Queue<Integer> q4 = q_1(q1);
    while(!q4.isEmpty()) {
      Queue<Integer> q3 = q_1(q2);
      boolean i=false;
      int x=q4.remove();
      while(!q3.isEmpty()) {
        if (q3.remove()%x==0)
          i=true:
      }
      if (!i)
        return false;
      return true;
	}
	
	
	public static <T> boolean q_5(Queue<T> q1, T x) {
    Queue<T> q2= q_1(q1);
    int i=0;
    while(!q2.isEmpty()) {
      if(q2.remove().equals(x))
        i++;
      else
        i=0;
      if (i>1)
        return true;
    }
    return false;
	}
}
