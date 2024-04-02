# Arbre

Arbre est une application de bureau développée en Java permettant de gérer sa bibliothèque de jeux vidéos de manière ergonomique et intuitive. Elle utilise une approche centrée sur les tags pour catégoriser et filtrer les jeux.

## Fonctionnalités principales

- Visualisation de sa bibliothèque de jeux avec vues compacte (liste) et détaillée
- Ajout, suppression et recherche de jeux 
- Récupération des informations et images des jeux via l'API RAWG
- Gestion de tags personnalisés pour catégoriser les jeux
- Filtrage multi-critères des jeux par tags
- Persistance des données en local

## Dépendances et librairies utilisées

- Java 21 
- JavaFX 19 pour l'interface graphique
- API RAWG (https://rawg.io) pour les données des jeux
- Librairie HTTP client pour les requêtes à l'API (java.net.http ou OkHttp ou autre)
- Jackson pour le parsing JSON

## Lancement de l'application 

- Télécharger le JAR exécutable `Arbre.jar`
- Exécuter la commande `java -jar Arbre.jar`
- L'application nécessite une connexion internet pour récupérer les données des jeux via l'API

## Développement

- Cloner le repository : `git clone https://github.com/Hawordd/Arbre.git`
- Ouvrir le dossier avec un IDE Java (ex : IntelliJ)
- Configurer le SDK 21 et JavaFX 19
- Lancer la classe `Arbre.main()`

## Contributeurs

- Matthis (Hawordd)
- Lou-Ann
- Gaël
- Théo

Réalisé dans le cadre de la SAE 2.01 du BUT Informatique de l'IUT de Laval.
