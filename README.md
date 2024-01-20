Design and code a simple board game that N players can play.

The game has a board of M spaces and a deck of C cards.
Each card has a "spaces" value S such that -M ≤ S ≤ M.
The deck should be generated randomly.

On a player's turn, they can either choose to move one space forward, or, if the deck is not empty, 
they can choose to draw a card and immediately move S spaces.

First player to advance M spaces is the winner.

We expect this simple game to evolve in the future, but we don't exactly know how yet. 

Can you code the prototype so that adding new gameplay features is as painless as possible?



----
N - no of players
(-)M - value of spaces card can have
M - winner has moved this amount of spaces
----