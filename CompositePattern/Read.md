GoF

Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

Concept

To help you understand this concept, I will start with an example. Consider a shop that sells different kinds of dry fruits and nuts; let’s say cashews, dates, and walnuts. Each of these items is associated with a certain price. Let’s assume that you can purchase any of these individual items or you can purchase “gift packs” (or boxed items) that contain different items. In this case, the cost of a packet is the sum of its component parts. The composite pattern is useful in a similar situation, where you treat both the individual parts and the combination of the parts in the same way so that you can process them uniformly.

This pattern is useful to represent part-whole hierarchies of objects. In object-oriented programming, a composite is an object with a composition of one-or-more similar objects, where each of these objects has similar functionalities. (This is also known as a “has-a” relationship among objects). The usage of this pattern is very common in a tree-like data structure. If you can apply it properly, you do not need to discriminate between a branch and the leaf-nodes. You can achieve two key goals with this pattern.
You can compose objects into a tree structure to represent a part-whole hierarchy.

You can access both the composite objects (branches) and the individual objects (leaf-nodes) uniformly. As a result, you can reduce the complexity of codes and at the same time, you make your application less error prone.

Real-World Example
You can also think of an organization that consists of many departments. In general, an organization has many employees. Some of these employees are grouped together to form a department, and those departments can be further grouped together to build the final structure of the organization.