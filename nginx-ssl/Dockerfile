FROM nginx:latest
 
COPY nginxssl  /etc/nginx/sites-enabled/nginxssl
COPY nginx.crt /etc/ssl/
COPY nginx.key /etc/ssl
COPY index.html /var/www/nginx/
EXPOSE 8134:80
