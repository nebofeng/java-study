package pers.nebo.tree;
/**
 * 字典数目的实现
 * 
 * @author ningbo
 *
 */
public class Trie {
	private int SIZE = 26;
	
	private TrieNode root = new TrieNode();
	/**
	 * 一个字典树节点有以下属性：
	 *  经过这个节点的数量 num
	 *  是否为最后一个节点 isEnd
	 *  这个节点的值        val
	 *  这个节点的子节点 sons 
	 * @author ningbo
	 *
	 */
	
	private class TrieNode{
		
		private int num;
		private TrieNode[]  sons;
		private boolean isEnd;
		private char val;

		TrieNode(){
			num=1;
			sons=new TrieNode[SIZE];
			isEnd = false;
		}
	 		
	}
	//建立字典树
	 public void insert(String str) {//在字典树中插入一个单词
	  if(str==null||str.length()<=0) {
		  return ;
	  }
	  char [] strChar= str.toCharArray() ;
	  TrieNode node = root;
	  for(int i=0;i<strChar.length;i++) {
		  int pos= strChar[i]-'a';  
		  if (node.sons[pos]==null){
			  node.sons[pos]=new TrieNode();
			  node.sons[pos].val=strChar[i];
			 
		  }else {
			  node.sons[pos].num++;
		  }
		  node=node.sons[pos];
	 	  
	  }
	      node.isEnd=true;

     }
	
	
	

}
