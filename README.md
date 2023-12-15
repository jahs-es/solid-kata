# SOLID design principles

ElectricCar doesn't properly substitute Vehicle because of the method fillUpWithFuell().

PetrolCar doesn't properly substitute Vehicle because of the method chargeBattery().

Solution : 
Refactoring both methods with a single one named fill() and let the subclasses specify how the car should be filled.

- Liskov Substitution Principle: Derived classes must be substitutable for their base classes. Functions that use references to base classes must be able to use objects of derived classes without knowing it.

