package com.restaurant.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.restaurant.db.RestaurantDatabase;
import com.restaurant.model.restaurantapp;

public class Restaurantui1 {
	 private JTextField nameField, cuisineField;
	    private JList restaurantList;
	    private DefaultListModel listModel;
	    private RestaurantDatabase restaurantDatabase;

	    public Restaurantui1() {
	        restaurantDatabase = new RestaurantDatabase();
	        listModel = new DefaultListModel();
	        restaurantList = new JList(listModel);

	        JLabel nameLabel = new JLabel("Name:");
	        JLabel cuisineLabel = new JLabel("Cuisine:");

	        nameField = new JTextField(20);
	        cuisineField = new JTextField(20);

	        JButton addButton = new JButton("Add Restaurant");
	        addButton.addActionListener(new ActionListener() {
	        
	        public void actionPerformed(ActionEvent e) {
	                String name = nameField.getText();
	                String cuisine = cuisineField.getText();
	                restaurantapp restaurant = new restaurantapp(0, name, cuisine);
	                restaurantDatabase.addRestaurant(restaurant);
	                updateRestaurantList();
	            }
	        });

	        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
	        inputPanel.add(nameLabel);
	        inputPanel.add(nameField);
	        inputPanel.add(cuisineLabel);
	        inputPanel.add(cuisineField);

	        JPanel buttonPanel = new JPanel();
	        buttonPanel.add(addButton);

	        JPanel mainPanel = new JPanel(new BorderLayout());
	        mainPanel.add(inputPanel, BorderLayout.NORTH);
	        mainPanel.add(new JScrollPane(restaurantList), BorderLayout.CENTER);
	        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setTitle("Restaurant Database");
	        setSize(400, 300);
	        setLocationRelativeTo(null);
	        setLayout(new BorderLayout());
	        add(mainPanel, BorderLayout.CENTER);

	        updateRestaurantList();
	    }

	   private void setSize(int i, int j) {
			// TODO Auto-generated method stub
			
		}

		private void add(JPanel mainPanel, String center) {
			// TODO Auto-generated method stub
			
		}

		private void setLayout(BorderLayout borderLayout) {
			// TODO Auto-generated method stub
			
		}

		private void setLocationRelativeTo(Object object) {
			// TODO Auto-generated method stub
			
		}

		private void setTitle(String string) {
			// TODO Auto-generated method stub
			
		}

		private void setDefaultCloseOperation(int exitOnClose) {
			// TODO Auto-generated method stub
			
		}

		private void updateRestaurantList() {
	        listModel.clear();
	        List restaurants = restaurantDatabase.getAllRestaurants();
	       /* for (String restaurant:restaurants) {
	            listModel.addElement(restaurant.getName() + " - " + restaurant.getCuisine());
	        }*/
	        for(int i=0; i < restaurants.size(); i++) {
	            Object restaurant = restaurants.get(i);
	            listModel.addElement(((restaurantapp) restaurant).getName() + " - " + ((restaurantapp) restaurant).getCuisine());
	           
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
	           public void run() {
	                new Restaurantui1().setVisible(true);
	            }
	        });
	    }

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}


