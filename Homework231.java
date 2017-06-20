import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class odograph{
	private HashMap<String, Integer> og = new HashMap<String, Integer>();

	public odograph(ArrayList<String> cy,Integer[][] lh){
        for ( int i = 0; i < cy.size(); i++ ){
        	for ( int j = 0; j < cy.size(); j++ ){
        		og.put(cy.get(i)+cy.get(j), lh[i][j]);
        	}
        }
	}

    public int getValue(String s){
    	 return og.get(s);
    }
}

public class Homework231 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		ArrayList<String> city = new ArrayList<String>();

		//读取城市
		String ct = in.next();
		while (!ct.equals("###")){
			city.add(ct);
		    ct = in.next();
		}

		Integer[][] lh = new Integer[city.size()][city.size()];
		//读取里程
		for(int i = 0; i<lh.length; i++){
			for(int j = 0; j<lh.length; j++){
			lh[i][j] = in.nextInt();
		    }
		}
		//创建里程模型
		odograph ogr = new odograph(city,lh);

		System.out.print(ogr.getValue(in.next()+in.next()));

    }
}