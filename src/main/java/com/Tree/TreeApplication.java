package com.Tree;

import com.Tree.interfaces.Position;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreeApplication {

	public static void main(String[] args) {

		/**
		 * sample implementation
		 */

		SpringApplication.run(TreeApplication.class, args);

		LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();

		Position<Integer> root = tree.addRoot(1);
		Position<Integer> leftChild1 = tree.addLeft(root,2);
		Position<Integer> rightChild1 = tree.addRight(root, 3);

		tree.addLeft(leftChild1, 4);
		tree.addRight(leftChild1, 7);

		tree.positionsPreorder().forEach(node -> {
			System.out.println(node.getElement());
		});

		tree.positionsPostorder().forEach(node -> {
			System.out.println(node.getElement());
		});

		tree.positionsPostorder().forEach(node -> {
			System.out.println(node.getElement());
		});
	}
}

