# Cargo Delivery Management System

## Overview

The Cargo Delivery Management System is a Java-based application that simulates a logistics company's operations for delivering cargo to customers using different transportation methods, such as trucks, ships, and planes. It also utilizes the Observer design pattern to keep customers informed about the status of their deliveries.

## SOLID Principles

This project adheres to the SOLID principles, which are a set of guidelines for writing clean and maintainable code. Here's how each of these principles is applied:

1. **Single Responsibility Principle (SRP):** Each class has a single responsibility. For example, the `Truck`, `Ship`, and `Plane` classes are responsible for specific transportation methods, and the `Customer` class is responsible for receiving and displaying status updates.

2. **Open/Closed Principle (OCP):** The code is open for extension but closed for modification. New transportation methods can be added without changing existing code by implementing the `Transport` interface and creating new concrete classes.

3. **Liskov Substitution Principle (LSP):** Subtypes (e.g., `Truck`, `Ship`, and `Plane`) can be substituted for their base type (`Transport`) without affecting the correctness of the program.

4. **Interface Segregation Principle (ISP):** The `Transport` and `DeliveryObserver` interfaces are designed with a minimal set of methods that are relevant to their specific roles.

5. **Dependency Inversion Principle (DIP):** High-level modules (e.g., `Main` and `Order`) depend on abstractions (interfaces) rather than concrete implementations (e.g., `Truck`, `Ship`, and `Customer`).

## Factory Method Pattern

In the Cargo Delivery Management System, the Factory Method pattern is implemented to handle the creation of different transportation methods (Truck, Ship, and Plane) without exposing the underlying details of how each method is created. Here's how it's implemented:

- **Creator (Logistics):** The Logistics interface defines a contract for logistics providers to create different modes of transportation. It has one method, `createTransport()`, which is the factory method.

- **Concrete Creators (RoadLogistics, SeaLogistics, SkyLogistics):** Concrete classes (RoadLogistics, SeaLogistics, and SkyLogistics) implement the Logistics interface and provide specific implementations for the `createTransport()` method. Each concrete creator is responsible for creating a specific type of Transport (Truck, Ship, or Plane).

- **Product (Transport):** The Transport interface defines a common contract for various modes of transportation. Implementing classes (Truck, Ship, and Plane) provide specific implementations of the `deliver()` method, which is used to deliver cargo.

- **Concrete Products (Truck, Ship, Plane):** Concrete classes implement the Transport interface, providing the actual behavior for delivering cargo by land, sea, and air, respectively.

The Factory Method pattern allows the client (Main class) to interact with logistics providers (Logistics) to create specific transportation methods (Truck, Ship, or Plane) without needing to know how these methods are created. This makes the system flexible and extensible, as new transportation methods can be added by creating new Concrete Creators and Products.

## Observer Pattern

The Observer pattern is implemented to allow customers to receive real-time status updates about the delivery of their cargo. Here's how it's implemented:

- **Subject (Order):** The Order class acts as the subject and represents an order with status updates. It maintains a list of observers (DeliveryObservers) and notifies them when the status changes.

- **Observer (DeliveryObserver):** The DeliveryObserver interface defines a contract for objects that can receive and respond to status updates about deliveries. It has one method, `update(String status)`, which is called when the status changes.

- **Concrete Observers (Customer):** The Customer class implements the DeliveryObserver interface and represents a customer who observes and receives status updates. It responds to status changes by displaying the updates.

The Observer pattern ensures that customers (observers) can be attached to an order (subject), and when the order's status changes, all attached customers are notified and updated with the new status. This allows for dynamic communication between the subject and its observers without tightly coupling them, making the system more flexible and maintainable.

Together, the Factory Method and Observer patterns enhance the Cargo Delivery Management System's modularity, extensibility, and maintainability, making it a robust solution for managing cargo delivery and customer notifications.
