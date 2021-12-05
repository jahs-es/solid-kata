# SOLID design principles

- Dependency Inversion Principle: Depend on abstractions, not on concretions. High-level modules should not depend on
 low-level modules. Both should depend on abstractions.   Abstractions should not depend on details. Details should 
 depend on abstractions.

Solution:

EmailSender has to be decoupled in order to make birthdayGreeter independent from the way we send greeter, so we create 
Sender interface. 

That interface is implemented by EmailSender. The method emailFor has to be traslated to that implementation also 
because is related to it. 

Now birthdayGreeter only knows about something that send the email but doesn't know about the 
details.
