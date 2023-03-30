# Single Responsibility Principle (SRP)

Each component should do one thing.

Write components that each do exactly one thing. Any related tasks should be factored out into their own components, and composed together.

If your component’s name has the word “and” in it, it’s a sign you need to break that component into separate parts.

Open-Closed Principle (OCP)Permalink
A component should be extensible, not modified.

Design components that are extensible, so that no one ever has to modify them.

Strategy 1: Write the “what,” and leave the “how” up to the caller. Typically this means accepting a lambda/callback so the caller can specify their own handling to extend your component.

Strategy 2: Make everything a subclass. The subclasses extend the superclass’s behavior, which cannot be modified.

I’ve heard it expressed that “modification is the ‘most insulting’ thing you can do to a component.” This is why we have regression testing, why good engineers prefer the lightest touch, and why you should ideally have complete test coverage in place before you perform major reconstructive surgery (a.k.a. ‘refactoring’).