package PriorityQueue;

import java.util.ArrayList;
//class Pair<T extends Comparable>{
//	T value;
//	int i;
//	boolean previnsert;
//	public Pair(T value) {
//		this.value=value;
//		i=1;
//		previnsert=true;
//	}
//	public int compareTo(Pair<T> ob) {
//		if(this.value.compareTo(ob.value)==0)
//		{
//			if(this.i>ob.i)
//				return -1;
//			else return 1;
//		}
//		else
//			return this.value.compareTo(ob.value);
//	}
//	
//}

public class MaxHeap<T extends Comparable> implements PriorityQueueInterface<T> {

	public ArrayList<T> arr;
	int index;
	public MaxHeap() {
		arr= new ArrayList<T>();
		index=1;
		arr.add(0,null);
	}
	public void swap(int a,int b) {
		T temp=arr.get(a);
		arr.set(a,arr.get(b));
		arr.set(b,temp);
		
	}
    @Override
    public void insert(T element) {
    	int i=index;
//    	Pair<T> ele= new Pair<T>(element) ;
    	index++;
    	
    	arr.add(i, element);
    	
//    	int j=1;
//
//    	int max.i;
//    	
//    	while(j<arr.size()-1 ) {
//  
//    		if(ele.value.compareTo(arr.get(j).value)==0 ) {          //if similar priority
//    			{	if(max<=(arr.get(j).i+1))
//    				{ 
//    				max=arr.get(j).i+1;
//    				
//    				}
//    			}
//    			
//    		}
//    		j++;
//    	}
//    	ele.i=max;
//    	
//    	arr.set(i, ele);
    	T t=arr.get(i);
    	while(t!=null && arr.get(i/2)!=null && (t.compareTo(arr.get(i/2))==1))
    	{	 
    		
    		swap(i,i/2);
    		
    		
    		i=i/2;
    	}
    	
    	
    }
    public T search( String key) {
    	
    	for(int i=1;i<arr.size();i++) {
    		T t=arr.get(i);
    		if(t.toString().equals(key))
    			{
    		
    			return t;
    			}
    	}
    	return null;
    }
    public void heapify(int p) {
    	
    	
    	if(2*p+1>arr.size()-1 && 2*p<=arr.size()-1 && p<arr.size()) {
    		
    		if (arr.get(2*p).compareTo(arr.get(p))==1) { 
            	
                swap(2*p,p); 
                heapify(2*p); 
            }
    	}
    	else if(arr.size()==1)
    	{
    		
    		return;
    	}else if(2*p>arr.size()-1 && p<=arr.size()-1 ) {
    		return;
    	}

    	else if(arr.get(2*p).compareTo(arr.get(p))==1 ||arr.get(2*p+1).compareTo(arr.get(p))==1)
    		{ 
    	  
    	            if (arr.get(2*p).compareTo(arr.get(2*p+1))==1) { 
    	            	
    	                swap(2*p,p); 
    	                heapify(2*p); 
    	            } 
    	            else { 
    	            	swap(2*p+1,p); 
    	            	heapify(2*p+1); 
    	            } 
    	        }
    	//System.out.println("heap size in heapify "+arr.size());
            }
   
   
    

    @Override
    public T extractMax() {
        
    	T temp=null;
    	
    	if(arr.size()>1)
    		
         {	

    		temp=arr.get(1);

        arr.set(1, arr.get(index-1));
        arr.remove(index-1);
        index--;

        heapify(1);
   
        }
        if(temp!=null)
        return temp;       
        else
        	return null;
    }

//public Pair<T> extractMaxpair() {
//        
//    	Pair<T> temp=null;
//    
//    	
//    	if(arr.size()>1)
//    		
//         {	
//
//    		temp=arr.get(1);
//    		
//    		System.out.println(index-1);
//        arr.set(1, arr.get(index-1));
//        arr.remove(index-1);
//        index--;
//
//        heapify(1);
//        //System.out.println("size "+arr.size());
//        }
//    	
//        return temp;
//    }
    public int size() {
    	return arr.size();
    }
    public void print() {
    	 for(int i=1;i<arr.size();i++)
 		{System.out.print(arr.get(i));
 		}
     System.out.println("");
    }
}


