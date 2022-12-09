# CMPE 172 - Lab #1 Notes
#### <ins>1. Spring Demo App Using Spring Initializr</ins>


**1.1 Description**: In this story, developer has hands on experiences with Spring Boot.

**1.2. Steps**:

- Generate zip file "demo-initializr" on start.spring.io.
- Update the DemoInitializrApplication.java according to instruction.
- Compile and run main function in DemoInitializrApplication class
- Run the Demo app by opening localhost:8080/hello.
- Ouput display on web browser as expected.

**1.3. Screenshot**:

&nbsp;&nbsp;1.3.1. Browser
&nbsp;&nbsp;![Screen Shot 2022-09-12 at 4 52 38 PM](https://user-images.githubusercontent.com/48584294/189778417-6036ea84-36a4-4d31-8fb5-5511a7a6f728.png)
&nbsp;&nbsp;1.3.2. Fullscreen
&nbsp;&nbsp;![Screen Shot 2022-09-12 at 4 52 18 PM](https://user-images.githubusercontent.com/48584294/189778431-9959f673-787e-4ebd-91ed-812045f2e776.png)


#### <ins>2. Spring Demo App Configured for Docker and Kubernettes</ins>
**1.1 Description**: In this story, developer has hands on experiences with Spring Boot.

**1.2. Steps**:

- Generate zip file "demo-docker" on start.spring.io
- Update the DemoVscodeApplication.java according to instruction
- Compile and run the main function of DemoVscodeApplication clas
- Run the Demo app by opening localhost:8080/hello - Testing the code before creating docker image
- Ouput display on web browser as expected
- Run the mvn package to create the package of all file 
- Run the docker build image to create the image from the package
- Build the image from docker desktop or terminal, make sure the command using define the port number of that you mapping from docker container to your host machine.
- Run the docker image on local machine to verify the success 
- Push the image on Docker Hub
- Created and configured Kubernetes on Google Cloud Service
- Upload configuration files on the created Cluster
- Test the image on on assigned IP address and port 80
- Ouput display on web browser as expected.

**1.3. Reflection **:
At the beginning, the docker image was built with all given files and the docker build output with error including incorrect jar file. Additionally, I confused the different between MAVEN and GRADLE in the Makerfile. After a quick research and revising the related concept on Docker Image, I figured out the issue by updating the Dockerfile, pod.yaml and service.yaml.


**1.4. Screenshot**:
&nbsp;&nbsp;1.4.1. Browser
* Local Deployment from VSC
![Screen Shot 2022-09-12 at 4 16 55 PM](https://user-images.githubusercontent.com/48584294/189780842-35df2e4e-dd5f-4362-8813-3bbc6e4b8e19.png)

* Deployment from Docker Container
![Screen Shot 2022-09-12 at 4 18 26 PM](https://user-images.githubusercontent.com/48584294/189780866-927ad8fa-2375-4f98-87bb-10fcb552cb85.png)

* Deployment from Google Kubernetes Engine
![Screen Shot 2022-09-12 at 4 44 38 PM](https://user-images.githubusercontent.com/48584294/189780770-b59f2da8-fd70-4fac-91cb-f04e244e1313.png)

&nbsp;&nbsp;1.4.2. Full Desktop
* Run docker image 
![Screen Shot 2022-09-12 at 4 23 14 PM](https://user-images.githubusercontent.com/48584294/189781099-92b52351-3357-49c1-843f-dfc368701341.png)
* Push docker image on Docker Hub
![Screen Shot 2022-09-12 at 4 26 06 PM](https://user-images.githubusercontent.com/48584294/189781185-5dbf2c93-ff87-4286-981c-ede9f4896025.png)
*  Create cluster on Kubernetes Engine
![Screen Shot 2022-09-12 at 4 39 01 PM](https://user-images.githubusercontent.com/48584294/189781227-b4da7eae-c193-421e-b1e5-0874bfbc0160.png)
* Cluster build
<img width="1389" alt="Screen Shot 2022-09-12 at 6 14 41 PM" src="https://user-images.githubusercontent.com/48584294/189785974-44711f0f-ce6d-4f59-8a9b-72e7fb33955d.png">




#### <ins>3. Spring Demo App Using JetBrains Intellij IDEA</ins> 
**3.1. Description**: In this story, developer tried to build the Spring Boot application using IntelliJ IDEA

**3.2. Steps**:
- Generate zip file "demo-intellij" on start.spring.io
- Update the DemoIntellijApplication.java according to instruction
- Start localhost server
- Compile and run the Demo app by opening localhost:8080/hello
- Ouput display on web browser as expected

**3.3. Problem**: Currently taking CS157A using MySQL server and also doing homework at the same time. SQL server has been running and It took over the port 8080. When deployed the Spring Boot Application, It kept failing and produce the error about port 8080 is in used
. Finally, I came up with 2 solution!

1. Start and Stop MySQL server after using it.
2. Update the port on MySQL server to make sure it won't conflict with Spring Boot Application deployment in the future.

**3.4. Screenshot**:
1. Browser
![Screen Shot 2022-09-12 at 4 56 28 PM](https://user-images.githubusercontent.com/48584294/189779061-9476d676-4c52-41e9-bc8a-6e9c9155c070.png)

2. Full Desktop
![Screen Shot 2022-09-12 at 5 00 33 PM](https://user-images.githubusercontent.com/48584294/189779046-dc7859c5-e97c-41c5-aa01-a5dccf3ffcd6.png)

