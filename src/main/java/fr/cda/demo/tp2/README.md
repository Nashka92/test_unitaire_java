<h2>TP - Test unitaire avec Junit et Mockito</h2>
__________________
<h3>Description</h3>

Dans le cadre de ma formation concepteur développeur d'application,
nous avons réalisé un TP Java sur les test unitaire avec JUnit 5 ainsi que la manipulation des mock avec le framework Mockito.
__________________

<h3>Features</h3>

Pour réaliser ce TP, nous avons du suivre un Diagramme de classe et l'adapter à notre code. Il contient plusieurs classes :
<ul>
<li>
Salaire
</li>
<li>
Identite
</li>
<li>
Adresse
</li>
<li>
Salarie
</li>
<li>
SalarieCdi
</li>
</ul>

Dans un premier temps, nous avons du coder tout cela avec différentes méthodes et les relations.

En ce qui concerne les méthodes, elles sont principalements dans les classes :

- Salaire
- Salairie

Les classes comment <b>Identite</b>, <b>SalaireCdi</b> et <b>Adresses</b> servent à stocker les informations, elles ne 
contiennent aucunes de méthodes.

__________________

<h3>Test Unitaire et Mock</h3>

Une fois les fonctionnalités implantés dans le code, nous avons du réaliser les <b>Test Unitaire</b> avec <b>JUnit</b> 
et <b>Mockito</b>. J'ai commencé le test unitaire par la classe qui nécessité de Mock et donc la classe <b>SalarieCdi</b>. 

Etant donnée que la classe Salarie est une classe abstraite (et donc impossible d'instancier) je suis passé par la classe
enfant <b>SalarieCdi</b> et y implémenter mon test unitaire et la manipulation des mocks.


La classe Adresse et Identite, étant des classes qui ne contiennent que de la data, je les ai mocked dans mon test SalaireCdi
et par ce faire il n'était pas nécéssaire de créer des test unitaire pour ces deux classes, les mocks suffisent et sont là pour cela.

Le mocks permet de simuler le comportement d'un autre objet concret de façon maitrisée et de vérifier les invocations 
qui sont faites de cet objets.

__________________

<h3>Petite conclusion </h3>

En conclusion, ce TP nous a permis de nous familiariser avec non seulement l'utilité et l'importance des test unitaire 
mais aussi la compréhension et la manipulations des mock sur différents scénarios.

Le but de l'exercice est de confronter une fonction de code et de fonctionnalités aux exigences de conception
correspondantes, et donc de s'assurer qu'elle fonctionne correctement en toutes circonstances et maintenir la durabilité
de ce dernier.

