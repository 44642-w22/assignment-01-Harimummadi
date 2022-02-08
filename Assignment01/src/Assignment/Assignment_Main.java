package Assignment;

import java.util.*;

public class Assignment_Main {

	public static void main(String[] args) {
		LinkedList<Integer> L1 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of input numbers for problem-1");
		int pf = sc.nextInt();
		System.out.println("Enter the numbers :");
		for (int i = 0; i < pf; i++) {
			L1.add(sc.nextInt());
		}
		System.out.println("Input (L1) : " + L1);
		Assignment_Methods prfctnum = new Assignment_Methods();
		L1 = prfctnum.prblm_1(L1);
		System.out.println("Output (L2) : " + L1);

		System.out.println("------------------------------------------");
		LinkedList<Integer> L2 = new LinkedList<>();
		System.out.println("Enter the count of Input list for problem-2 ");
		int al = sc.nextInt();

		System.out.println("Enter the numbers into the list :");
		for (int i = 0; i < al; i++) {
			L2.add(sc.nextInt());
		}
		System.out.println(" Input (L1) :" + L2);
		System.out.println("Enter the number for constant K ");
		int y = sc.nextInt();
		System.out.println("Output (L2) :" + prfctnum.prblm_2(L2, y));

		System.out.println("------------------------------------------");
		ArrayList<Integer> list3 = new ArrayList<>();
		System.out.println("Enter the size of Array list for problem-3");
		int al1 = sc.nextInt();
		System.out.println("Enter the Values into Array list :");
		for (int i = 0; i < al1; i++) {
			list3.add(sc.nextInt());
		}
		System.out.println("Output : " + prfctnum.prblm_3(list3));

		System.out.println("------------------------------------------");
		ArrayList<String> L4 = new ArrayList<>();
		System.out.println("Enter the size of String Array List for problem-4");
		int n3 = sc.nextInt();
		System.out.println("Enter the values into String Array List :");
		for (int i = 0; i < n3; i++) {
			L4.add(sc.next());
		}
		System.out.println("Output (A2) :" + prfctnum.prblm_4(L4));

		System.out.println("------------------------------------------");
		System.out.println("Enter the String pattern for problem-5");
		String str = sc.next();
		System.out.println("Output:" + prfctnum.prblm_5(str));

		System.out.println("------------------------------------------");
		Stack<Integer> Stck1 = new Stack<>();
		System.out.println("Enter the size of Input Stack for problem-6");
		int n4 = sc.nextInt();
		System.out.println("Enter the Values into Stack");
		for (int i = 0; i < n4; i++) {
			int n5 = sc.nextInt();
			Stck1.push(n5);
		}
		System.out.println("Output (A) :" + prfctnum.prblm_6(Stck1));

		System.out.println("------------------------------------------");
		Queue<String> Que1 = new LinkedList<>();
		System.out.println("Enter the Size of Input Queue List for problem-7");
		int n6 = sc.nextInt();
		System.out.println("Enter the values into queue list");
		for (int i = 0; i <= n6; i++) {
			Que1.add(sc.nextLine());
		}
		System.out.println("Output (A):" + prfctnum.prblm_7(Que1));

		System.out.println("------------------------------------------");
		Deque<Integer> qnt = new ArrayDeque<>();
		System.out.println("Enter the Size of Input Queue List for problem-8");
		int n7 = sc.nextInt();
		System.out.println("Enter the values into queue list");
		for (int i = 0; i < n7; i++) {
			int vlue = sc.nextInt();
			qnt.add(vlue);
		}
		List<Integer> l = prfctnum.getAlternativeSeq(qnt);
		System.out.println("Output:" + l);

		System.out.println("------------------------------------------");
		Queue<Integer> qut = new ArrayDeque<>();
		System.out.println("Enter the Size of Input Queue List for problem-9");
		int n8 = sc.nextInt();
		System.out.println("Enter the values into queue list");
		for (int i = 0; i < n8; i++) {
			int vle = sc.nextInt();
			qut.add(vle);
		}
		List<Integer> lt = prfctnum.getEvenOdd(qut);
		System.out.println("Output (A):" + lt);

		System.out.println("------------------------------------------");
		Deque<Character> quet = new ArrayDeque<>();
		System.out.println("Enter the number of characters you want to enter");
		int n11 = sc.nextInt();
		System.out.println("Enter the charcaters for problem-10");
		for (int i = 0; i < n11; i++) {
			char c = sc.next().charAt(0);
			quet.add(c);
		}
		System.out.println("Enter the Size of Input Dueue List for problem-10");
		int n9 = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		System.out.println("Enter the values into dueue list");
		for (int i = 0; i < n9; i++) {
			int vlu = sc.nextInt();
			a.add(vlu);
		}

		String opt = prfctnum.getDeque(quet, a);
		System.out.println("Output (A):" + opt);

	}
}
