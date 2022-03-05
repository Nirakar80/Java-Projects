import javax.swing.JOptionPane;

public class PizzaHouse {

	public static final String[] pizzas = { "Cheese", "Pepperoni", "Sausage", "Meatlover", "Veggie"};
	public static void main(String[] args) {

	
    String p =  (String) JOptionPane.showInputDialog(null, "Which pizza would you like to order?" , null, JOptionPane.QUESTION_MESSAGE , null , pizzas, null);
     String number =  JOptionPane.showInputDialog("How many? ");
       double no =  Double.parseDouble(number);
        
        System.out.println("You chose "+ p + " pizza");
    	 
    	
       	double cost;
       	cost = 0;
       	
       	
       	
    	switch (p) {
    	
    	case "Pepperoni":
    		cost = 4.49;
    	
    	case "Veggie":
    	case "Cheese":
    		cost = 3.59;		
    		break;
    		
    	case "Sausage":	
    	case "Meatlover":
    		cost = 5.29;
    		break;   		
    	}
    	 cost *= no;
    	
    	 double p1;
    	String ppl = (String)JOptionPane.showInputDialog("Split among how many people?");
    	p1 = Double.parseDouble(ppl);
    	
    	cost /= p1;
    	
    	JOptionPane.showMessageDialog(null, "You have to pay "+ cost);
		System.out.println(" Each person has to pay $" + (float) cost);
    	}
	
		
	}
		

