package Main;
import GroundTypes.*;
import Entity.*;
import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		Villager v = new Villager(0,0);
		ArrayList<Entity> entities= new ArrayList<Entity>();
		
		Ground[][] map = new Ground[5][5];
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				map[i][j]=new Plains();
			}
		}
		map[1][1]=new Wall();
		map[0][1]=new Wall();
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j].name.substring(0,1)+" ");
			}
			System.out.println();
		}
		
		ArrayList<ArrayList<Integer>> res=MovCalc.getMov(map, v, entities);
//		for(ArrayList<Integer> row:res) {
//			for(Integer i: row) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		System.out.println("Possible Movement areas");
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				ArrayList<Integer> test = new ArrayList<Integer>();
				test.add(i);
				test.add(j);
				if(res.contains(test)) {
					System.out.print("X ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
