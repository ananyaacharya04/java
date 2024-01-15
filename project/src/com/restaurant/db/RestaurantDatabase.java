package com.restaurant.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.restaurantapp;


public class RestaurantDatabase {
	 private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/restaurant?useSSL=false";
	 int resultSet;
	 Statement statement = null;
	 Connection connection = null;
	    public RestaurantDatabase() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connection = DriverManager.getConnection(DATABASE_URL,"root","india123");
	            String createTableQuery = "CREATE TABLE IF NOT EXISTS restaurants (id INTEGER PRIMARY KEY AUTO_INCREMENT, name TEXT, cuisine TEXT)";
	            statement = connection.createStatement();
	            resultSet = statement.executeUpdate(createTableQuery);
	                    } 
	        catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	        finally {
	           if (resultSet != 0) {
	           System.out.println(resultSet);
	           try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	          
	   
	     }
	    } 

	    public void addRestaurant(restaurantapp restaurant) {
	    	int resultSet = 0;
	        try {
	            Connection connection = DriverManager.getConnection(DATABASE_URL,"root","india123");
	            String insertQuery = "INSERT INTO restaurants (name, cuisine) VALUES (?, ?)";
	            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
	            preparedStatement.setString(1, restaurant.getName());
	            preparedStatement.setString(2, restaurant.getCuisine());
	            resultSet = preparedStatement.executeUpdate();
	           
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        finally {
		           if (resultSet != 0) {
		          // System.out.println(resultSet);
		           try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        }
	        }
	    }

	    public List getAllRestaurants() {
	    	List restaurants = new ArrayList();
	    	ResultSet resultSet = null;
	    	Connection connection = null;
	    	Statement statement = null;
	        try {
	            connection = DriverManager.getConnection(DATABASE_URL,"root","india123");
	            String selectQuery = "SELECT * FROM restaurants";
	            statement = connection.createStatement();
	            resultSet = statement.executeQuery(selectQuery);
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                String cuisine = resultSet.getString("cuisine");
	                restaurantapp restaurant = new restaurantapp(id, name, cuisine);
	                restaurants.add(restaurant);
	            }
	            
	        } 
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	        finally {
		           if (resultSet != null) {
		           //System.out.println(resultSet);
		               try {
		            	  resultSet.close();
					      statement.close();
					      connection.close();
				       } catch (SQLException e) {
					         // TODO Auto-generated catch block
					         e.printStackTrace();
				       }
		           }
		           
	        }
	        return restaurants;
	    }
}



