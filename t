sudo apt-get install docker
docker
sudo apt update
sudo apt list --upgradable
sudo apt update
sudo apt upgrade
clear
sudo apt-get install ca-certificates curl gnupg
sudo install -m 0755 -d /etc/apt/keyrings
curl -fsSL https://download.docker.com/linux/debian/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg
sudo chmod a+r /etc/apt/keyrings/docker.gpg
echo   "deb [arch="$(dpkg --print-architecture)" signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/debian \
  "$(. /etc/os-release && echo "$VERSION_CODENAME")" stable" |   sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt-get update
sudo apt install docker
clear
docker
sudo apt remove docker
sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
sudo docker run hello-world
sudo systemctl start docker
systemctl start docker
systemctl status docker.service
systemctl start docker
sudo -i
sudo groupadd docker
sudo usermod -aG docker $USER
newgrp docker
docker run hello-world
docker run --help
reboot
restart
ping localhost
curl localhost
curl localhost:8080
ls /etc/nginx/sites-available/
docker run --rm -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker run --restart=always --rm -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker run --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker run -d --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker
docker run hello-world
docker login
docker pull nikolatutic/site:latest
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run nikolatutic/site:0.0.1-SNAPSHOT
clear
sudo apt install nginx
sudo systemctl start nginx
sudo systemctl enable nginx
sudo vim /etc/nginx/sites-available/tutic_ca
sudo ln -s /etc/nginx/sites-available/tutic_ca /etc/nginx/sites-enabled/
sudo nginx -t
sudo systemctl restart nginx
sudo apt install certbot python3-certbot-nginx
sudo certbot --nginx -d tutic.ca -d www.tutic.ca
sudo certbot renew --dry-run
docker run --rm -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
ls /etc/nginx/sites-available/
ls /etc/nginx/sites-enabled/
sudo rm /etc/nginx/sites-enabled/default 
sudo nginx -t
sudo systemctl reload nginx
curl localhost
ls /etc/nginx/sites-enabled
cat /etc/nginx/sites-available/tutic_ca 
sudo nginx -T
curl localhost:8080
curl localhost
sudo systemctl restart nginx
curl localhost
curl localhost/8080
curl localhost:8080
cat /etc/nginx/sites-available/tutic_ca 
sudo vim/etc/nginx/sites-available/tutic_ca 
sudo vim /etc/nginx/sites-available/tutic_ca 
sudo systemctl restart nginx
curl localhost:8080
curl localhost
sudo vim /etc/nginx/sites-available/tutic_ca 
sudo systemctl restart nginx
curl localhost
sudo certbot --nginx -d tutic.ca -d www.tutic.ca
curl localhost
sudo vim /etc/nginx/sites-available/tutic_ca 
sudo nginx -t
sudo systemctl restart nginx
curl localhost
curl localhost:8080
curl localhost
curl https://localhost
curl https://localhost:8080
top
top -i
top
docker ps
docker stop nikolatutic/site:0.0.1-SNAPSHOT
docker stop 73ff34ece9ea
docker ps
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run --rm -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker r ps
docker ps
docker run --restart-always -d 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker run --restart=always -d 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker login
docker run --restart=always -d 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker run --restart=always 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker run -d 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker run --restart=always -d nikolatutic/site:0.0.1-SNAPSHOT
docker ps
docker stop epic_hypatia
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run --restart=always -d nikolatutic/site:0.0.1-SNAPSHOT
docker ps
docker stop wonderful_mahavira
docker run -d --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run -d --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT --name tutic_ca
docker ps
docker stop agitated_pasteur
docker run -d --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT --name tutic_ca
docker ps
docker stop zen_torvalds
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker ps
docke kill tutic_ca
docker kill tutic_ca
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker ps
docker remove
docker rm 0d3d4ea9ee65273918181ef886294539430e493fed69b4fe44b9bd47572ac780
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker ps
docker kill tutic_ca
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker rm 5fa29cd3efdc05062d29f6faaa3efbb581c4b7545c11c84580075eb0dcdbca42
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker kill tutic_ca
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker remove f789f553063f130be8c3202d3705308c80702c4308de927e274cd907b2d9624f
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker kill tutic_ca
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker remove 3b369096c115e22277e820598226f9ebec8d45543b588068e399c4a9f8317f68
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker kill tutic_ca
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
ducker remove f3a3a554b116f27023b96177514112a6c6adffc219314c0d74828904361b976b
docker remove f3a3a554b116f27023b96177514112a6c6adffc219314c0d74828904361b976b
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker ps
docker kill tutic_ca
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker remove 5b2d0a1a2d761945e16758691afbf896e29581ece62144de645cc32e21c9eb15
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
ls
cd code
ls
ls -a
exit
docker ps
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker ps
docker kill tutic_ca
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker remove f2a7319efd3e2d86707c47e85bfef6f98b6ae5bcb91cdd896e43cb8958760a0a
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
exit
docker ps
docker kill f1
docker ps
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker kill f13cbe46e502bb058e19dcec18f55466702c40d20140410dbae21d5da7367dcb
docker terminate tutic_ca
docker remove f13cbe46e502bb058e19dcec18f55466702c40d20140410dbae21d5da7367dcb
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker ps
docker remove d42
docker kill tutic_ca
docker remove d42
docker ps
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
ls
ls -a
ls /
docker ps
docker remove 0d
docker kill tutic_ca
docker remove 0d
docker ps
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
docker ps
docker kill tutic_ca
docker terminate 76
docker remove 76
docker pull nikolatutic/site:0.0.1-SNAPSHOT
docker run -d --name tutic_ca --restart=always -p 8080:8080 nikolatutic/site:0.0.1-SNAPSHOT
