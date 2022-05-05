import java.util.*;
class LList{
	static int n;
	static Node A[]=new Node[n];
	static int test_case;
	static {
	Scanner s =new Scanner(System.in);
	test_case=s.nextInt();
	n=s.nextInt();
	//A[] = new Node[n];
	
	}
static class Node{
	int data;
	Node next;
	Node(int d){//Constructor
		data=d;
		next=null;
	}
}
 static Node reverse(){
	 for(int i=n-1 ; i>0; i--){
		A[i].next=A[i-1];
	}
	A[0].next=null;
	return A[n-1];
 }
public static void main(String [] args){
Scanner sc =new Scanner(System.in);
	
for(int i=0 ; i<n ; i++){
			A[i]=new Node(sc.nextInt());
	}
	Node head=A[0];
	for(int i=0 ; i<n-1; i++){
		A[i].next=A[i+1];
	}
	A[n-1].next=null;

	System.out.println("---------");
	
	
	/* Node second=new Node(10);
	head.next=second;
	second.next=null; */
	System.out.println("Output");
	Node temp=head;
		// System.out.println();
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println("\nAfter reversing");
		
	head=temp=reverse;
	while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
	
}
}
