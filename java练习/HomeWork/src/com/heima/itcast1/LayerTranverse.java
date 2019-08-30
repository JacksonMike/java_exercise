package com.heima.itcast1;

import java.util.LinkedList;
import java.util.Queue;

public class LayerTranverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree1 biTree1=new BinaryTree1();
		int[] data={2,8,7,4,9,3,1,6,5};
		biTree1.buildTree1(data);
		biTree1.layerTranverse();
	}

}
class Node1{
	public int data;
	public Node1 left;
	public Node1 right;
	public Node1(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}	
}
class BinaryTree1{
	private Node1 root;
	public BinaryTree1(){
		root=null;
	}
	//将data数据插入到排序的二叉树中
	public void insert1(int data){
		Node1 newNode1=new Node1(data);
		if(root==null){
			root=newNode1;
		}else{
			Node1 current=root;
			Node1 parent;
			while(true){
				parent=current;
				if(data<current.data){
					current=current.left;
					if(current==null){
						parent.left=newNode1;
						return;
					}
				}else{
						current=current.right;
						if(current==null){
							parent.right=newNode1;
							return;
					}
				}
			}
			
		}
	}
	public void buildTree1(int[] data){
		for(int i=0;i<data.length;i++){
			insert1(data[i]);
		}
	}
	public void layerTranverse(){
		if(this.root==null){
			return;
		}
		Queue<Node1> q=new LinkedList<Node1>();
		q.add(this.root);
		while(!q.isEmpty()){
			Node1 n=q.poll();
			System.out.print(n.data);
			System.out.print(" ");
			if(n.left!=null){
				q.add(n.left);
			}
			if(n.right!=null){
				q.add(n.right);
			}
		}
	}
}

