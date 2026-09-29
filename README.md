# Rescue Animal System

A menu-driven Java console app for tracking and reserving search-and-rescue animals.

Take in new dogs and monkeys, reserve trained animals by country, and view who is available.

*Built for IT 145 at SNHU.*

## Overview

The Rescue Animal System was built for a fictional search-and-rescue training company called Grazioso Salvare.

The app keeps track of rescue dogs and monkeys as they move through training. It helps staff see which animals are fully trained and ready to be reserved.

The project uses object-oriented design. A parent class holds shared animal data, and separate classes handle dogs and monkeys.

## Features

- Console menu with numbered options
- Intake new dogs
- Intake new monkeys
- Reserve an animal by type and country
- Print a list of all dogs
- Print a list of all monkeys
- Print all animals that are ready and not reserved
- Duplicate name checks for dogs and monkeys
- Monkey species validation
- Preloaded test data for dogs

## Menu Options

| Option | Action |
|---|---|
| **1** | Intake a new dog |
| **2** | Intake a new monkey |
| **3** | Reserve an animal |
| **4** | Print a list of all dogs |
| **5** | Print a list of all monkeys |
| **6** | Print all animals that are not reserved |
| **q** | Quit the application |

## Animal Data

Every animal tracks:

- Name
- Gender
- Age
- Weight
- Acquisition date
- Acquisition country
- Training status
- Reserved status
- In-service country

**Dogs** also track breed.

**Monkeys** also track species, tail length, height, and body length.

## Monkey Species

The app only accepts species the company trains:

- Capuchin
- Guenon
- Macaque
- Marmoset
- Squirrel monkey
- Tamarin

If you enter anything else, the app asks again.

## Reserving Animals

To reserve an animal, the app asks for the animal type and the in-service country.

It reserves the first animal that matches all of these:

- Correct type (dog or monkey)
- In the requested country
- Training status is **in service**
- Not already reserved

If nothing matches, the app lets you know.

## Project Structure

| File | Purpose |
|---|---|
| `RescueAnimal.java` | Parent class with shared fields, getters, and setters |
| `Dog.java` | Dog subclass with breed |
| `Monkey.java` | Monkey subclass with species and body measurements |
| `Driver.java` | Main menu, input handling, and app logic |

## Requirements

- Java 8 or newer (JDK)
- No external libraries

The app uses only the Java standard library:

- `java.util.ArrayList`
- `java.util.Scanner`

## How to Run

Clone the repository:

```bash
git clone https://github.com/Tjordanart/rescue-animal-system-java.git
```

Navigate to the project directory:

```bash
cd rescue-animal-system-java
```

Compile the files:

```bash
javac *.java
```

Run the app:

```bash
java Driver
```

Follow the on-screen menu to add animals, make reservations, and view lists.

## What I Practiced

This project provided practice with:

- Java programming
- Object-oriented design
- Inheritance
- Encapsulation with getters and setters
- Constructors
- ArrayLists
- Loops
- Switch statements
- User input with Scanner
- Input validation
- Working in Eclipse

## Author

**Tyler Jordan**

[GitHub](https://github.com/Tjordanart)  
[Portfolio](https://www.tjordanart.com)
