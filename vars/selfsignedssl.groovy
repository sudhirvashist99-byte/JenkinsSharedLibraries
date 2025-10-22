def call(){
  sh '''
    mkdir -p nginx/ssl
    openssl req -x509 -nodes -days 365 -newkey rsa:2048 \
        -subj "/C=IN/ST=State/L=City/O=Org/OU=IT/CN=localhost" \
        -keyout nginx/ssl/nginx-selfsigned.key \
        -out nginx/ssl/nginx-selfsigned.crt
'''
}
