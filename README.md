## Snack Shack Kata - The Brief


In this kata you’ll be exploring logic around using code to prioritise different sandwich orders made to a café.

Each of those types of food take different preparation times, your task is to write a programme that takes in a list of orders and returns the
amount of time required to fulfil that order.

We’ll start off with sandwiches....
## Sandwiches

To make each sandwich it takes 1 minute. Then it takes 30 seconds to serve the sandwich and collect money from the customer. For example if
you have 4 orders from 4 different customers then you can expect this:

* 0:00 4 sandwich orders placed, start making sandwich 1
* 1:00 serve sandwich 1
* 1:30 make sandwich 2
* 2:30 serve sandwich 2
* 3:00 make sandwich 3
* 4:00 serve sandwich 3
* 4:30 make sandwich 4
* 5:30 serve sandwich 4
* 6:00 take a well earned break!


Firstly, create code that produces a schedule for the given customer orders.

Then modify your code so that it returns an estimate of how long each customer will have to wait from the order being placed to getting their food.

Avoid letting people down.

Through research we’ve found that people get unhappy if they wait longer than 5 minutes for their sandwich and then they refuse to pay. This
particular café wishes to remain economic and avoid food waste.

So in the example above sandwich 4 would have been too late.

Modify the order placement so that it rejects orders that cannot be served in time.


Some notes to guide you

* Consider your test sampling - The above example shows each customer ordering one sandwich, what about when a single customer
orders multiple sandwiches.
* This is the type of kata exercise you might experience in an interview. Within interviews you’re often encouraged to ask questions around
the brief and clarify understanding, we really encourage you to discuss the brief on Slack and gather thoughts from your peers.
* You’ll find a starter repository included in the links for this assignment.
* Starter repositories are set up in the language (or languages) of your programme.
* If there are multiple starter repositories such as Scala and TypeScript then you are free to complete the kata in any of the options
provided.
* Starter repositories are setup with a testing framework ready to run any unit tests you might write.
* We’d recommend attempting the task in a Test Driven Development (TDD) fashion. Whilst it of course can be completed in a variety of
approaches, TDD will assist in breaking down the problem and evolving the solution as you explore ideas.
