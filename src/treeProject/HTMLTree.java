package treeProject;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;


public class HTMLTree extends JFrame {
	JTree tree;
	
	public HTMLTree()
	{
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("html");
		DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("head");
		DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("body");
		
		DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("meta");
		DefaultMutableTreeNode n4 = new DefaultMutableTreeNode("title");
		
		DefaultMutableTreeNode n5 = new DefaultMutableTreeNode("ul");
		DefaultMutableTreeNode n6 = new DefaultMutableTreeNode("h1");
		DefaultMutableTreeNode n7 = new DefaultMutableTreeNode("h2");
		DefaultMutableTreeNode n8 = new DefaultMutableTreeNode("li");
		DefaultMutableTreeNode n9 = new DefaultMutableTreeNode("li");
		DefaultMutableTreeNode n10 = new DefaultMutableTreeNode("a");
		
		
		root.add(n1);
		root.add(n2);
		n1.add(n3);
		n1.add(n4);
		n2.add(n5);
		n2.add(n6);
		n2.add(n7);
		n5.add(n8);
		n5.add(n9);
		n7.add(n10);
		
		
		tree = new JTree(root);
		add(tree);
		this.setTitle("JTreeExample");
		this.setSize(300,300);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) 
	{
		new HTMLTree();
	}

}
