import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.restaurant.db.RestaurantDatabase;
import com.restaurant.model.restaurantapp;

public class restaurantappui extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nameField, cuisineField;
    private JList restaurantList;
    private DefaultListModel listModel;
    private RestaurantDatabase restaurantDatabase;
	//private JPanel contentPane;
	{
	restaurantDatabase = new RestaurantDatabase();
    listModel = new DefaultListModel();
    restaurantList = new JList(listModel);

    JLabel nameLabel = new JLabel("Name:");
    JLabel cuisineLabel = new JLabel("Cuisine:");

    nameField = new JTextField(20);
    cuisineField = new JTextField(20);

    JButton addButton = new JButton("Add Restaurant");
    JButton viewButton = new JButton("View Restaurant");
    addButton.addActionListener(new ActionListener() {
    	
    
    public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String cuisine = cuisineField.getText();
            restaurantapp restaurant = new restaurantapp(0, name, cuisine);
            restaurantDatabase.addRestaurant(restaurant);
            updateRestaurantList();
        }
    });
    
    viewButton.addActionListener(new ActionListener() {
    	
        
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
    buttonPanel.add(viewButton);

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					restaurantappui frame = new restaurantappui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
