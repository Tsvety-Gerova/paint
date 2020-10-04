package paintingWalls;

import java.util.Scanner;

public class Paint {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	double height;
	double width;
	double lenght;
	
	System.out.println("Enter the height of the walls");
	height = sc.nextDouble();
	System.out.println("Enter the width of the walls");
	width = sc.nextDouble();
	System.out.println("Enter the lenght of the walls");
	lenght = sc.nextDouble(); 
	
	double Plosht = 2*height*width + 2*height*lenght + 2*lenght*width;
	System.out.println("The area is " + Plosht);
	
	int tsena;
	int buckets30;
	int buckets140;
	
	if (Plosht <= 90) {
		if (Plosht%30 == 0) {
			buckets30 = (int) (Plosht/30);
			buckets140 = 0;
			tsena = buckets140*15 + buckets30*4;
			System.out.println("Painting the whole room will cost " + tsena);
			System.out.println("You will need " + buckets30 + " 1-litter buckets of paint and " + buckets140 + " 5-litter buckets of paint");
		
		}else if(Plosht % 30 != 0) {
			buckets30 = (int) (Plosht/30 + 1);
			buckets140 = 0;
			tsena = buckets140*15 + buckets30*4;
			System.out.println("Painting the whole room will cost " + tsena);
			System.out.println("You will need " + buckets30 + " 1-litter buckets of paint and " + buckets140 + " 5-litter buckets of paint");
			
		}
	}else if (Plosht > 90) {
		if (Plosht%140 == 0) {
				buckets140 = (int) (Plosht/140);
				buckets30 = 0;
				tsena = buckets140*15 + buckets30*4;
				System.out.println("Painting the whole room will cost " + tsena);
				System.out.println("You will need " + buckets30 + " 1-litter buckets of paint and " + buckets140 + " 5-litter buckets of paint");
				
		}else {
				if ((Plosht%140)/30 == 0 && ((Plosht%140)/30) <= 90){
				buckets140 = (int) (Plosht/140);
				buckets30 = (int) ((Plosht%140)/30);
				tsena = buckets140*15 + buckets30*4;
				System.out.println("Painting the whole room will cost " + tsena);
				System.out.println("You will need " + buckets30 + " 1-litter buckets of paint and " + buckets140 + " 5-litter buckets of paint");
				
				}else if ((Plosht%140)/30 != 0 && ((Plosht%140)/30) <= 90)	{
					buckets140 = (int) (Plosht/140);
					buckets30 = (int) ((Plosht%140)/30 + 1);
					tsena = buckets140*15 + buckets30*4;
					System.out.println("Painting the whole room will cost " + tsena);
					System.out.println("You will need " + buckets30 + " 1-litter buckets of paint and " + buckets140 + " 5-litter buckets of paint");
					

				}else if ((Plosht%140)/30 > 90){
					buckets140 = (int) (Plosht/140 + 1);
					buckets30 = 0;
					tsena = buckets140*15 + buckets30*4;
					System.out.println("Painting the whole room will cost " + tsena);
					System.out.println("You will need " + buckets30 + " 1-litter buckets of paint and " + buckets140 + " 5-litter buckets of paint");
				
				}
				}
		
		}	
		
		
	
		
	} 
} 
	


