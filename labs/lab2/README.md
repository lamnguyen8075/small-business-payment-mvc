# CMPE 172 - Lab #2 Notes

#### <ins>1. Spring MVC Project - Serving Web Content with Spring MVC</ins> 
**Description**: This assignment required student to run a basic Web content with Spring boot MVC. Student wil build a small HTML Greeting view to display the Greeting Started Application on GKE via Spring boot. <br />
**Steps**:
- Generated the base project from on start.spring.io. 
- Update the Greeting Controller and configuration to set the path for localhost access to the Spring Boot application. 
- Created a HTML file for testing web serving content 
- Compile and run the Demo app by opening localhost:8080/greeting. 
- After successful run the test locally then created the maven package and docker container locally
- Test the Docker container locally once to make sure It run before pushed to Docker Hub. 
- Create the GKE service on Google Cloud and deploy the Spring Boot Application. 
- Uploaded yaml files to map the container deployment with outside world. 
- Open the Google cloud console to test the deployment using curl locahost. 
- Execute the service.yaml to map the port and testing by access the external IP address with mapped port. 


**Reflection**: I created a Dockerfile and yaml files myself instead of copy from your repos to make sure I understand the codes. However, due to typos, It took me some times to figure out the missing dash in the port in service yaml causing issue. I wasn't able to connect via external IP address from GKE but after update the file and redeploy, It worked perfectly fine. 


**Screenshot**:
1. Deploy Spring boot application locally. <br />
![image](https://user-images.githubusercontent.com/48584294/192444154-e50e5271-39e3-4cd2-a6bf-d4064dda3994.png)

2. Testing Docker image deployment. <br />
![image](https://user-images.githubusercontent.com/48584294/192444040-e873a4c8-eff2-4413-8344-4d63961e70e6.png)

3. Testing Docker image deployment on GKE using curl localhost. <br />
![image](https://user-images.githubusercontent.com/48584294/192442420-a3b9d04a-0f86-40a5-929b-f0f48a324d8e.png)

4. Access GKE deployment via external IP address. <br />
![image](https://user-images.githubusercontent.com/48584294/192442536-a3df21c3-b60a-42e5-9379-3d1508b58fab.png)


#### <ins>2. Spring Test Project</ins>
**Description**: In this assignment, students are asked to build a Spring application and testing it via JUnit test. The JUnit test will be integrated to test. <br />
**Steps**:
- Generate zip spring boot initializer application on start.spring.io
- Update the main functionaccording to instruction
- Start localhost server to generate the target file
- Compile and run the Demo app by opening localhost:8080/greeting
- Ouput display on web browser as expected
- Integrated all testing methods for TestWebApplication, SmokeTest, HttpRequesTest, WebLayerTest, WebMockTest
- Added Maven package accordingly and ran mvn install 
- Ran all test and obesrve the output

**Reflection**:
I haven't added Maven package and installed; therefore, at the first time integrating all of the testing methods, It threw a lot of error. I figured out that I need to add them in the external library and ran the mvn install to applied all changes. Also I figured out that Intellij providing the best experiences with Java coding because it provides tools to debug and automatically import the classpart to external library. 

**Screenshot**:
1. HTTPRequestTest. <br />
![image](https://user-images.githubusercontent.com/48584294/192442839-c5e76a2f-24f2-464a-8892-d612007d7708.png)

2. SmokeTest. <br />
![image](https://user-images.githubusercontent.com/48584294/192443143-e5e03093-d3b5-4ba7-a303-127163b4cdf9.png)

3. TestWebApplicationTest. <br />
![image](https://user-images.githubusercontent.com/48584294/192443089-39d69fae-9aef-4697-952a-0f30eaa5af85.png)

4. WebLayerTest. <br />
![image](https://user-images.githubusercontent.com/48584294/192443053-06aa116a-cccd-48be-a65c-10a90c775790.png)

5. WebMockTest. <br />
![image](https://user-images.githubusercontent.com/48584294/192443023-75c6e248-0528-4979-a139-87a38311e2d6.png)



#### <ins>3. Spring Lombok</ins> 
**Description**: In this assignment, student will perform hands on experiences with Spring Boot + Lombok, student will learn how clean that Lombok provides to save many lines of code for repeated code.

**Discussion**:
1. ValAndVarUserDemo. <br />
- Run the demo of using val and var in lombok spring boot. 
- Val, var is to declare a variable as a type of a local variable declaration instead of writing the type. 
- Instead of define userName as String then we use val to delcare the type as the type of the assigned value. Therefore, It's similar to the var money, instead of define BigDecimal then we can use var because var and val works similarly. 
- The result has been display to prove that the val and var declaration works correctly as expected. 

2. FieldLevelGetterSetterDemo. <br />
- Using annotation @getter and @setter to generate default getter and setter method to access private attribute in class. 
- In this case, we have userName and userAge have been defined as private so we want to generate getter and setter. 
- The annotation took care of this process so in the output we can see that It has methods setUserName, getUserAge, getUserName. 
- Especially, the demo only generate specific getter or setter methods according to the attribute that we want. We did that by putting @getter or @setter before you declare. 

3. GetterSetterUserDemo. <br />
- In this case, we have userId, userName and userAge have been defined as private so we want to generate getter and setter. 
- We put the @Getter and @Setter before defined the class, therefore, all private attribute set as private in class. 
- The ouput display that we have in total of 3 Getter methods and 3 Setter methods for 3 private attribute in GetterSetterUserDemo

4. ConstructorUserDemo. <br />
- @AllArgsConstructor will generate the constructor with one parameter for each field require handling.
- NoArgsConstructor will generate the constructor with no argument.  
- In this case, the constructor for ConstructorUserDemo will be generated and set as public and another constructor with no parameter for this class. 

5. DataUserDemo. <br />
- @Data is the combination of @Getter @Setter and others annotation to generate the boilerplate for Plain old java objects. 
- In this case, we have DataUserDemo with 3 private fields, by using @Data, getter and setter methods has been generated for these 3 private fields, constructor also generated. 

6. NonNullUserDemo. <br />
- @NonNull will generate the null-check statement for the field. 
- In this case, it helps to check the ouput of a field is not null. 


**Screenshot**:
1. ValAndVarUserDemo. <br />
![Screen Shot 2022-09-26 at 11 01 23 PM](https://user-images.githubusercontent.com/48584294/192445239-e6966ee7-3642-4f3c-bbb3-816e28801450.png)

2. FieldLevelGetterSetterDemo. <br />
![Screen Shot 2022-09-26 at 11 02 21 PM](https://user-images.githubusercontent.com/48584294/192445376-9d4deb0c-7a7b-43f3-85f3-95628cb7b4f8.png)

3. GetterSetterUserDemo. <br />
![Screen Shot 2022-09-26 at 11 02 33 PM](https://user-images.githubusercontent.com/48584294/192445394-ba1f5795-ac07-419d-984e-caaac20444f2.png)

4. ConstructorUserDemo. <br />
![Screen Shot 2022-09-26 at 11 02 46 PM](https://user-images.githubusercontent.com/48584294/192445423-b76a1bb1-6a38-4d9a-901a-8f0ee1d3d763.png)

5. DataUserDemo. <br />
![Screen Shot 2022-09-26 at 11 02 57 PM](https://user-images.githubusercontent.com/48584294/192445458-05e4d0c0-55e4-4bdf-94e2-39d3f3c06d76.png)

6. NonNullUserDemo. <br />
![Screen Shot 2022-09-26 at 11 03 41 PM](https://user-images.githubusercontent.com/48584294/192445585-aae610ce-b47c-41cf-baf1-ed48c3a98689.png)

7. Proving that these execution occurred on my computer
![spring-lombok](https://user-images.githubusercontent.com/48584294/192446006-e0dfc353-3ca8-4a65-8f7f-f61149914801.gif)
