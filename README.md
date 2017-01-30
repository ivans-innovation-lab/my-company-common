# my-company-common

Domain Driven Design is applied through:

1. Command and Query Responsibility Separation (CQRS)
2. Event Sourcing

## Events

Commands are messages with intent of doing something. On the other hand, after this something is done, another messages can be produced as a result - Events. They represent a fact.

In Axon, you just need to write your own Event classes. All the infrastructure that is responsible for handling them is there for you. Because of that, you can use your Events to integrate with other, non-Axon-based systems easily.

