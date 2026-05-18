# Joseph_Second_J_S_P - Spring Boot REST API

**Course:** Spring Framework Apps - Projects for Everyone  
**University:** Akademia Finansów i Biznesu Vistula  
**Instructor:** mgr inż. Dominik Bielecki  
**Student:** Advaith Joseph

## Project Description
This project is a fully functional RESTful API built with Java and the Spring Boot framework (Task 2). It manages a `Product` entity, allowing clients to perform complete CRUD (Create, Read, Update, Delete) operations. Data is persisted using Spring Data JPA and an H2 in-memory database.

## Technologies Used
* **Java:** 17
* **Framework:** Spring Boot 3.3.5
* **Database:** H2 Database (In-Memory)
* **ORM:** Spring Data JPA / Hibernate
* **Documentation:** Swagger UI / OpenAPI (Springdoc 2.6.0)
* **Build Tool:** Maven

## How to Run the Application
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA.
3. Reload the Maven dependencies from the `pom.xml`.
4. Run the main class: `JosephSecondJSPApplication.java`.
5. The application will start on Tomcat port `8080`.

## Database Configuration
The application uses a lightweight H2 database that stores data in memory during runtime.
* **H2 Console URL:** `http://localhost:8080/console`
* **JDBC URL:** `jdbc:h2:mem:testdb`
* **Username:** `sa`
* **Password:** *(leave blank)*

![H2 Database Login](images/Screenshot%202026-05-18%20062017.png)
*Successful connection to the H2 Database console.*

![H2 Database Table View](images/Screenshot%202026-05-18%20062645.png)
*View of the `PRODUCTS` table after inserting and updating a record.*

## API Endpoints and Use Cases
The API is documented and fully testable via Swagger UI.
* **Swagger UI URL:** `http://localhost:8080/swagger-ui/index.html`

![Swagger UI Overview](images/Screenshot%202026-05-18%20061918.png)
*Main Swagger UI page displaying all available endpoints.*

### 1. Create a Product (`POST /api/v1/products`)
Creates a new product in the database.
* **Success Response:** `201 CREATED`

![POST Request](images/Screenshot%202026-05-18%20062345.png)
*Successful POST request creating "My First Vistula Product".*

### 2. Find All Products (`GET /api/v1/products`)
Retrieves a list of all products currently stored in the database.
* **Success Response:** `200 OK` (Returns an array of Product JSON objects)

![GET All Request](images/Screenshot%202026-05-18%20062446.png)
*Successful GET request retrieving all products.*

### 3. Find Product by ID (`GET /api/v1/products/{id}`)
Retrieves a specific product by its unique ID.
* **Success Response:** `200 OK`

![GET by ID Request](images/Screenshot%202026-05-18%20063428.png)
*Successful GET request retrieving a product by its ID.*

### 4. Update a Product (`PUT /api/v1/products/{id}`)
Updates the details of an existing product.
* **Success Response:** `200 OK`

![PUT Request](images/Screenshot%202026-05-18%20062543.png)
*Successful PUT request updating the product name to "Updated Vistula Product".*

### 5. Delete a Product (`DELETE /api/v1/products/{id}`)
Removes a product from the database.
* **Success Response:** `204 NO CONTENT`

![DELETE Request](images/Screenshot%202026-05-18%20063453.png)
*Successful DELETE request removing a product from the database.*

## Exception Handling
The application features a global `@ControllerAdvice` exception handler. If a client attempts to `GET`, `PUT`, or `DELETE` a product ID that does not exist in the database, the API catches the `ProductNotFoundException` and returns a structured `404 NOT FOUND` JSON response with a custom message.

![Exception Handling](images/Screenshot%202026-05-18%20063515.png)
*Custom 404 ErrorMessageResponse returned when querying a non-existent ID.*