package labb10;

import javax.swing.*;

import javax.swing.border.*;

import java.awt.*;

import java.awt.event.*;

public class PizzaBuilder

{

private static JFrame myFrame = new JFrame("Build a Pizza");

private static JRadioButton small, medium, large;

private static ButtonGroup bg;

private static JLabel sizeList = new JLabel("Sizes List: ");

private static JLabel Price = new JLabel("Total $ ");

private static JLabel totPrice = new JLabel("0.0");

private static JLabel topsPrice = new JLabel("Topping $ ");

private static JLabel toppingsPrice = new JLabel("0.0");

private static final double LARGE=16.49;

private static final double MEDIUM=13.49;

private static final double SMALL=10.49;

private static final double MEATITEM=2.25;

private static final double VEGITEM=1.75;

private static int meattopping=0;

private static int vegtopping=0;

private static JCheckBox sausage, pepperoni, canadian_ham, anchovies;

private static JCheckBox mushroom, green_pepper, onion, black_olive;

public static void main(String[] args)

{

	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	myFrame.setLayout(new FlowLayout());

	JPanel panelSizePrice = makeSizePricePanel();

	JPanel panelCheck = makePizzaPanel();

	myFrame.add(panelSizePrice);

	myFrame.add(panelCheck);

	myFrame.setSize(620,340);

	myFrame.setVisible(true);

}

  


		private static JPanel makeSizePricePanel()

{

			JPanel jp = new JPanel();

			jp.setLayout(new GridLayout(2,4));

			jp.setPreferredSize(new Dimension(575,100));
			

			small = new JRadioButton("Small", true);

			totPrice.setText(String.valueOf(SMALL));

			medium = new JRadioButton("Medium", false);

			large = new JRadioButton("Large", false);

 

			jp.add(sizeList);

			jp.add(small);

			jp.add(medium);

			jp.add(large);



			small.addItemListener(new pizzaSizeListen());

			medium.addItemListener(new pizzaSizeListen());

			large.addItemListener(new pizzaSizeListen());


			bg = new ButtonGroup();


			bg.add(small);bg.add(medium);bg.add(large);


			jp.add(Price);

			jp.add(totPrice);
	
			jp.add(topsPrice);

			jp.add(toppingsPrice);

			return jp;

} 


		private static class pizzaSizeListen implements ItemListener

{

			public void itemStateChanged(ItemEvent i)

{

				double sizePrice=SMALL;   

				if(small.isSelected())

					sizePrice=SMALL;

				else if(medium.isSelected())

					sizePrice=MEDIUM;

				else if(large.isSelected())

					sizePrice=LARGE;   

				double pizzaPrice = sizePrice + Double.parseDouble(toppingsPrice.getText());

				totPrice.setText(String.valueOf(pizzaPrice));

}

} 

		private static JPanel makePizzaPanel()

{

			JPanel jp = new JPanel();

			jp.setLayout(new GridLayout(2,4));

			jp.setPreferredSize(new Dimension(575,100));

			sausage=new JCheckBox("Sausage");

			sausage.addItemListener(new pizzaToppingListen());

			pepperoni=new JCheckBox("Pepperoni");

			pepperoni.addItemListener(new pizzaToppingListen());

			canadian_ham=new JCheckBox("Canadian Ham");

			canadian_ham.addItemListener(new pizzaToppingListen());

			anchovies=new JCheckBox("Anchovies");

			anchovies.addItemListener(new pizzaToppingListen());

			mushroom=new JCheckBox("Mushroom");

			mushroom.addItemListener(new pizzaToppingListen());

			green_pepper=new JCheckBox("Green Pepper");

			green_pepper.addItemListener(new pizzaToppingListen());

			onion=new JCheckBox("Onion");

			onion.addItemListener(new pizzaToppingListen());

			black_olive=new JCheckBox("Black Olive");

			black_olive.addItemListener(new pizzaToppingListen());

			jp.add(sausage);jp.add(pepperoni);jp.add(canadian_ham);jp.add(anchovies);

			jp.add(mushroom);jp.add(green_pepper);jp.add(onion);jp.add(black_olive);


			Border blackline = BorderFactory.createLineBorder(Color.black);

			jp.setBorder(blackline);

			return jp;

}



		private static class pizzaToppingListen implements ItemListener

{

			public void itemStateChanged(ItemEvent i)

{

				meattopping=0;

				vegtopping=0;

				if(sausage.isSelected())

					meattopping++;  

				if(pepperoni.isSelected())

					meattopping++;

				if(canadian_ham.isSelected())

					meattopping++;

				if(anchovies.isSelected())

					meattopping++;


				if(mushroom.isSelected())

					vegtopping++;

				if(green_pepper.isSelected())

					vegtopping++;

				if(onion.isSelected())

					vegtopping++;

				if(black_olive.isSelected())

					vegtopping++;

  

	double topsPrice = (meattopping * MEATITEM)+(vegtopping * VEGITEM);

	double sizePrice=0.0;

	if(small.isSelected())

{

		totPrice.setText(String.valueOf(SMALL));

		sizePrice=SMALL;

}

	if(medium.isSelected())

{

		totPrice.setText(String.valueOf(MEDIUM));

		sizePrice=MEDIUM;

}

	if(large.isSelected())

{

		totPrice.setText(String.valueOf(LARGE));
	
		sizePrice=LARGE;

}

	toppingsPrice.setText(String.valueOf(topsPrice));

	totPrice.setText(String.valueOf(topsPrice + sizePrice));

}

}
}