package Assignment;

import java.util.*;

public class Assignment_Methods {
	private static final int Queue = 0;

	// Problem 1
	public LinkedList<Integer> prblm_1(LinkedList<Integer> L1) {
		LinkedList<Integer> perfect = new LinkedList<Integer>();
		int q = L1.size();
		for (int i = 0; i < q; i++) {
			int num = prftnum(L1.get(i));
			if (num > 1) {
				perfect.add(num);
			}
		}
		return perfect;
	}

	public static int prftnum(int P) {
		if (P == 1) {
			return 1;
		}
		int count = 1;
		for (int i = 2; i < P; i++) {
			if (P % i == 0) {
				count = count + i;
			}
		}
		if (count == P) {
			return P;
		}
		return 0;
	}

	// Problem 2
	public LinkedList<LinkedList<Integer>> prblm_2(LinkedList<Integer> list_1, int L) {
		LinkedList<LinkedList<Integer>> arylst = new LinkedList<LinkedList<Integer>>();

		for (int i = 0; i < list_1.size(); i++) {
			LinkedList<Integer> arylist = new LinkedList<Integer>();

			if (i < list_1.size() - 1) {
				int value1 = list_1.get(i);
				int value2 = list_1.get(i + 1);
				if ((value1 + value2) == L) {
					arylist.add(value1);
					arylist.add(value2);
					arylst.add(arylist);
				}
			}
		}
		return arylst;
	}

	// Problem 3
	public Integer prblm_3(ArrayList<Integer> A1) {
		int num = Integer.MIN_VALUE;
		for (int i = 0; i < A1.size(); i++) {
			if (A1.get(i) >= num) {
				num = A1.get(i);
			}
		}
		return num;
	}

	// Problem 4
	public ArrayList<String> prblm_4(ArrayList<String> L4) {
		Collections.sort(L4, Comparator.comparing(String::length));
		return L4;
	}

	// Problem 5
	public boolean prblm_5(String st) {
		int i;
		Deque<Character> str1 = new ArrayDeque<Character>();
		for (i = 0; i < st.length(); i++) {
			char c1 = st.charAt(i);
			if (c1 == '(' || c1 == '[' || c1 == '{') {
				str1.push(c1);
				continue;
			}
			if (str1.isEmpty()) {
				return false;
			}
			char check;
			switch (c1) {
			case ')':
				check = str1.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = str1.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = str1.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (str1.isEmpty());
	}

	// Problem 6
	public ArrayList<Integer> prblm_6(Stack<Integer> Stk) {
		ArrayList<Integer> strk2 = new ArrayList<>();
		int stksz = Stk.size() / 2;
		for (int i = 0; i < stksz; i++) {
			strk2.add(Stk.pop());
		}
		Stk.sort(Collections.reverseOrder());
		for (int i = 0; i < stksz; i++) {
			strk2.add(Stk.pop());
		}
		return strk2;
	}

	// Problem 7
	public int prblm_7(Queue<String> QS) {
		String bny = "";
		for (String bin : QS) {
			bny = bny + bin;
		}

		return Integer.parseInt(bny, 2);
	}

	// Problem 8
	public List<Integer> getAlternativeSeq(Deque<Integer> qnt) {
		List<Integer> list = new ArrayList<>();
		while (!qnt.isEmpty()) {
			list.add(qnt.pollLast());
			if (!qnt.isEmpty())
				list.add(qnt.pollFirst());

		}
		return list;
	}

	// Problem 9
	public List<Integer> getEvenOdd(Queue<Integer> qut) {
		Queue<Integer> evnLst = new LinkedList<>();
		Queue<Integer> odLst = new LinkedList<>();
		while (!qut.isEmpty()) {
			int ele = qut.poll();
			if (ele % 2 == 0) {
				evnLst.add(ele);
			} else {
				odLst.add(ele);
			}
		}
		List<Integer> list = new ArrayList<>();
		while (!evnLst.isEmpty() || !odLst.isEmpty()) {
			if (!evnLst.isEmpty()) {
				list.add(evnLst.poll());
			}
			if (!odLst.isEmpty()) {
				list.add(odLst.poll());
			}
		}
		return list;
	}

	// Problem 10
	public String getDeque(Deque<Character> q, List<Integer> a) {
		char vle1 = '$';
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == 0) {
				;

				if (vle1 != '$')
					q.addFirst(vle1);
			}
			if (a.get(i) == 1 && !q.isEmpty())
				vle1 = q.pollFirst();
		}
		StringBuilder stbi = new StringBuilder();
		while (!q.isEmpty()) {
			stbi.append(q.poll());
		}
		return stbi.toString();
	}
}
