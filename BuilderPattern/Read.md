GoF Definition

Separate the construction of a complex object from its representation so that the same construction processes can create different representations.

Concept

The builder pattern is useful for creating complex objects that have multiple parts. The creational mechanism of an object should be independent of these parts. The construction process does not care about how these parts are assembled. The same construction process must allow us to create different representations of the objects.

How do I decide whether I should use an abstract class or an interface in an application?

I believe that if you want to have some centralized or default behavior, the abstract class is a better choice. In those cases, you can provide some default implementation. On the other hand, interface implementation starts from scratch. They indicate some kind of rules/contracts on what is to be done (e.g., you must implement the method) but they will not enforce the how part of it. Also, interfaces are preferred when you are trying to implement the concept of multiple inheritance.

But at the same time, if you need to add a new method in an interface, then you need to track down all the implementations of that interface and you need to put the concrete implementation for that method in all of those places. You can add a new method in an abstract class with a default implementation and the existing code can run smoothly.

