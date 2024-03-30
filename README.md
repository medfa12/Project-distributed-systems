
# Med Fadi Abaidi IGL3

# Projet de Communication Distribuée en Java

  

## Technologies

  ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white )
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
-  **Java RMI**: Java Remote Method Invocation est une technologie de communication distribuée transparente qui permet d'appeler des méthodes sur des objets distants comme s'ils étaient locaux.

-  **gRPC**: gRPC est un framework open source de communication RPC (Remote Procedure Call) moderne et performant.

-  **Sockets**: Les sockets fournissent une interface de programmation permettant la communication entre deux processus sur un réseau.

  

## Fonctionnalités

  

### Java RMI

  

-  **Gestion d'une liste de tâches** :

- Ajouter une nouvelle tâche à la liste.

- Supprimer une tâche existante de la liste.

- Récupérer la liste complète des tâches.

  

### gRPC

  

-  **Service de messagerie** :

- Envoi de messages texte à un destinataire spécifié.

- Récupération des messages reçus pour un utilisateur donné.

  

### Sockets

  

-  **Service de chat** :

- Envoi de messages texte à un salon de discussion commun.

- Récupération des messages envoyés par d'autres utilisateurs.

  

## Installation

  

Avant d'exécuter la technologie GRPC , assurez-vous d'avoir installé Apache Maven.

  

### Java RMI

  

1. Démarrer le serveur des tâches

```

java RMI/TaskServer.java

```

2. Démarrer le client

```

java RMI/TaskClient.java

```

### gRPC

  

1. Installer les dépendances Maven :

```

mvn install

```

3. changer le repertoire courant:

```

cd grpc/grpcMessage

```

2. Compiler le code *Facultatif* :

```

mvn clean compile

```

3. Démarrer le serveur

```

mvn exec:java@server-execution

```

4. Démarrer le client

```

mvn exec:java@client-execution

```

### Sockets

  

1. Démarrage du serveur:

```

java sockets/ChatServer.java

```

2. Démarrage du client:

```

java sockets/ChatClient.java

```