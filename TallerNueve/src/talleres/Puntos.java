package talleres;

public class Puntos {
	public static void main(String[] args) {
		
	}
 //Punto 1
		String typeOfFish;
		int friendliness;
		
		
	//Punto 2
		public void Fish(){
			
		this.typeOfFish = "Unknown";
		friendliness = 3;
		
		}
		
		
	//Punto 3
		public void Fish(String t, int f){
			
			typeOfFish = t;
			friendliness = f;
			
			}
		
	//Punto 5
			int getFriendliness(){
			return friendliness;
			}		
			
			
	//Punto 6
			Fish amber = new Fish();
			Fish james = new Fish();
			
	//Punto 7
			Fish nicestFish(Fish a, Fish b){
				
	//Punto 8
				if(a.getFriendliness()> b.getFriendliness())
				return a;
				else return b;
				
		}

}


