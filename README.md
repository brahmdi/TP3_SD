# TP3_SD
Partie 1:
Création d'une application Web JEE utilisant Spring MVC, Thymeleaf et Spring Data JPA, intégrant les fonctionnalités suivantes :

Affichage des patients :
- Création d'un fichier HTML pour afficher la liste des patients avec Bootstrap et Thymeleaf.
  - Résultat : Affichage d'une table de patients dans la base de données H2.

Pagination :
- Mise en place d'un contrôleur Patient pour la pagination.
- Code HTML pour la pagination.
- Résultat de la pagination.

Recherche de patients :
- Modification du fichier PatientRepository.
- Modification du code HTML pour permettre la recherche de patients.
- Résultat de la recherche de patients.

Suppression d'un patient :
- Ajout d'un bouton de suppression.
- Suppression du patient ayant l'ID 31.
- Résultat après la suppression.

Améliorations supplémentaires :
- Utilisation des icônes Bootstrap pour améliorer l'interface.

Partie 2:
Création d'une page template :
- Ajout d'une page template 1 HTML.
- Affichage du résultat avec une barre de navigation.

Validation des formulaires :
- Création d'un formulaire pour ajouter un patient.
- Modification des informations d'un patient (avant et après).
- Création d'un formulaire pour modifier les informations d'un patient.

Partie 3: Sécurité avec Spring Security :
- Configuration de Spring Starter Security et réception d'un mot de passe dans la console.
- Création de SecurityConfig.
- Gestion des accès pour les utilisateurs et les administrateurs.
- Affichage des vues pour un utilisateur authentifié, un administrateur, et en cas de tentative d'accès non autorisée.
- Changement de la page de connexion et autorisation d'accès à Bootstrap.
- Mise en place d'une nouvelle page de connexion.
