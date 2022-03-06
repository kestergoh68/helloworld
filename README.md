# helloworld
A simple hello world application

**How to run**   
__Windows__  
*Please make sure openjdk11, maven and docker is installed
1) open cmd and cd to project directory 
2) mvn clean install  
3) docker-compose up or docker-compose up -d (to run in background)

__Linux__  
*Please make sure openjdk11, maven and docker is installed  
*This method run bash shell script that contains maven install and docker-compose which is the same as the Windows method
1) open terminal and cd to project directory 
2) chmod +x build.sh 
3) ./build.sh

__Run by loading docker image__    
*Please make sure docker is installed 
1) Download helloworld_demo.tar.gz from release
2) open cmd and cd to project directory
3) Enter “docker load < helloworld_demo.tar.gz”
4) Enter “docker run -p 5000:8080 demo/helloworld”

Verification  
Please access http://localhost:5000/hello in browser to verify
