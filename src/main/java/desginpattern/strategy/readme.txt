Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently from the clients that use it.

Capture the abstraction in an interface, bury implementation details in derived classes


Some real world examples :

1. Sorting (We want to sort but we don't know sorting algorithm type)

2. Validation (We need to check items according to "Some rule" but we dont know what are those)