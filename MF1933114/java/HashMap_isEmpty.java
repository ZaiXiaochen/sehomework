/**类名_方法名(_形参类型)*
 *  @author: mf1933114宰晓晨
 *  @className: HashMap_isEmpty
 *  @apiSignature: java.util.HashMap$public boolean isEmpty()
 *  @description: Test java api java.util.LinkedList$java.util.HashMap$public boolean isEmpty()
 *  @Map: Dictionary$ var isEmpty:bool
 */
import java.util.*;

public class HashMap_isEmpty{
	public static void isEmpty0(){
	/**
	*input:1
	*hashmap HashMap<Integer,Integer>$hashmap={}
	*output:1
	*ret0=true
	*/  
	    HashMap<Integer,Integer>hashmap=new HashMap<>();
	    boolean ret0=hashmap.isEmpty();
		assert (ret0==true);
		System.out.println(ret0);
	}
	public static void isEmpty1(){
	/**
	*input:1
	*hashmap HashMap<Integer,Integer>$hashmap={(0,0)}
	*output:1
	*ret1=false
	*/  
	    HashMap<Integer,Integer>hashmap=new HashMap<>();
	    hashmap.put(0,0);
	    boolean ret1=hashmap.isEmpty();
		assert (ret1==false);
		System.out.println(ret1);
	}
	public static void main(String[] args){
		isEmpty0();
		isEmpty1();
	}
}