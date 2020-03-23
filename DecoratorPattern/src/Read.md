GoF 

Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

Concept

This pattern says that the class must be closed for modification but open for extension; that is, a new functionality can be added without disturbing existing functionalities. The concept is very useful when we want to add special functionalities to a specific object instead of the whole class. In this pattern, we try to use the concept of object composition instead of inheritance. So, when we master this technique, we can add new responsibilities to an object without affecting the underlying classes.

Real-World Example

Suppose you already own a house. Now you have decided to build an additional floor on top of it. You may not want to change the architecture of the ground floor (or existing floors), but you may want to change the design of the architecture for the newly added floor without affecting the existing architecture.

Computer-World Example

Suppose that in a GUI-based toolkit, we want to add some border properties. We can do this with inheritance. But it cannot be treated as an ultimate solution because the user cannot have absolute control over this creation from the beginning. So, the core choice is static in this case.

Decorators comes into picture with a flexible approach. They promote the concept of dynamic choices, for example, we can surround the component in another object. The enclosing object is called a decorator. It must conform to the interface of the component that it decorates. It forwards the requests to the component. It can perform additional operations before or after the forwardings. An unlimited number of responsibilities can be added with this concept.