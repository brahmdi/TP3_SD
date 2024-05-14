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
![image](https://github.com/brahmdi/TP3_SD/assets/96790699/66531af8-5529-4eef-9573-676c3455a374)

Recherche de patients :
- Modification du fichier PatientRepository.
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/4e230b3f-353e-4bbe-b115-68e2612ff777)

- Modification du code HTML pour permettre la recherche de patients.
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/1c0f7ea6-6186-4619-941f-ce34c1ce26b9)

- Résultat de la recherche de patients.
![image](https://github.com/brahmdi/TP3_SD/assets/96790699/c7ca1b7f-c4f3-4a3e-963b-51adfbc5b56e)

Suppression d'un patient :
- Ajout d'un bouton de suppression.
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/467cdb4d-093c-4dfe-8a6c-5bff5172258b)

- Suppression du patient ayant l'ID 3.
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/7854bd91-0916-4bc6-af03-b283a1030c7a)

- Résultat après la suppression.
![image](https://github.com/brahmdi/TP3_SD/assets/96790699/a499ca83-8130-4bb9-9f2a-1760a6c331d1)

Partie 2:
Création d'une page template :
- Ajout d'une page template 1 HTML.
- Affichage du résultat avec une barre de navigation.
![image](https://github.com/brahmdi/TP3_SD/assets/96790699/53b821eb-863f-4d86-83d9-842da7e6657e)

Validation des formulaires :
- Création d'un formulaire pour ajouter un patient.
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/16bdf7a8-d406-42bd-ac98-2f18fcd55972)

- Modification des informations d'un patient (avant et après).
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/be76f130-5413-40cd-ac46-06c226284166)

Partie 3: Sécurité avec Spring Security :
- Configuration de Spring Starter Security et réception d'un mot de passe dans la console.
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/6195a075-93ca-4865-befe-a2d7e7313b97)

- Création de SecurityConfig.
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/b386f069-19a6-45a3-bfe7-559cd788061f)

- Gestion des accès pour les utilisateurs et les administrateurs.
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/5f4f404a-c25a-4e12-bcc1-b47897b4f2ee)

- Affichage des vues pour un utilisateur authentifié, un administrateur, et en cas de tentative d'accès non autorisée.
  admin :
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/c6d4180f-befa-400f-8178-2ea01ee4f910)
  user :
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/cb241b2f-0071-49f6-9183-f7c0e693ca4d)


- Changement de la page de connexion et autorisation d'accès à Bootstrap.
  ![image](https://github.com/brahmdi/TP3_SD/assets/96790699/ad3ff84e-daec-49d4-95be-674808dcb593)
