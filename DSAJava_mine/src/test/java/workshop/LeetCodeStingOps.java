package workshop;

public class LeetCodeStingOps {
	
	  public static int finalValueAfterOperations(String[] operations) {
	        int X=0;
	        
	        
	        for(String op : operations){
	        if(op.contains("++")){
	            X = X + 1;
	        }else if(op.contains("--")){
	            X = X - 1;
	        }
	    }
	        return X;
	    }
	

	public static void main(String[] args) {

 String[] operations = {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations(operations));
		  

	}

}
