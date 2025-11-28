# Étape 1 : Utiliser l’image de base Nginx
FROM nginx:latest

# Étape 2 : Copier ton fichier index.html dans le bon répertoire du conteneur
COPY index.html /usr/share/nginx/html/index.html
