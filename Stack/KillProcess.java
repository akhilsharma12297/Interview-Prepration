package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class KillProcess {

	static class Node {
		int data;

		ArrayList<Node> list = new ArrayList<KillProcess.Node>();

		Node(int data) {
			this.data = data;
		}
	}

	static Node head;

	static List<Integer> ans = new ArrayList<>();

	public static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {

		HashMap<Integer, Node> nodeMap = new HashMap<Integer, Node>();

		for (int i = 0; i < pid.size(); i++) {
			nodeMap.put(pid.get(i), new Node(pid.get(i)));
		}

		for (int i = 0; i < pid.size(); i++) {

			if (ppid.get(i) == 0) {
				head = nodeMap.get(pid.get(i));
			} else {
				nodeMap.get(ppid.get(i)).list.add(nodeMap.get(pid.get(i)));
			}
		}

		Node find = getfind(head, kill);

		killit(head, find);

		myNodes(find);

		return ans;
	}

	private static void myNodes(Node node) {

		for (Node child : node.list) {
			ans.add(node.data);
			myNodes(child);
		}

	}

	private static void killit(Node node, Node kill) {
		for (Node child : node.list) {

			if (node.list.contains(kill)) {
				node.list.remove(kill);
			} else {
				killit(child, kill);
			}
		}

	}

	private static Node getfind(Node node, int data) {

		if (node.data == data) {
			return node;
		}

		for (Node child : node.list) {

			Node ans = getfind(child, data);
			if (ans != null) {
				return ans;
			}
		}

		return null;

	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> pid = new ArrayList<>(n);
		List<Integer> ppid = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			pid.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			ppid.add(sc.nextInt());
		}
		ArrayList<Integer> res = (ArrayList<Integer>) killProcess(pid, ppid, k);
//		Collections.sort(res);
//		System.out.println(res);
	}
}