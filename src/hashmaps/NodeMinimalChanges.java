package hashmaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NodeMinimalChanges {
	public static void main(String args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		Set<Integer> goodNodes = new HashSet<Integer>();
		Set<Integer> badNodes = new HashSet<Integer>();
		input.add(3);
		input.add(4);
		input.add(1);
		input.add(2);
		input.add(1);
		goodNodes.add(1);
		boolean change = true;
		while (change) {
			change = false;
			for (int i = 0; i < input.size(); i++) {
				if (goodNodes.contains(input.get(i))) {
					if (goodNodes.add(i + 1)) {
						change = true;
						badNodes.remove(i + 1);
					}
				} else {
					if (i + 1 != 1) {
						badNodes.add(i + 1);
					}
				}
			}
		}
		System.out.println(badNodes.size());
	}

	public NodeMinimalChanges() {
		ArrayList<Integer> input = new ArrayList<Integer>();
		Set<Integer> goodNodes = new HashSet<Integer>();
		Set<Integer> badNodes = new HashSet<Integer>();
		input.add(3);
		input.add(4);
		input.add(1);
		input.add(2);
		input.add(1);
		goodNodes.add(1);
		boolean change = true;
		while (change) {
			change = false;
			for (int i = 0; i < input.size(); i++) {
				if (goodNodes.contains(input.get(i))) {
					if (goodNodes.add(i + 1)) {
						change = true;
						badNodes.remove(i + 1);
					}
				} else {
					if (i + 1 != 1) {
						badNodes.add(i + 1);
					}
				}
			}
		}
		System.out.println(badNodes.size());
	}

	public void recursiveSolution(ArrayList<Integer> goodNodes,
			ArrayList<Integer> badNodes) {
		System.out.println("Good Nodes");
		for (Iterator<Integer> iterator = goodNodes.iterator(); iterator
				.hasNext();) {
			System.out.println(iterator.next());
		}
		System.out.println("Bad Nodes");
		for (Iterator<Integer> iterator = badNodes.iterator(); iterator
				.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}
