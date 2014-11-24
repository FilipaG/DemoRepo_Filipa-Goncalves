package lab09p1;
//exercício Lab09p1
public class Shirt {
		private String color;
		private String size;
		public Shirt(String color, String size){  //construtor
			this.color = color;
			this.size = size;
		}
		public String getColor(){
			return color;
		}
		
		public String getSize(){
			return size;
		}
		public void setColor(String color){
			
			this.color = color;
		}
		
		public void setSize(String size){
			this.size = size;
			}
		
		public String print(){
			return this.color + " " + this.size;
		}
}
