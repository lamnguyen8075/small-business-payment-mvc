# CMPE 172 - Lab #7 spring-payments
## Description: 
In this project, student will follow the instruction to deploy the spring payments application and connect to Cybersource API to verify the Credit Card Information and recording the transaction informatino. Besides that student will also deploy a container for MySQL Database. The outcome is that student will have to successfully deploy the application, the output of transaction in Cybersource will be matching with the record in MySQL database. Also student will implement the user input validation to make sure the information is valid. 

## Reflection: 
This project is fun! I learnt how to generate the API key from Cybersource and perform testing to make sure the generated key is working and able to establish the connection from application to the Cybersource API. Additionally, I learnt how to implement user validation in Spring boot application and some javascript to handle the error message output. I really excited when I understand about how all packages in this project including Thymeleaf, JPA, Lombok, etc collaborating together to perform the data processing and visualizing template on the browser. It's such a fun experience!

## Screenshots + Explanation: 
- Testing generated keys
![Screen Shot 2022-11-06 at 5 58 23 PM](https://user-images.githubusercontent.com/48584294/200211260-e4f8cd87-16ab-40b1-819a-f752f511cf20.png)
![Screen Shot 2022-11-06 at 5 58 45 PM](https://user-images.githubusercontent.com/48584294/200211297-bd9d4386-c332-433e-9dc6-ab2e0dc0994a.png)


- All text fields are REQUIRED
![Screen Shot 2022-11-06 at 11 40 20 PM](https://user-images.githubusercontent.com/48584294/200252890-55695261-b3d2-4675-b008-79fb25056892.png)
![Screen Shot 2022-11-06 at 11 40 56 PM](https://user-images.githubusercontent.com/48584294/200253015-24a12b13-bec7-47f2-9524-21a6252a13bb.png)


- Invalid Credit Card Number
![Screen Shot 2022-11-06 at 11 42 57 PM](https://user-images.githubusercontent.com/48584294/200253431-c2c4ee3b-e8d0-4b4d-a77c-59f63a542737.png)

- Credit card type isn't supported
<img width="1670" alt="Screen Shot 2022-11-07 at 7 26 31 PM" src="https://user-images.githubusercontent.com/48584294/200468050-77428804-9b1d-47a1-b464-87b212e89129.png">


- [Decline - Invalid account number]
![Screen Shot 2022-11-06 at 11 49 27 PM](https://user-images.githubusercontent.com/48584294/200254565-38006147-3a61-4dff-9a5c-77e6e5bd6834.png)


- Place order successful -- Creditcard Authorized
![Screen Shot 2022-11-06 at 11 51 17 PM](https://user-images.githubusercontent.com/48584294/200254892-f2652164-4235-4a77-bff4-fcacc69b1690.png)
- Ouput from CYBERSOURCE matching with Transaction Information in MYSQL DATABASE
![Screen Shot 2022-11-07 at 12 05 20 AM](https://user-images.githubusercontent.com/48584294/200257509-b7fe2f33-e525-42c2-be60-a273f4c42565.png)


- Transaction Detail on Cybersource
![Screen Shot 2022-11-07 at 12 02 11 AM](https://user-images.githubusercontent.com/48584294/200256906-b8e95f71-a97a-452a-8139-8333605579f3.png)
- MySQL containers is running
![Screen Shot 2022-11-07 at 12 20 23 AM](https://user-images.githubusercontent.com/48584294/200260401-97c07661-3296-4568-923d-2887fe826a72.png)


## Discussion
#### Lombok: this is the annotation-based Java library help reducing the boilerplate code in the Java project. The lombok provides various annotations especially Getters/Setters/Constructors. It reduces repetitive. 
![Screen Shot 2022-11-07 at 12 31 47 AM](https://user-images.githubusercontent.com/48584294/200262605-af7b42f2-2068-40f2-b948-50cc4b8f1636.png)
![Screen Shot 2022-11-07 at 12 32 13 AM](https://user-images.githubusercontent.com/48584294/200262715-25066292-b5f2-440e-9791-41cfa5d4ed8b.png)


#### ThymeLeaf: The thymeleaf template help to process HTML, XML, JS and CSS. In this project, we have the HTML template to display the application and some javascript component to handle the output 
- HTML Template
![Screen Shot 2022-11-07 at 12 26 12 AM](https://user-images.githubusercontent.com/48584294/200261509-d2a6e20b-0f40-4860-b6c3-ea090a3a0bad.png)
- Javascript components
![Screen Shot 2022-11-07 at 12 26 58 AM](https://user-images.githubusercontent.com/48584294/200261650-df71d88f-875f-4eb0-b293-969aa90d1707.png)


#### Spring Data JPA: This feature help to managing the relational data in Java application. JPA provide Object Relation Mapping (ORM). Spring Data JPA improve the data access layers and reducing the effort of implementing code to establish database connection. 
![Screen Shot 2022-11-07 at 12 40 36 AM](https://user-images.githubusercontent.com/48584294/200264336-ebf9dbc9-290d-4df4-9c4a-84fdbafe343d.png)
![Screen Shot 2022-11-07 at 12 41 08 AM](https://user-images.githubusercontent.com/48584294/200264467-7305b643-b7eb-43a2-9345-9b815c9d413e.png)


#### Jackson JSON
- What is it? It's a high-performance JSON processor for Java application. Jackson is the json library that has built in ObjectMapper class. The responsible is to parsing the JSON files and deserializing them into Java objects. Jackson class also provide parser and generator one token at a time. 

- ObjectMapper [readTree]: I will take an example of using ObjectMapper in AuthResponse.java. We used readTree method to deserialize the JSOn content as a tree and expressed the new deserialization content as a set of JSON instance. The return the root of the resulting tree. 
- ObjectMapper [writeValueAsString]: I will take an example of using ObjectMapper in Payload.java. We used writeValueAsString method to deserialize Java value as String. 

- Usage
![Screen Shot 2022-11-07 at 1 00 00 AM](https://user-images.githubusercontent.com/48584294/200269465-64d4b970-7715-49a2-ac48-c6de8c81f3f5.png)
![Screen Shot 2022-11-07 at 1 00 50 AM](https://user-images.githubusercontent.com/48584294/200269611-2ee7c257-be32-4f04-baf6-f8d94774cac8.png)
![Screen Shot 2022-11-07 at 1 01 17 AM](https://user-images.githubusercontent.com/48584294/200269693-bac837c7-dc6c-416f-a7ba-253dd4610841.png)

