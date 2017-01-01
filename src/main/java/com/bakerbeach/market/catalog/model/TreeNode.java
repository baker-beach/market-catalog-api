package com.bakerbeach.market.catalog.model;

import java.util.LinkedList;
import java.util.List;

public class TreeNode<T> {
	T obj;
	TreeNode<T> parent;
	List<TreeNode<T>> children;

	public TreeNode(T obj) {
		this.obj = obj;
		this.children = new LinkedList<TreeNode<T>>();
	}

//	public TreeNode<T> addChild(T childObj) {
//		TreeNode<T> childNode = new TreeNodeImpl<>(childObj);
//		childNode.parent = this;
//		this.children.add(childNode);
//		return childNode;
//	}

	public TreeNode<T> addChildNode(TreeNode<T> childNode) {
		childNode.parent = this;
		this.children.add(childNode);
		return childNode;
	}

	public T getObject(){
		return obj;
	}

	public List<TreeNode<T>> getChildren() {
		return children;
	}
}
