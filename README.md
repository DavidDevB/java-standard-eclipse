# Java Standard

Série d'exercices utilisant les bases de Java sur Eclipse.

## Exercice 3

Progamme servant à déterminer si un nombre est positif, négatif ou nul et pair ou impair.

Méthodes:
- containsNumberPatternMatcher(): vérifie si l'entrée est un nombre.

## Exercice 4

Programme servant à enregister les notes de chaque élève d'une classe et à les afficher ensuite.
Il permet aussi de rechercher chaque élève à partir de leurs nom et prénom.

Méthodes:
- displayAllStudents(): affiche la liste des étudiants enregisterés avec leurs notes.
- searchOneStudent(): recherche et affiche l'étudiant tapé en entrée.
- sortStudents(): tri la liste d'étudiants en ordre croissant ou décroissant.
- isTwoWords(): vérifie que la string est composée de deux mots.
- findMin(): trouve le nombre le plus petit.
- findMax(): trouve le nombre le plus grand.
- findAverage(): donne la moyenne à partir de plusieurs nombres.
- getNames(): récupère le prénom et nom tapés en entrée et les stocke dans un tableau.
- findAverageFromStudent(): calcule la note moyenne d'un étudiant.

## TP1

Jeu proposant de trouver un nombre en le devinant. Il indique à chaque coup si le nombre entré est plus petit ou plus grand que le nombre à deviner.

Méthodes:
- wantToPlay(): demande à l'utilisateur s'il veut jouer et retourne un booléen.
- makeANumber(): retourne un nombre aléatoire entre 1 et 100.
- chooseANumber(): retourne le nombre entré par l'utilisateur.

## Exercice 5

Programme servant à déterminer si une phrase est un palindrome et si elle contient un mot tapé en entrée.

Méthodes:
	- checkWordAndIfPalindrome(): dis à l'utilisateur si le mot ou la phrase est un palindrome.
	- isPalindrom(): vérifie que l'entrée est un palindrome ou non. Retourne un booléen.
	- revers(): inverse le sens de la phrase ou du mot.

## Exercice 6

- Matrix: Programme servant à effectuer des opérations entre des matrices de nombres bidimensionnelles.
Méthodes:
	- add(): additionne deux matrices entre elles.
	- sub(): soustrait deux matrices entre elles.
	- mul(): multiplie une matric epar un nombre.

- MaxSum: Programme faisant la somme des deux nombres les plus grands issus d'une liste.
Méthodes:
	- removeMaxNumber(): retire le nombre le plus grand d'une liste et recréé un tableau d'integers.
	- findMax(): trouve le nombre le plus grand dans une liste d'integers.
	- generateNumbers(): généère un tableau d'x integers.

- Operation: Programme effectuant les opérations mathématiques basiques (addition, soustraction, ...).
Méthodes:
	- add(): additionne deux nombres entre eux.
	- sub(): soustrait deux nombres entre eux.
	- mul(): multiplie deux nombres entre eux.
	- div(): divise deux nombres entre eux.

- Triangle: Programme affichant un triangle dans la console.

## TP2

Programme simulant le choix d'un menu au restaurant. L'utilisateur choisit ce qu'il veut manger dans plusieurs listes. Le menu final est alors affiché.

## Exercice 7

Programme effectuant l'opération de factoriel.
Méthodes:
	- factorial(): fait la factorielle d'un nombre n.
	
## TP3

Programme simulant le jeu du pendu. Permet d'entrée une lettre à la fois en ayant le droit à 10 erreurs.
Métodes:
	- getWord(): sélectionne un mot au hasard dans une liste prédéfinie. celui-ci devra être deviné.
	

## Exercice 8

Programme qui détermine qui d'une liste d'invités est une célébrité ou un quidam en filtrant les invités.

## TP4

Programme type "Mastermind" qui génère un code à 4 chiffres et qui permet d'entrer un code du même type pour le deviner. Boucle jusqu'à ce quon devine le bon code.