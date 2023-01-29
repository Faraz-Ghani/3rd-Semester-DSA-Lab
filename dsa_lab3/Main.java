package dsa_lab3;

public class Main {
int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contact obj = new contact();
		while(true) {
		int X = obj.menu();
		switch(X) {
		case 1:
		obj.input();
			break;
		case 2:
			obj.output();
			break;	
		case 3:
			obj.display();
			break;
				
		case 4:
			obj.search();
			break;
				
		case 5:
			obj.update();
			break;
				
		case 6:
			obj.Deletion();
			break;
				
		case 7:
			obj.Exit();
			System.exit(0);
			break;
		}
				
		}
	}

}
