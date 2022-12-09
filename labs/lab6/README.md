# CMPE 172 - Lab #6 - Spring Data
#### <ins>1.Spring JDBC</ins>

**1.1 Description**: This lab will be about build the Spring Application use JdbcTemplate that can access data store in a relational. 

**1.3. Screenshot**:
Output of JDBC application including output of 
- Inserting customers
- Select customers
![Screen Shot 2022-10-24 at 12 49 13 PM](https://user-images.githubusercontent.com/48584294/197613741-2bb7dba1-de8c-48b7-b8be-e6abbe321e8c.png)

Full ouput of Spring JDBC application
![Screen Shot 2022-10-24 at 12 49 43 PM](https://user-images.githubusercontent.com/48584294/197613912-dc0dc76d-d9ea-4c49-8cb9-96c98c806359.png)


#### <ins>2.Spring MySQL </ins>

**1.1 Description**: This lab will be about build the Spring Application use JdbcTemplate that can access data store in a relational. 

**1.3. Screenshot**:
Testing localhost deployment
![Screen Shot 2022-10-31 at 2 57 48 PM](https://user-images.githubusercontent.com/48584294/199118198-348ee6c1-302a-46db-b450-57194c00cd3e.png)

![Screen Shot 2022-10-31 at 2 54 38 PM](https://user-images.githubusercontent.com/48584294/199117723-8947c08e-31ed-4402-8667-e3d6d0061c2c.png)

![Screen Shot 2022-10-31 at 2 55 21 PM](https://user-images.githubusercontent.com/48584294/199117836-3dece61e-9670-4fcd-af09-617690ff7b3f.png)

![Screen Shot 2022-10-31 at 2 56 06 PM](https://user-images.githubusercontent.com/48584294/199117943-20c4e39b-0221-46df-a27b-9790a0a35a53.png)


#### <ins>3.Spring Gumball V3 </ins>
**1.1 Description**: This lab will be about build the Spring Application use JdbcTemplate that can access data store in a relational. 

**1.3. Screenshot**:
Testing localhost deployment
<img width="1441" alt="Screen Shot 2022-10-31 at 11 30 20 PM" src="https://user-images.githubusercontent.com/48584294/199172895-ae97d010-61da-48b2-b488-3e91d33541f8.png">


In order to increasing the coin in the inventory. We will need to update the count in line 189

Insert coin - we will add the existing number amount of coin with one to increase the current amount and then update in the databbase
<img width="794" alt="Screen Shot 2022-10-31 at 11 39 19 PM" src="https://user-images.githubusercontent.com/48584294/199174210-382cc8b7-8935-4123-a176-4b004bd0136c.png">

Turn crank - We will deduct the existing number of coin by one when user turn the crank and then update in the database by calling mysql.save(...)
<img width="765" alt="Screen Shot 2022-10-31 at 11 38 38 PM" src="https://user-images.githubusercontent.com/48584294/199174109-b26ac584-146e-441b-bf71-a7f8b90c11e2.png">


Successfully build images for Spring-Gumball V3 and MySQL
<img width="1130" alt="Screen Shot 2022-10-31 at 11 42 24 PM" src="https://user-images.githubusercontent.com/48584294/199174640-e33d865c-61be-4b0c-b562-82b77c2b5b2c.png">

Successfully run images for Spring-Gumball V3 and MySQL
<img width="1038" alt="Screen Shot 2022-10-31 at 11 45 40 PM" src="https://user-images.githubusercontent.com/48584294/199175239-0a04c94d-faf0-48ff-a55a-b235cde13143.png">


<img width="1332" alt="Screen Shot 2022-10-31 at 11 47 36 PM" src="https://user-images.githubusercontent.com/48584294/199175445-e3be6209-4b04-42a1-8f9a-70c9e73a1faf.png">

Proof of having the container deploy successfull and render on browser. 
<img width="1680" alt="Screen Shot 2022-10-31 at 11 48 34 PM" src="https://user-images.githubusercontent.com/48584294/199175562-e6a7515c-49fc-4bce-b07e-e0670d9b7d1c.png">

Proof of having the Inventory count update on the lower Right corner 
http://www.giphy.com/gifs/YbJrTP0bSEeDsKCcwS
<iframe src="https://giphy.com/embed/YbJrTP0bSEeDsKCcwS" width="480" height="334" frameBorder="0" class="giphy-embed" allowFullScreen></iframe><p><a href="https://giphy.com/gifs/YbJrTP0bSEeDsKCcwS">via GIPHY</a></p>

![aa](https://user-images.githubusercontent.com/48584294/199176820-edbed72b-44ba-4553-a9bb-007884eaf6f6.gif)

