# Java Gemstone Application

## Project Overview

This is a Java application that models gemstones, such as precious and semi-precious stones, calculating their total weight and value. The application also sorts gemstones based on their value and filters them based on transparency. The program demonstrates object-oriented principles like inheritance, abstraction, and polymorphism.

## Features

- **Gemstone Class**: Abstract base class for all gemstones.
- **Precious and Semi-Precious Gemstones**: Specific types of gemstones that extend the `Gemstone` class.
- **Calculation Methods**: Calculates the weight and value of gemstones.
- **Sorting**: Sort gemstones by their value in descending order.
- **Transparency Filter**: Filters gemstones based on a given range of transparency.
- **Custom Console Output**: Enhanced visual presentation in the console with color-coded text.

## Installation

1. **Clone the repository** to your local machine:
    ```bash
    git clone https://github.com/vladriabyi/javalab5.git
    ```

2. **Navigate to the project folder**:
    ```bash
    cd javalab5
    ```

3. **Compile the project** (ensure that you have Java installed):
    ```bash
    javac src/*.java -d bin
    ```

4. **Run the application**:
    ```bash
    java -cp bin Main
    ```

## Usage

When you run the program, it will:

1. Calculate the total weight and value of all gemstones.
2. Display the gemstones sorted by value in descending order.
3. Display gemstones that have a transparency within a specified range (e.g., between 0.85 and 1.0).

### Example Output:
