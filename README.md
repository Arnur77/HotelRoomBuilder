# Hotel Room Builder

## Description

This project demonstrates the Builder creational design pattern using a hotel room as an example.

The main goal of the project is to build hotel rooms step by step and create different room configurations.

## Product

The main product is `HotelRoom`.

A hotel room contains:

- Room type
- Bed type
- Floor
- Balcony
- Sea view
- Breakfast
- Price

## Builder

`HotelRoomBuilder` is the Builder interface.

It defines the steps required to construct a hotel room.

## Concrete Builders

The project contains two ConcreteBuilders:

### StandardRoomBuilder

Creates a standard hotel room with basic features.

### LuxuryRoomBuilder

Creates a luxury hotel room with additional features such as a balcony, sea view and breakfast.

## Director

`HotelDirector` contains predefined configurations for:

- Standard Room
- Luxury Room

It controls the construction sequence.

## Client

`Main` is the client class.

It creates both types of hotel rooms and displays their information.

## Technologies

- Java
- JDK 17
- IntelliJ IDEA
- Builder Design Pattern

## How to Run

1. Open the project in IntelliJ IDEA.
2. Select JDK 17.
3. Open `Main.java`.
4. Run the `main()` method.

## Expected Result

The program displays information about:

- Standard Room
- Luxury Room

including room type, bed type, floor, balcony, sea view, breakfast and price.