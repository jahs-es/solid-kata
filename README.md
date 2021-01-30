# SOLID design principles

This repository contains examples that violate the SOLID principles:

- Single Responsibility Principle: Every class should have a single responsibility. A class should have one, and only
 one, reason to change. 

Solution: 

AccountService has to many responsibilities, so we extract all part related to printing to a new service 
called PrintStatementService and inject that service in AccountService constructor as a dependency. We're 
also ending up translating Console class to that new service.