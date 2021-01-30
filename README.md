# SOLID design principles

This repository contains examples that violate the SOLID principles:

- Open/Closed Principle: You should be able to extend a classes behavior, without modifying it. Software entities 
should be open for extension, but closed for modification.

Solution: 

Although using an abstract class could be a solution, we'll have a problem related to class Engineer (it has a property 
bonus that is not used by it, only Manager needs that property), so using interface for payAmount is the better solution in this case. 