# CMPE 172 Project Journal


Description: In this project, I'm going to build an application for cashier from different Starbucks branches to connect to the API service deployed on Cloud. Therefore, all information related to customer order, payment,etc will process on GKE. The reason for doing that because It will save more time if developer want to make update on the API so they just need to deploy the new API on Cloud and all processing in the backend in remote location will be taken care of.

Architecture Design
![Screen Shot 2022-12-07 at 9 23 46 PM](https://user-images.githubusercontent.com/48584294/206363523-31c4da1f-e5c7-47c4-a21e-161fb7162d52.png)


Cashier REST API
-------------------------------------------
- For this Starbucks API, I used the given API code from starter package and make changes in 
 application.properties to mapping the API to Cloud MySQL
 - deployment.yaml: I configured the loadbalancer including 4 pods, image to mapping to my built image on Docker Hub and the environment variable for MySQL including the Host IP, Username
 - service.yaml: I also create the targetPort and port to connect externally. 
![Screen Shot 2022-12-07 at 8 09 15 PM](https://user-images.githubusercontent.com/48584294/206354439-f8e2f147-53ac-445d-ab1b-d2398028f9ca.png)


- Finally I uploaded all those 2 yaml files on GKE for deployment. 
![Screen Shot 2022-12-07 at 8 11 46 PM](https://user-images.githubusercontent.com/48584294/206354735-eae17a28-0ac4-4e9b-bf8e-d3bd901e6f8a.png)
![Screen Shot 2022-12-07 at 8 12 06 PM](https://user-images.githubusercontent.com/48584294/206354776-1abdd384-8971-4ed4-a98c-05128bf8f6c2.png)

Cloud Deployments
-------------------------------------------
- For security reason and scalability, I also integrate the KONG API gateway in this app, Kong plays the role of the middleware to manage the communication between client and backend services. Kong acts as a reverse proxy to accept all API call, aggregate the various services and return the appropriate result. 
![Screen Shot 2022-12-07 at 8 14 53 PM](https://user-images.githubusercontent.com/48584294/206355125-13dde5ba-5f22-4bc4-a762-2f5758df09cd.png)


Implementation in Cashier app
-------------------------------------------
- User Login: I used the the Spring Security to avoid unauthorized access to the application. I decided to go for the BCrypted Encryption so It will be more secure because everytime of the deployment it will generate a new string
![Screen Shot 2022-12-07 at 8 50 59 PM](https://user-images.githubusercontent.com/48584294/206359460-f1d73965-17d8-47aa-b276-8e28163d64ef.png)
![Screen Shot 2022-12-07 at 8 51 11 PM](https://user-images.githubusercontent.com/48584294/206359485-377e0b6f-d0ed-4c0f-8964-8ba3bf98d815.png)

- Select option (drink,milk,size): There is an object implemented in the API project, so in my cashier app, I add the annotation for the Getter and Setter in the controller and add some lines of code in the HTML to handle the user input. When user submit the request for the order, the data will send back to the backend and set the value for the size, drink and milk. 
![Screen Shot 2022-12-07 at 9 08 47 PM](https://user-images.githubusercontent.com/48584294/206361653-5ebb38d8-2d37-4d3b-a13c-8c81c2c17ea9.png)


- Kong API Gateway: the cashier application running on localhost request using API Auth from Kong
![Screen Shot 2022-12-07 at 9 15 23 PM](https://user-images.githubusercontent.com/48584294/206362468-395eea20-0ad6-4669-b097-f8b09e89d34a.png)

Demo
-------------------------------------------
https://drive.google.com/file/d/1v5qeGfh3z5do1c8lTnvMhU9ZMdBsf8xg/view?usp=sharing

Project Tracker
-------------------------------------------
![Screen Shot 2022-12-07 at 9 36 40 PM](https://user-images.githubusercontent.com/48584294/206365251-84a368f4-5f21-47eb-b12c-9ebcc25fe659.png)







