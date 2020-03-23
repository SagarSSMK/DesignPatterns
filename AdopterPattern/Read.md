GoF Definition

Convert the interface of a class into another interface that clients expect. Adapter lets classes work together that could not otherwise because of incompatible interfaces.

Real World Example

A very common use of this pattern can be seen in an electrical outlet adapter/AC power adapter in international travels. These adapters act as a middleman when an electronic device (let’s say, a laptop) that accepts a US power supply can be plugged into a European power outlet. Consider another example. Suppose that you need to charge your mobile phone, but you see that the switchboard is not compatible with your charger. In this case, you may need to use an adapter. Or, a translator who is translating language for someone can be considered following this pattern in real life.

Computer-world Example

Suppose that you have an application that can be broadly classified into two parts: user interface (UI or front end) and database (back end). Through the user interface, clients can pass a specific type of data or objects. Your database is compatible with those objects and can store them smoothly. Over a period of time, you may feel that you need to upgrade your software to make your clients happy. So, you may want to allow new type of objects to pass through the UI. But in this case, the first resistance comes from your database because it cannot store these new types of objects. In such a situation, you can use an adapter that takes care of the conversion of the new objects to a compatible form that your old database can accept.