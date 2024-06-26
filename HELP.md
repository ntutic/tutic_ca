https://docs.docker.com/engine/install/debian/
sudo apt update
sudo apt upgrade
sudo apt-get install ca-certificates curl gnupg



# Add Docker's official GPG key:
sudo apt-get update
sudo apt-get install ca-certificates curl
sudo install -m 0755 -d /etc/apt/keyrings
sudo curl -fsSL https://download.docker.com/linux/debian/gpg -o /etc/apt/keyrings/docker.asc
sudo chmod a+r /etc/apt/keyrings/docker.asc

# Add the repository to Apt sources:
echo \
"deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://download.docker.com/linux/debian \
$(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \
sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt-get update

# Install dependencies
sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
sudo docker hello-world

# Permissions
sudo usermod -aG docker $USER
sudo reboot



# Nginx
sudo apt install nginx
sudo systemctl start nginx
sudo systemctl enable nginx
sudo vim /etc/nginx/sites-available/tutic_ca
sudo ln -s /etc/nginx/sites-available/tutic_ca /etc/nginx/sites-enabled/
sudo nginx -t
sudo systemctl restart nginx

# Certbot
https://certbot.eff.org/instructions?ws=nginx&os=debiantesting
sudo apt install snapd
sudo snap install --classic certbot
sudo ln -s /snap/bin/certbot /usr/bin/certbot
sudo certbot --nginx -d tutic.ca -d www.tutic.ca
sudo certbot renew --dry-run


### EC2 config

Instantiate Debian EC2 with HTTP and HTTPS traffic allowed



# How to

Compile w/ GraalVM with :

```
$ ./mvnw spring-boot:build-image -Pnative
```

Or in Idea's run anything with :

```
mvn -Pnative spring-boot:build-image
```

Push/pull container :

```
docker tag tutic_portfolio:0.0.1-SNAPSHOT nikolatutic/tutic_portfolio:0.0.1-SNAPSHOT
docker push nikolatutic/tutic_portfolio:0.0.1-SNAPSHOT
docker pull nikolatutic/tutic_portfolio:0.0.1-SNAPSHOT
```

Run :
```
docker run -d --name tutic_portfolio --restart=always -p 9001:8080 nikolatutic/tutic_portfolio:0.0.1-SNAPSHOT
```

---

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.1.4/reference/html/native-image.html#native-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#using.devtools)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Additional Links

These additional references should also help you:

* [Configure AOT settings in Build Plugin](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/htmlsingle/#aot)

## GraalVM Native Support

This project has been configured to let you generate either a lightweight container or a native executable.
It is also possible to run your tests in a native image.

### Lightweight Container with Cloud Native Buildpacks

If you're already familiar with Spring Boot container images support, this is the easiest way to get started.
Docker should be installed and configured on your machine prior to creating the image.

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image -Pnative
```

### Executable with Native Build Tools

Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM `native-image` compiler should be installed and configured on your machine.

NOTE: GraalVM 22.3+ is required.

To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

You can also run your existing tests suite in a native image.
This is an efficient way to validate the compatibility of your application.

To run your existing tests in a native image, run the following goal:

```
$ ./mvnw test -PnativeTest
```

