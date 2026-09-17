# Smart Canteen Management & Demand Analysis System Using Java

## Project Overview
Smart Canteen is a Java-based console application designed to manage basic college canteen operations such as student login, food menu display, ordering, billing, and demand analysis.

## Objectives
- Manage student and admin login.
- Display available food items and prices.
- Allow students to place food orders.
- Validate food quantity and availability.
- Calculate bills automatically.
- Provide basic demand analysis.

## Main Features

### Student Module
- Student login
- View food menu
- Select food items
- Enter quantity
- Place orders
- Generate bill

### Admin Module
- Admin login
- View canteen menu
- View demand analysis

### Billing Module
- Calculate total order amount
- Display order details
- Generate final bill

### Demand Analysis Module
- Display total orders
- Analyse food item demand
- Display sales-related information

## Technologies and Tools Used
- Java
- Object-Oriented Programming
- ArrayList
- Exception Handling
- Visual Studio Code

## Java Concepts Used
- Classes and Objects
- Encapsulation
- Inheritance
- Constructors
- Methods
- ArrayList
- Modular Programming
- Exception Handling

## Project Structure

SmartCanteen/
- src/canteen/Main.java
- src/canteen/User.java
- src/canteen/Student.java
- src/canteen/Admin.java
- src/canteen/FoodItem.java
- src/canteen/Menu.java
- src/canteen/Order.java
- src/canteen/OrderItem.java
- src/canteen/Billing.java
- src/canteen/DemandAnalysis.java

## Installation and Run

### 1. Open the Project
Open the SmartCanteen project folder in Visual Studio Code.

### 2. Compile the Project
Open the terminal in the project folder and run:

javac -d out src\canteen\*.java

### 3. Run the Project
Run:

java -cp out canteen.Main

## Testing Instructions

The following operations can be tested:

1. Run the application.
2. Test student login.
3. Display the food menu.
4. Select a food item.
5. Enter the required quantity.
6. Check order and bill calculation.
7. Test invalid quantity or unavailable food input.
8. Test admin login.
9. Check menu information from the admin module.
10. Check demand analysis.

## Expected Output
The system should allow students to log in, view the menu, place food orders, and receive a calculated bill. Admin users should be able to access menu information and demand analysis.

## Author
Amar Raj
