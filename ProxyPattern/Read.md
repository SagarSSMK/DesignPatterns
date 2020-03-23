GoF

Provide a surrogate or placeholder for another object to control access to it.

Concept

A proxy is basically a substitute for an intended object. Access to the original object is not always possible due to many factors. For example, it is expensive to create, it is in need of being secured, it resides in a remote location, and so forth. The proxy design pattern helps us in similar contexts. When a client deals with a proxy object, it assumes that it is talking to the actual object. So, in this pattern, you may want to use a class that can perform as an interface to something else.

Computer-World Example

In the programming world, to create multiple instances of a complex object (heavy object) is costly . So, whenever you are in need, you can create multiple proxy objects that point to the original object. This mechanism can also help save your system/application memory. An ATM can implement this pattern to hold proxy objects for bank information that may exist on a remote server.

