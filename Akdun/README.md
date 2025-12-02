Java OOP Demo

This small demo shows the four pillars of Object-Oriented Programming in Java:

- Encapsulation: `Person` class uses private fields with getters/setters and validation.
- Abstraction: `Vehicle` is an abstract class declaring abstract behavior (`startEngine`).
- Inheritance: `Car` and `Truck` extend `Vehicle` and inherit behavior (e.g., `honk`).
- Polymorphism: `Vehicle` references hold `Car`/`Truck` objects and the correct overridden method runs at runtime; `Car` also demonstrates method overloading.

How to compile and run (PowerShell):

```powershell
cd "d:/College/FRONTEND/Java/OOP"
javac *.java
java Main
```

Expected output: several sections printed showing encapsulation, abstraction/inheritance, and polymorphism.
