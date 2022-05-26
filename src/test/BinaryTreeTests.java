package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.BinaryTree;

public class BinaryTreeTests {
	
	@Test
	public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
		
		BinaryTree bt = new BinaryTree();
		bt = bt.createBinaryTree();
		
		assertTrue(bt.containsNode(6));
		assertTrue(bt.containsNode(4));
		
		assertFalse(bt.containsNode(1));
	}
	
	@Test
	public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
		
		BinaryTree bt = new BinaryTree();
		bt = bt.createBinaryTree();
		
		assertTrue(bt.containsNode(9));
		bt.delete(9);
		assertFalse(bt.containsNode(9));
	}

}
