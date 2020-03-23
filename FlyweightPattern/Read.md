GoF 

Use sharing to support large numbers of fine-grained objects efficiently.

#A flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in each context—it’s indistinguishable from an instance of the object that’s not shared. Flyweights cannot make assumptions about the context in which they operate.

The pattern is useful when you need a large number of similar objects that are unique in terms of only a few parameters and most of the stuffs are common in general

A flyweight is an object. It tries to minimize memory usage by sharing data as much as possible with other similar objects. Sharing objects may allow their usage at fine granularities with minimum costs.

Two common terms are used in this context: extrinsic and intrinsic. An intrinsic state is stored/shared in the flyweight object, and it is independent of flyweight’s context. On the other hand, an extrinsic state varies with flyweight’s context, which is why they cannot be shared. Client objects maintain the extrinsic state, and they need to pass this to a flyweight. Note that, if required, clients can also compute the extrinsic state on the fly when using flyweights.

Experts suggest that while implementing this pattern, we should make intrinsic states immutable.

Example:
Suppose that you have pen. You can replace different refills to write with different colors. So, a pen without refills is considered as a flyweight with intrinsic data, and a pen with refills is considered as extrinsic data.

