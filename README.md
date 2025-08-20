# Simple_RPG_Battle_System
A simple turn base game battle.

## Description:
Create a simple turn-based battle system between a Player and an Enemy. Each character has health, attack power, and defense. The player can choose actions each turn: attack, defend, or heal. The enemy will always attack on its turn.

## Requirements:

## Classes:

## Character (abstract):

### Fields: 
 - name
 - health
 - attackPower
 - defense

### Methods: 
- attack()
- takeDamage()
- isAlive()


### Player (extends Character):

 - Additional method: heal()

-  Method to choose action (attack/defend/heal)

### Enemy (extends Character):

 - Always attacks

## Gameplay:

On each turn, the player chooses an action:

### *Attack:* 
 - Deals damage to the enemy (damage = attackPower - enemy.defense).

### Defend: 
- Reduces incoming damage on next enemy attack by half.

### Heal: 
- Restores some health.

The enemy attacks the player (damage = attackPower - player.defense).

Game continues until either the player or enemy's health drops to 0.

## Extra Features (Optional):

Add randomness to attacks (e.g., critical hit chance).

Multiple enemy types with different stats.

Display turn summary after each round.
