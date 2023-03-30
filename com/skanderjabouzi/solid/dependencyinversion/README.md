# Dependency Inversion Principle (DIP)

Inject everything a function needs to do its job, and no more.

Instead of referencing dependencies loaded into the scope globally (historical norm), pass them into components specifically (inversion).

A component should not know anymore about the world than it needs in order to fulfill it’s single purpose.

See any native JavaScript function that takes a callback like Array.prototype.map. It doesn’t need to know anything more than:

the fact that it needs to iterate over an input array,
the fact that it needs to produce a new output array,
the specific way you want it to accomplish (2) given (1).
.map’s only dependency, then, is (3): how exactly it should map the values. So we pass it in as a callback.

This principle is analogous to a “need-to-know” security clearance for classified information, or the “principle of least privilege.”

If a component just needs a value, not the entire object containing the value, then just hand it the value.

If you’re just hammering a nail in, you don’t need to retrieve the entire toolbox from the garage. Just bring the hammer.
