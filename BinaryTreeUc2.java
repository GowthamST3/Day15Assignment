package com.Bridgelabz_Day15Assignment;

public class BinaryTreeUc2 {
	static class Node {    
		int value; 
		Node left, right; 

		Node(int value){ 
			this.value = value; 
			left = null; 
			right = null; 
		} 
	} 

	public void size(Node node, int value) {
		if (value < node.value) {
			if (node.left != null) { 
				size(node.left, value); }
			else { System.out.println(" Inserted " + value + " to left of " + node.value);
			node.left = new Node(value); } } 
		else if (value > node.value) {
			if (node.right != null) {
				size(node.right, value);
			} else {
				System.out.println("  Inserted " + value + " to right of "
						+ node.value);
				node.right = new Node(value);
			}
		}
	}
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	public static void main(String args[]) 
	{ 
		BinaryTreeUc2 tree = new BinaryTreeUc2();
		Node root = new Node(56);
		System.out.println("Binary Tree Example");
		System.out.println("Building tree with root value " + root.value);
		tree.size(root, 30);
		tree.size(root, 70);
		tree.size(root, 22);
		tree.size(root, 40);
		tree.size(root, 11);
		tree.size(root, 3);
		tree.size(root, 16);
		tree.size(root, 60);
		tree.size(root, 95);
		tree.size(root, 65);
		tree.size(root, 63);
		tree.size(root, 67);
		System.out.println("Traversing tree in order");
		tree.traverseInOrder(root);

	}
}
