# Liskov Substitution Principle (LSP)

You should be able to swap in a subclass without noticing.

A subclass must entail superclass behavior. The extension of a component should do everything the original component does.

Subclass output (return values and errors) may be a subset of the superclass, but their interface (available methods + arguments) must be identical.

If you hire a master contractor, but he sends his apprentice instead, the apprentice may be specialized (hanging drywall, maybe), but he needs to correctly handle all of the jobs the master can do to the same standard.